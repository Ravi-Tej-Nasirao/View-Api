package com.learning.theatre.redis.service;

import com.learning.theatre.model.Movie;
import com.learning.theatre.redis.repo.MoviesOfCityCacheRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieCacheService {

    @Autowired
    private MoviesOfCityCacheRepo movieCacheRepo;

    public List<Movie> getMoviesByCityId(Long cityId) {
        return movieCacheRepo.findByCityId(cityId);
    }
}
