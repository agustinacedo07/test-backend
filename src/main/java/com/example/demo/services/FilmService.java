package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.FilmDTO;

@Service
public interface FilmService {
	
	List<FilmDTO> getAllFilms();

}
