package com.learning.theatre.repo;


import com.learning.theatre.model.SeatInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SeatInfoRepo extends JpaRepository<SeatInfo, String> {
    @Query("select s from SeatInfo s where s.showId = :showId")
    List<SeatInfo> findByAuditoriumId(@Param("showId") Long showId);

}
