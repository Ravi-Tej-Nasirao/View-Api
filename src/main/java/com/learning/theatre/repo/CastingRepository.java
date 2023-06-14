package com.learning.theatre.repo;

import com.learning.theatre.model.Casting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CastingRepository extends JpaRepository<Casting, Long>, JpaSpecificationExecutor<Casting> {

}