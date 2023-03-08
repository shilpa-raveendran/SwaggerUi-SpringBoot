package com.example.springswaggerUI.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1358158254686906071L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;

	private String bookName;

	private double price;
}
