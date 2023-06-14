package com.learning.theatre.repo;

import com.learning.theatre.model.ShowPromo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ShowPromoRepo extends JpaRepository<ShowPromo, Long> {

    @Query("select s from ShowPromo s where s.showId = :showId and s.status = :status")
    List<ShowPromo> findByShowIdAndStatus(@Param("showId") Long showId, @Param("status") Integer status);

    @Query("select s from ShowPromo s where s.status = :status")
    List<ShowPromo> getActivePromos(@Param("status") Integer status);

}
