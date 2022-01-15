package com.homework3.service.watchlist;

import com.homework3.repository.member.MemberEntity;
import com.homework3.repository.watchlist.WatchListEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WatchList {

    private Long memberID;
    private String watchlistName;

    public WatchListEntity convertToWatchlistEntity(MemberEntity memberEntity){
        WatchListEntity watchListEntity = new WatchListEntity();
        watchListEntity.setMember(memberEntity);
        watchListEntity.setName(watchlistName);
        return watchListEntity;

    }
}
