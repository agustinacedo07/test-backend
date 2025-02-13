package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.FilmDTO;
import com.example.demo.services.FilmService;



@RestController
@RequestMapping("/api")
public class FilmsRestController {
	
	@Autowired
	private FilmService filmService;
	
	@GetMapping("/films")
	public List<FilmDTO> getAllFilms() {
		return filmService.getAllFilms();
		
	}
	

}
