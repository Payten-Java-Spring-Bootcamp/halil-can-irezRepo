package com.homework3.controller.request;

import com.homework3.service.watchlist.WatchList;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class WatchListRequest {

    @NotNull
    private Long memberID;

    @NotBlank
    private String watchlistName;

    public WatchList convertToWatchlist(){
        WatchList watchList = new WatchList();
        watchList.setWatchlistName(watchlistName);
        watchList.setMemberID(memberID);
        return watchList;
    }

}
