package com.example.demo.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "films")
public class Film {

	@Id
	private Long id;
	
	@Column(name = "created_at")
	private LocalDateTime creado;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "director")
	private String director;
}
