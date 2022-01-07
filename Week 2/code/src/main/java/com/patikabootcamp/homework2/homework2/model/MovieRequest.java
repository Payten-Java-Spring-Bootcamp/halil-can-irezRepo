package com.patikabootcamp.homework2.homework2.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Setter
@Getter
@Builder

public class MovieRequest {
    @NotBlank
    private final String name;

    @NotBlank
    private final String genre;

    @NotEmpty
    private final List<String> cast;

    @NotNull
    private final int relaseYear;

    @NotBlank
    private final String director;



}
