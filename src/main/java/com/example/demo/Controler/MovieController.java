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
import org.springframework.web.bind.annotation.*;

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


//    @GetMapping("getMovieNum")
//    public MoviesOrBasics moviesOrBasics(@RequestParam int movieId) throws Exceptions {
//        return movieRepository.findById(movieId).orElse(null);
//    }


    @GetMapping("getId")
    public MoviesOrBasics findById(@RequestParam int movieId) throws Exceptions {
        return movieRepository.findById(movieId).orElse(null);
    }


    @GetMapping("getIsAdult")
    public List<MoviesOrBasics> getIsAdult(@RequestParam boolean i) throws Exceptions {
        return movieRepository.findByIsAdult(i);
    }

    @GetMapping("getStartYear")
    public List<MoviesOrBasics> getStartYear(@RequestParam int startyear) throws Exceptions {
        return movieRepository.findByStartYear(startyear);
    }

    @GetMapping("getEndYear")
    public List<MoviesOrBasics> getEndYear(@RequestParam int endYear) throws Exceptions {
        return movieRepository.findByEndYear(endYear);
    }

    // in emtiazi way : have add movie
    @PostMapping("/addMovies")
    private MoviesOrBasics addMovie(@RequestBody MoviesOrBasics school) {
        return movieService.addMovie(school);
    }

    @GetMapping("/schools/{id}/Actor")
    private List<MoviesOrBasics> getStudents(@PathVariable Integer id) {
        return movieService.getActor(id);
    }


    // MovieService moveiservice = new MovieService;
}
