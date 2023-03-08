package com.example.springswaggerUI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springswaggerUI.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
