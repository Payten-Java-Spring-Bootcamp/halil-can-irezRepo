package com.homework3.service.watchlist;

import com.homework3.repository.member.MemberDao;
import com.homework3.repository.member.MemberEntity;
import com.homework3.repository.watchlist.WatchListEntity;
import com.homework3.repository.watchlist.WatchlistDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WatchListImp  implements WatchListService{
    private final MemberDao memberDao;
    private final WatchlistDao watchlistDao;

    @Override
    public void createWatchlist(WatchList watchList) {
        MemberEntity memberEntity =  memberDao.retrieve(watchList.getMemberID());
        WatchListEntity watchListEntity = watchList.convertToWatchlistEntity(memberEntity);
        watchlistDao.create(watchListEntity);
    }
}
