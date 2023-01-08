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

import java.util.Optional;

public class RatingTitleController {

    RatingTitleRepository ratingRepo;


    @GetMapping("getIdTConst")
    public Optional<RatingTitle> findById (@RequestParam Integer integer){
        return ratingRepo.findById(integer);
    }

    @GetMapping("getAverageRating")
    public RatingTitle getAverageRating(@RequestParam Integer doubleNum){
        return (RatingTitle) ratingRepo.findByAverageRating(doubleNum);
    }

    @GetMapping("getNumVotes")
    public RatingTitle getNumVotes(@RequestParam Integer intNum){
        return (RatingTitle) ratingRepo.findByNumVotes(intNum);
    }
}
