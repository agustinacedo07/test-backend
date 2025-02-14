package com.example.demo.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.FilmDTO;
import com.example.demo.entities.Film;
import com.example.demo.mapper.FilmMapper;
import com.example.demo.repository.FilmRepository;
import com.example.demo.services.FilmService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class FilmServiceImpl implements FilmService{
	
	@Autowired
	private FilmRepository filmRespository;
	
	@Autowired
	private FilmMapper filmMapper;

	@Override
	public List<FilmDTO> getAllFilms() {
		
		List<Film> listFilmsEntity = filmRespository.findAll();
		List<FilmDTO> listFilms = new ArrayList<>();
		
		for(Film film: listFilmsEntity) {
			listFilms.add(filmMapper.toDto(film));
		}
		
		return listFilms;
	}

}
