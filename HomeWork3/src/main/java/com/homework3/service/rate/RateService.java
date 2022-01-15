package com.homework3.service.rate;

import java.util.Set;

public interface RateService {
    void giveRate(Rate rate);

    Set<Rate> retrivebyMovieId(Long movieId);
}
