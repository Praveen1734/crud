package com.sql.connection.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sql.connection.entity.Book;
import com.sql.connection.entity.MyBook;
import com.sql.connection.service.BookService;
import com.sql.connection.service.MyBookService;

@Controller
public class HomeController
{
	@Autowired
	private BookService service;
	
	@Autowired
	private MyBookService mybookservice;
	
	@GetMapping("/book_register")
	public String bookRegister() {
		return "bookRegister";
	}
	@GetMapping("/available_book")
	public ModelAndView getAllBook()
	{
		List<Book> list=service.getAllBook();
		
		return new ModelAndView("bookList","book",list) ;
		
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b)   //@RequestMapping //Book----->entity //b----->object
	{
		service.save(b);                       // calling----->service.save  //service----->bookservice      //save------>service(method)   //b----->object
		return "redirect:/available_book";     //redirect to another page
	}
	
	@GetMapping("/My_Book")
	public ModelAndView getMybook()
	{
		List<MyBook> list=mybookservice.getMyBook();
		
	return new ModelAndView("My_Book","book",list) ;
	}
	
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Book b=service.getBookById(id);
		MyBook mb=new MyBook(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
		mybookservice.saveMyBook(mb);
		return "redirect:/My_Book";
	}
	
	
}
