package com.learning.theatre.repo;

import com.learning.theatre.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RatingRepository extends JpaRepository<Rating, Long>, JpaSpecificationExecutor<Rating> {

}