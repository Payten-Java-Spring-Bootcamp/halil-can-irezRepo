package com.homework3.repository.movie_repo;

public interface MovieDao {
    Long save(MovieEntity entity);
    MovieEntity retrieve(Long id);
    void delete(Long id);
}
