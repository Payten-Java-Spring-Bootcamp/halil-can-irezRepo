package com.homework3.controller;

import com.homework3.controller.request.WatchListRequest;
import com.homework3.service.watchlist.WatchListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class WatchListController {

    private final WatchListService watchListService;

    @PostMapping("/watchlist")
    public void createWatchList(@RequestBody @Valid WatchListRequest request){
        watchListService.createWatchlist(request.convertToWatchlist());
    }

}
