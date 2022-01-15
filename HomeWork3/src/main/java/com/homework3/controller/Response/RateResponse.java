package com.homework3.controller.Response;

import com.homework3.service.rate.Rate;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Builder
public class RateResponse {

    private LocalDateTime createdDate;
    private Long memberId;
    private Long movieId;
    private Integer point;


    public static RateResponse convertFromRate(Rate rate){
        return RateResponse.builder()
                .createdDate(rate.getCreatedDate())
                .movieId(rate.getMovieId())
                .memberId(rate.getMemberId())
                .point(rate.getPoint())
                .build();
    }

    public static List<RateResponse> convertRateResponseListfromRateList(Set<Rate> rateList){
        return rateList.stream()
                .map(RateResponse::convertFromRate)
                //.map(rate -> convertFromRate(rate))
                .collect(Collectors.toList());
    }

}
