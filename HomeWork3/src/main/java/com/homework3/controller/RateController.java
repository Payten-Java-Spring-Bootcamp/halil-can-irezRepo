package com.homework3.controller;

import com.homework3.controller.Response.RateResponse;
import com.homework3.controller.request.RateRequest;
import com.homework3.service.movie.MovieService;
import com.homework3.service.rate.Rate;
import com.homework3.service.rate.RateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Set;

@RestController
@RequiredArgsConstructor
public class RateController {
    private final RateService rateService;
    private final MovieService movieService;

    @PostMapping("/rates")
    public void giveRate(@RequestBody @Valid RateRequest request){

        rateService.giveRate(request.convertToRate());
    }

    @GetMapping("/rate/{movieId}")
    public List<RateResponse> getMovieRatesbyId(@PathVariable Long movieId){
        Set<Rate> rateList = rateService.retrivebyMovieId(movieId);

        return RateResponse.convertRateResponseListfromRateList(rateList);


    }
}
