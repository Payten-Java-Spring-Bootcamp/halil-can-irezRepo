package com.homework3.service.movie;

import com.homework3.Genre;
import com.homework3.repository.movie_repo.MovieEntity;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Movie {
    private String name;
    private Genre genre;
    private Integer releaseYear;
    private String director;

    public MovieEntity convertToMovieEntity(){
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setName(getName());
        movieEntity.setDirector(getDirector());
        movieEntity.setReleaseYear(getReleaseYear());
        movieEntity.setGenre(getGenre());
        return movieEntity;
    }

    public static Movie convertfromMovieEntity(MovieEntity entity){
        return Movie.builder()
                .name(entity.getName())
                .genre(entity.getGenre())
                .releaseYear(entity.getReleaseYear())
                .director(entity.getDirector())
                .build();
    }
}
