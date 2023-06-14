package com.learning.theatre.repo;

import com.learning.theatre.model.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AuditoriumRepository extends JpaRepository<Auditorium, Long>, JpaSpecificationExecutor<Auditorium> {

}