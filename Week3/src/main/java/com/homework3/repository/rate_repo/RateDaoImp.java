package com.homework3.repository.rate_repo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RateDaoImp implements  RateDao{

    private final RateRepository rateRepository;

    @Override
    public void giveRate(RateEntity entity) {
        rateRepository.save(entity);
    }
}
