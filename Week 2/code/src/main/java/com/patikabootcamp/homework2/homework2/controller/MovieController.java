package com.patikabootcamp.homework2.homework2.controller;


import com.patikabootcamp.homework2.homework2.Genre;
import com.patikabootcamp.homework2.homework2.model.Movie;

import com.patikabootcamp.homework2.homework2.model.MovieRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(value = "Documentation for MovieController") // https://springfox.github.io/springfox/docs/current/
public class MovieController{

    @PostMapping("/movie")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    @ApiOperation(value="add new movie")
    public Movie createMovie(@RequestBody @Valid @ApiParam(value = "information about movie to be add") MovieRequest newMovie){

        return Movie.builder()
                .name(newMovie.getName())
                .genre(Genre.valueOf(newMovie.getGenre()))
                .cast(newMovie.getCast())
                .director(newMovie.getDirector())
                .relaseYear(newMovie.getRelaseYear()).build();
    }

    @GetMapping("/movie")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value="get movie by name")
    public Movie getMovie(@RequestParam @ApiParam(value = "information about movie to be get") String movieName){
        return Movie.builder()
                .name(movieName)
                .genre(Genre.valueOf("DRAMA"))
                .cast(List.of("cast1 name","cast2 name","......"))
                .director("director name")
                .relaseYear(2021).build();
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/movie/{movieName}")
    @ApiOperation(value="delete new movie")
    public void deletemovie(@PathVariable String movieName){

    }
}
