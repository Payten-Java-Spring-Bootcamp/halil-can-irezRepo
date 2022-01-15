package com.homework3.controller.request;
import com.homework3.Genre;
import com.homework3.service.movie.Movie;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
public class MovieRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String genre;


    private Integer releaseYear;

    @NotNull
    private String director;

    public Movie convertToMovie(){
        return Movie.builder()
                .name(name)
                .director(director)
                .genre(Genre.valueOf(genre))
                .releaseYear(releaseYear)
                .build();
    }
}
