package com.homework3.repository.watchlist;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WatchlistDaoImp implements WatchlistDao{
    private final WatchListRepository watchListRepository;

    @Override
    public void create(WatchListEntity watchListEntity) {
        watchListRepository.save(watchListEntity);
    }
}
