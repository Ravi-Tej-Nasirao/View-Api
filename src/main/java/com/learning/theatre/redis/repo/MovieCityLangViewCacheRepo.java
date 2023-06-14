package com.learning.theatre.redis.repo;



import com.learning.theatre.model.MovieCityLangView;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class MovieCityLangViewCacheRepo {

    private final String hashReference = "MovieCityLangView";

    @Resource(name = "redisTemplate")
    private HashOperations<String, String, List<MovieCityLangView>> hashOperations;

    public void save(String movieCityLangId, List<MovieCityLangView> movieCityLangRecords) {
        hashOperations.put(hashReference, movieCityLangId, movieCityLangRecords);
    }

    public List<MovieCityLangView> findByMovieCityLangId(String movieCityLangId) {
        return hashOperations.get(hashReference, movieCityLangId);
    }

}
