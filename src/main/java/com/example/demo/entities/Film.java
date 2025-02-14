package com.example.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "FILMS")
@Data
public class Film {

	@Id
	private Long id;

	private String name;
	
	private String director;
}
