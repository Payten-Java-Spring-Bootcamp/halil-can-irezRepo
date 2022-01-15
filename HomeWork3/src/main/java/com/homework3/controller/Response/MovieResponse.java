package com.homework3.controller.Response;

import com.homework3.service.movie.Movie;
import lombok.Builder;


@Builder
public class MovieResponse {

    private String name;

    private Integer releaseYear;
    private String director;

    public static MovieResponse convertFromMovie(Movie movie){
        return MovieResponse.builder()
                .name(movie.getName())
                .releaseYear(movie.getReleaseYear())
                .director(movie.getDirector())
                .build();
        }
    }



