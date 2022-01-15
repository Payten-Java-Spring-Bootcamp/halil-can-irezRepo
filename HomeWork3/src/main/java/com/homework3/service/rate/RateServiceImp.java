package com.homework3.service.rate;

import com.homework3.repository.movie_repo.MovieDao;
import com.homework3.repository.movie_repo.MovieEntity;
import com.homework3.repository.rate_repo.RateDao;
import com.homework3.repository.rate_repo.RateEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RateServiceImp implements RateService{

    private MovieDao movieDao;
    private final RateDao rateDao;

    @Override
    public void giveRate(Rate rate) {
        MovieEntity movie = movieDao.retrieve(rate.getMovieId());
        RateEntity rateEntity = rate.convertToRateEntity(movie);
        rateDao.giveRate(rateEntity);
    }

    @Override
    public Set<Rate> retrivebyMovieId(Long movieId) {
        MovieEntity movieEntity = movieDao.retrieve(movieId);
        Set<RateEntity> rateEntities=  movieEntity.getRates();
        return rateEntities.stream()
                .map(rateEntity -> Rate.convertFromRateEntity(rateEntity))
                .collect(Collectors.toSet());
    }
}
