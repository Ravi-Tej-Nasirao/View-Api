package com.learning.theatre.repo;

import com.learning.theatre.model.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long>, JpaSpecificationExecutor<ShowSeat> {

}