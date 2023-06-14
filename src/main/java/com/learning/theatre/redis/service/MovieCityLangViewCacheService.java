package com.learning.theatre.redis.service;


import com.learning.theatre.model.MovieCityLangView;
import com.learning.theatre.redis.repo.MovieCityLangViewCacheRepo;
import com.learning.theatre.repo.MovieCityLangViewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieCityLangViewCacheService {

    @Autowired
    private MovieCityLangViewCacheRepo movieCityLangViewCacheRepo;

    @Autowired
    private MovieCityLangViewRepo movieCityLangViewRepo;

    public List<MovieCityLangView> getShows(Long movieId, Long cityId, Long langId){

        String showId = movieId+"-"+cityId+"-"+langId;

        List<MovieCityLangView> shows = movieCityLangViewCacheRepo.findByMovieCityLangId(String.valueOf(showId));

        if(shows == null || shows.isEmpty()){
            shows = movieCityLangViewRepo.findByMovieIdAndCityIdAndLangId(movieId, cityId, langId);
            movieCityLangViewCacheRepo.save(showId, shows);
        }
        return shows;
    }




}
