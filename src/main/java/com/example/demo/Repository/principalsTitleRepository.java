/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.Repository;

import com.example.demo.moodel.MoviesOrBasics;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface principalsTitleRepository extends JpaRepository <principalsTitleRepository, Integer> {

    Optional<principalsTitleRepository> findByIdTConst(String st);
    Optional<principalsTitleRepository> findByCategory(String st);
    Optional<principalsTitleRepository> findByJob(String st);
}
