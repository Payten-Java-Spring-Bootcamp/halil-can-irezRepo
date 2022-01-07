package com.patikabootcamp.homework2.homework2.controller;

import com.patikabootcamp.homework2.homework2.model.WatchList;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
public class MemberController {

    @PostMapping("/member")
    @ApiOperation(value="create new watch List")
    public WatchList create_watchList(@RequestBody @Valid  int memberid , @RequestParam String watchlistname){
        return WatchList.builder()
                .memberId(memberid)
                .watchList_id(3)
                .watchList_name(watchlistname)
                .build();

    }
    @ApiOperation(value="add movie to watchlist")
    @PutMapping("/member")
    public WatchList addMovie_to_watchList(@PathVariable int watchList_id , @RequestParam int movie_id ){
        return WatchList.builder()
                .memberId(2)
                .watchList_id(watchList_id)
                .movieIds(List.of(movie_id))
                .watchList_name("currently watch list name")
                .build();
    }



}
