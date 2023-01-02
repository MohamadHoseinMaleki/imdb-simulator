/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.Controler;

import com.example.demo.Repository.MovieRepository;
import com.example.demo.exception.Exceptions;
import com.example.demo.moodel.MoviesOrBasics;
import com.example.demo.service.Movei.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MovieController {
    MovieRepository movieRepository;
    MovieService movieService;

    @GetMapping("/movie/getTop200")
    public List<MoviesOrBasics> get200(@RequestBody String movie) {
        List<MoviesOrBasics> List200Top = movieService.get200Top(movie);
        return List200Top;
    }


    @GetMapping("getMovieNum")
    public MoviesOrBasics moviesOrBasics(@RequestParam String movieNum) throws Exceptions {
        return movieRepository.findByMovieNum(movieNum).orElse(null);
    }


    @GetMapping("getId")
    public MoviesOrBasics findById(@RequestParam long movieId) throws Exceptions {
        return movieRepository.findById(movieId).orElse(null);
    }


    @GetMapping("getIsAdult")
    public MoviesOrBasics getIsAdult(@RequestParam int i) throws Exceptions {
        return movieRepository.findIsAdult(i).orElse(null);
    }

    @GetMapping("getStartYear")
    public MoviesOrBasics getStartYear(@RequestParam int startyear) throws Exceptions {
        return movieRepository.findstartYear(startyear).orElse(null);
    }

    @GetMapping("getEndYear")
    public MoviesOrBasics getEndYear(@RequestParam int endYear) throws Exceptions {
        return movieRepository.findendYear(endYear).orElse(null);
    }

    // MovieService moveiservice = new MovieService;
}
