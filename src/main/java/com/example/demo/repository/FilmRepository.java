package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
	
	@Query(value = "SELECT * FROM films", nativeQuery = true)
	List<Film> obtenerTodos();

}
