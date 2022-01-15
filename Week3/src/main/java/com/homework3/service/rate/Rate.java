package com.homework3.service.rate;

import com.homework3.repository.movie_repo.MovieEntity;
import com.homework3.repository.rate_repo.RateEntity;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Setter
@Getter
@EqualsAndHashCode
public class Rate {

    private Long memberId;


    private Long movieId;

    private Integer point;

    private LocalDateTime createdDate;

    public RateEntity convertToRateEntity(MovieEntity movie){


        RateEntity rateEntity = new RateEntity();
        rateEntity.setMemberId(memberId);
        rateEntity.setMovie(movie);
        rateEntity.setPoint(point);
        rateEntity.setCreatedDate(LocalDateTime.now());
        return rateEntity;
    }

    public static Rate convertFromRateEntity(RateEntity rateEntity){
        return Rate.builder()
                .memberId(rateEntity.getMemberId())
                .movieId(rateEntity.getMovie().getId())
                .point(rateEntity.getPoint())
                .createdDate(rateEntity.getCreatedDate())
                .build();
    }

}
