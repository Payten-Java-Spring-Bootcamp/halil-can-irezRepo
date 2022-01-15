package com.homework3.service.movie;

import com.homework3.repository.movie_repo.MovieDao;
import com.homework3.repository.movie_repo.MovieEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieServiceImp implements MovieService{


    private final MovieDao movieDao;


    @Override
    public Long saveMovie(Movie movie) {
        MovieEntity movieEntity=movie.convertToMovieEntity();
        return  movieDao.save(movieEntity);
    }

    @Override
    public Movie retrieve(Long id) {

       return  Movie.convertfromMovieEntity(movieDao.retrieve(id));
    }

    @Override
    public void delete(Long id) {

        movieDao.delete(id);
    }

}
