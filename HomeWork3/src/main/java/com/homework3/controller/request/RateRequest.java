package com.homework3.controller.request;

import com.homework3.service.rate.Rate;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class RateRequest{

    @NotNull
   private Long memberId;

   @NotNull
   private Long movieId;

   @NotNull
   private Integer point;

    public Rate convertToRate(){
       return Rate.builder()
               .memberId(memberId)
               .movieId(movieId)
               .point(point)
               .build();
    }

}
