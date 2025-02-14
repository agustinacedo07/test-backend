package com.example.demo.mapper;

import org.mapstruct.Mapper;

import com.example.demo.dto.FilmDTO;
import com.example.demo.entities.Film;

@Mapper(componentModel = "spring")
public interface FilmMapper {
	
	FilmDTO toDto(Film entity);
	
	Film toEntity(FilmDTO dto);

}
