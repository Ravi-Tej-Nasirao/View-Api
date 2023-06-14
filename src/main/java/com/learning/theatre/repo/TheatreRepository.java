package com.learning.theatre.repo;

import com.learning.theatre.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TheatreRepository extends JpaRepository<Theatre, Long>, JpaSpecificationExecutor<Theatre> {

}