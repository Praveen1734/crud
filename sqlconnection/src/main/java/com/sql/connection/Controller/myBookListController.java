package com.sql.connection.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sql.connection.service.MyBookService;

@Controller
public class myBookListController 
{
	
	@Autowired
	private MyBookService mybookservice;
	

	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		mybookservice.deleteByBook(id);
		return "redirect:/My_Book";
	}
}
