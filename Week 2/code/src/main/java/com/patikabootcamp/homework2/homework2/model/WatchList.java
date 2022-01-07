package com.patikabootcamp.homework2.homework2.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;


@Getter
@Setter
@Builder
public class WatchList {

    @NotNull
    private int watchList_id;

    @NotNull
    private int memberId;

    @NotBlank
    private String watchList_name;


    private List<Integer> movieIds;


}
