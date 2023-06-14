package com.learning.theatre.redis.service;


import com.learning.theatre.model.Lang;
import com.learning.theatre.redis.repo.LangCacheRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LangCacheService {
    @Autowired
    private LangCacheRepo langCacheRepo;

    public List<Lang> findAll() {
        return langCacheRepo.findAll();
    }
}
