/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface principalsTitleRepository extends JpaRepository <principalsTitleRepository, Integer> {

    Optional<principalsTitleRepository> findByIdTConst(String st);
    Optional<principalsTitleRepository> findByCategory(String st);
    Optional<principalsTitleRepository> findByOrdering(String st);
    Optional<principalsTitleRepository> findBynConst(String st);
    Optional<principalsTitleRepository> findByJob(String st);
    Optional<principalsTitleRepository> findByCharacters(String st);

}
