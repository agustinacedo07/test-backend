package com.example.demo.mapper;

import com.example.demo.dto.FilmDTO;
import com.example.demo.entities.Film;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-13T16:59:38+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class FilmMapperImpl extends FilmMapper {

    @Override
    public FilmDTO entityToDTO(Film entity) {
        if ( entity == null ) {
            return null;
        }

        FilmDTO filmDTO = new FilmDTO();

        return filmDTO;
    }
}
