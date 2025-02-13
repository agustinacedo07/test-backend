package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.dto.FilmDTO;
import com.example.demo.entities.Film;


@Mapper(componentModel = "spring")
public abstract class FilmMapper {

	
	public abstract FilmDTO entityToDTO(Film entity);


}
