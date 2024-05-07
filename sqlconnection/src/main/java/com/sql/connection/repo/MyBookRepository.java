package com.sql.connection.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sql.connection.entity.MyBook;


@Repository
public interface MyBookRepository extends JpaRepository<MyBook,Integer>
{

}
