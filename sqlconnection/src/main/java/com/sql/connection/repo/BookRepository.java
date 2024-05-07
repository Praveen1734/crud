package com.sql.connection.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sql.connection.entity.Book;

@Repository
//create read update delete
public interface BookRepository extends JpaRepository<Book,Integer>  
{

}
