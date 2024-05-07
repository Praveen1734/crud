package com.sql.connection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sql.connection.entity.Book;
import com.sql.connection.entity.MyBook;
import com.sql.connection.repo.MyBookRepository;

@Service
public class MyBookService
{
	@Autowired
	private MyBookRepository mybookrepo;
	
	//save mybook in database

	public void saveMyBook(MyBook book)
	{
		mybookrepo.save(book);
	}
	
	public List<MyBook> getMyBook()
	{
		return mybookrepo.findAll();
	}
	
	public void deleteByBook(int id)
	{
		mybookrepo.deleteById(id);
	}
}
