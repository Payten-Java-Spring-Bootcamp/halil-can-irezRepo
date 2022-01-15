package com.homework3.controller;

import com.homework3.controller.Response.MovieResponse;
import com.homework3.controller.request.MovieRequest;
import com.homework3.service.movie.Movie;
import com.homework3.service.movie.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;


    @PostMapping("/movies")
    @ResponseStatus(HttpStatus.CREATED)
    public Long addMovie(@RequestBody @Valid MovieRequest newMovie){
        Movie movie=newMovie.convertToMovie();
        return movieService.saveMovie(movie);

    }

    @GetMapping("/movies/{movieId}")
    @ResponseStatus(HttpStatus.OK)
    public MovieResponse retrieve(@PathVariable Long movieId){
          Movie movie= movieService.retrieve(movieId);
          return MovieResponse.convertFromMovie(movie);
    }

    @DeleteMapping("/movies/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        movieService.delete(id);

    }
}
