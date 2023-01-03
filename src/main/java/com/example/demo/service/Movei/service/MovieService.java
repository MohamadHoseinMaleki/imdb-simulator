/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.service.Movei.service;

import com.example.demo.Repository.MovieRepository;
import com.example.demo.moodel.MoviesOrBasics;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class MovieService {

   final MovieRepository movieRepository;

    public List<MoviesOrBasics> get200Top(String movie) {
        return movieRepository .findAll(movie);
    }

    public MoviesOrBasics addMovie(MoviesOrBasics school) {
        return movieRepository.save(school);
    }

    public List<MoviesOrBasics> getActor(long movieId) {
        MoviesOrBasics movie = movieRepository.findById(movieId).orElseThrow();
        return movie.getMovies();
    }

//
//    public List<MoviesOrBasics> getMovie(String movieId) {
//        MoviesOrBasics  moviesOrBasics =movieRepository.findByMovieNum(movieId).orElse(null);
//        assert moviesOrBasics != null;
//        List<MoviesOrBasics> moviesOrBasics1 = (List<MoviesOrBasics>) Collections.singletonList(moviesOrBasics.getMovies());
//        return moviesOrBasics1;
//    }
}
