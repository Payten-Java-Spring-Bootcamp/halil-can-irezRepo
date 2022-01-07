package com.patikabootcamp.homework2.homework2.model;

import com.patikabootcamp.homework2.homework2.Genre;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Builder
@ApiModel(value = "Movie object", description = "Movie")    // swagger için anatosyon
public class Movie {

    @ApiModelProperty(value = "name field of movie object")
    @NotBlank
    private final String name;

    @ApiModelProperty(value = "genre field of movie object")
    @NotBlank
    private final Genre genre;

    @ApiModelProperty(value = "cast field of movie object")
    @NotEmpty
    private final List<String> cast;

    @ApiModelProperty(value = " relase year field of movie object")
    @NotNull
    private final int relaseYear;

    @ApiModelProperty(value="director field for movie object")
    @NotBlank
    private final String director;



}
