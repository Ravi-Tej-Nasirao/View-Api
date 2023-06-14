package com.learning.theatre.controller;

import com.learning.theatre.model.Lang;
import com.learning.theatre.redis.service.LangCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/view/lang")
public class LanguageController {

    @Autowired
    public LangCacheService langCacheService;

    @GetMapping
    public ResponseEntity<List<Lang>> findAllLanguages(){
        List<Lang> languages =  langCacheService.findAll();
        if(languages == null || languages.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(languages, HttpStatus.OK);
    }

}
