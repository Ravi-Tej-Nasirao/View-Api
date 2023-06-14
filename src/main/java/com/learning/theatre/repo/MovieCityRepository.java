package com.learning.theatre.repo;

import com.learning.theatre.model.MovieCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieCityRepository extends JpaRepository<MovieCity, Long>, JpaSpecificationExecutor<MovieCity> {

    @Query("select mc from MovieCity mc where mc.cityId in :cityIds")
    List<MovieCity> findByCityIds(@Param("cityIds") List<Long> cityIds);
}