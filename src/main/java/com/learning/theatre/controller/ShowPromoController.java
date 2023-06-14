package com.learning.theatre.controller;

import com.learning.theatre.model.ShowPromo;
import com.learning.theatre.redis.service.ShowPromoCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/v1/view/promo")
public class ShowPromoController {

    @Autowired
    private ShowPromoCacheService showPromoCacheService;

    @GetMapping("/{showId}")
    public ResponseEntity<List<ShowPromo>> getPromoByShow(@PathParam("showId") Long showId){
        List<ShowPromo> promos = showPromoCacheService.getPromoByShowId(showId);
        if (promos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(promos, HttpStatus.OK);
    }

}
