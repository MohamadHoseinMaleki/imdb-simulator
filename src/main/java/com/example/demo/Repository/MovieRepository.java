package com.example.demo.Repository;/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

import com.example.demo.moodel.MoviesOrBasics;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<MoviesOrBasics, Integer> {

   // Optional<MoviesOrBasics> findByIsAdult(Boolean bool);
    List<MoviesOrBasics> findByIsAdult(Boolean bool);

    //Optional<MoviesOrBasics> findById(Long aLong);

    //Optional<MoviesOrBasics> findstartYear(int startYear);
    List<MoviesOrBasics> findByStartYear (int statYear);

//    Optional<MoviesOrBasics> findendYear(int endYear);
    List<MoviesOrBasics>findByEndYear(int endYear);
    //Optional<MoviesOrBasics> findByMovieNum(String movieNum);

  //  List<MoviesOrBasics> findAll(String movie);

}
