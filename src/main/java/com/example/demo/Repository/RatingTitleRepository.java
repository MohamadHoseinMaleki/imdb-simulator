/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.Repository;

import com.example.demo.moodel.PrincipalsTitle;
import com.example.demo.moodel.RatingTitle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RatingTitleRepository extends JpaRepository<RatingTitle, Integer> {

    List<RatingTitle>findByAverageRating(Double averageRating);
    //Optional<RatingTitle> findByAverageRating(Double doubl);
   // Optional<RatingTitle> findByNumVotes( int intger);
    List<RatingTitle>findByNumVotes(Integer integer);
}
