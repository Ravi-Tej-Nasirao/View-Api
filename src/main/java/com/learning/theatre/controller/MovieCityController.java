package com.learning.theatre.controller;

import com.learning.theatre.model.Movie;
import com.learning.theatre.redis.service.MovieCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieCityController {

    @Autowired
    private MovieCacheService movieCacheService;

    @GetMapping("/v1/view/{cityId}")
    public ResponseEntity<List<Movie>> getMoviesByCity(@PathVariable("cityId") Long cityId){
        List<Movie> cityMovies = movieCacheService.getMoviesByCityId(cityId);
        if(!CollectionUtils.isEmpty(cityMovies) ){
            return new ResponseEntity<>(cityMovies, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
