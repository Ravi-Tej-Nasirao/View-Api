package com.learning.theatre.repo;

import com.learning.theatre.model.Lang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LangRepo extends JpaRepository<Lang, Long>, JpaSpecificationExecutor<Lang> {

}
