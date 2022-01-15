package com.homework3.repository.movie_repo;

import com.homework3.Genre;
import com.homework3.repository.rate_repo.RateEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "movie")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    private Integer releaseYear;

    @Column(nullable = false)
    private String director;

    @OneToMany(mappedBy = "movie")          // veri tabanında bu field olmayacak
    private Set<RateEntity> rates;
}
