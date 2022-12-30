/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.Controler;

import com.example.demo.Repository.RatingTitleRepository;
import com.example.demo.moodel.RatingTitle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class RatingTitleController {

    RatingTitleRepository ratingRepo;


    @GetMapping("getIdTConst")
    public RatingTitle getIdTConst(@RequestParam String st){
        return ratingRepo.findByIdTConst(st).orElse(null);
    }

    @GetMapping("getAverageRating")
    public RatingTitle getAverageRating(@RequestParam Double doubleNum){
        return ratingRepo.findByAverageRating(doubleNum).orElse(null);
    }

    @GetMapping("getNumVotes")
    public RatingTitle getNumVotes(@RequestParam Integer intNum){
        return ratingRepo.findByNumVotes(intNum).orElse(null);
    }
}
