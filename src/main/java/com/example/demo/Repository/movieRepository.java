package com.example.demo.Repository;/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

import com.example.demo.moodel.MoviesOrBasics;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface movieRepository extends JpaRepository<MoviesOrBasics, Long> {

    Optional<MoviesOrBasics> findIsAdult(int i);

    Optional<MoviesOrBasics> findById(Long aLong);

    Optional<MoviesOrBasics> findstartYear(int startYear);

    Optional<MoviesOrBasics> findendYear(int endYear);
    Optional<MoviesOrBasics> findByMovieNum(String movieNum);
}
