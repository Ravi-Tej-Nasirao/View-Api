package com.learning.theatre.redis.service;/*
 * @author : Ravi Tej Nasirao
 */

import com.learning.theatre.model.ShowPromo;
import com.learning.theatre.redis.repo.ShowPromoCacheRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowPromoCacheService {

    @Autowired
    private ShowPromoCacheRepo showPromoCacheRepo;

    public List<ShowPromo> getPromoByShowId(Long showId){
        return showPromoCacheRepo.findByShowId(showId);
    }
}
