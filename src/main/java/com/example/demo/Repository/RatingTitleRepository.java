/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.Repository;

import com.example.demo.moodel.RatingTitle;

import java.util.Date;
import java.util.Optional;

public interface RatingTitleRepository {
    Optional<RatingTitle> findByIdTConst(String st);
    Optional<RatingTitle> findByAverageRating(Double doubl);
    Optional<RatingTitle> findByNumVotes( int intger);
}
