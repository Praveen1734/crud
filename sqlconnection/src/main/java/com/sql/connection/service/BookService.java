package com.sql.connection.service;

import com.sql.connection.entity.*;
import com.sql.connection.repo.BookRepository;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService
{

	//create update delete get(CRUD)
	//contr---serv--res--db--ser---cont-calling function
	
	@Autowired
	private BookRepository bookrepository;
	
	//create 
	public void save(Book b)
	{
		bookrepository.save(b);      // calling bookrepoistory
	}
	
	//read
	public List<Book> getAllBook()
	{
		return bookrepository.findAll();
	}
	
	
	public Book getBookById(int id)
	{
		return bookrepository.findById(id).get();
	}
	
	
	
	
	
}
