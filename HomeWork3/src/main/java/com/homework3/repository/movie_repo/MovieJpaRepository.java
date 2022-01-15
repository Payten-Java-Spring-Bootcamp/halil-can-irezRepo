package com.homework3.repository.movie_repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieJpaRepository extends JpaRepository<MovieEntity,Long> {
}
