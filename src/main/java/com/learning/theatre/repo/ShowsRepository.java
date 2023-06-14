package com.learning.theatre.repo;

import com.learning.theatre.model.Shows;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ShowsRepository extends JpaRepository<Shows, Long>, JpaSpecificationExecutor<Shows> {

}