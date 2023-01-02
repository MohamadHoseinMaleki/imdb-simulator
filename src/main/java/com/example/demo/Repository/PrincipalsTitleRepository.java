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

public interface PrincipalsTitleRepository extends JpaRepository <PrincipalsTitleRepository, Integer> {

    Optional<PrincipalsTitleRepository> findByIdTConst(String st);
    Optional<PrincipalsTitleRepository> findByCategory(String st);
    Optional<PrincipalsTitleRepository> findByOrdering(String st);
    Optional<PrincipalsTitleRepository> findBynConst(String st);
    Optional<PrincipalsTitleRepository> findByJob(String st);
    Optional<PrincipalsTitleRepository> findByCharacters(String st);

}
