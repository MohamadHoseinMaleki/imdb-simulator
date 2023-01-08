/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.Repository;

import com.example.demo.moodel.PrincipalsTitle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PrincipalsTitleRepository extends JpaRepository <PrincipalsTitle, Integer> {

   // Optional<PrincipalsTitleRepository> findByIdTConst(String st);

    //Optional<PrincipalsTitleRepository> findByCategory(String st);
    List<PrincipalsTitleRepository> findByCategory(String category);
   // Optional<PrincipalsTitleRepository> findByOrdering(String st);
    List<PrincipalsTitleRepository>findByOrdering(Integer integer);
   // Optional<PrincipalsTitleRepository> findBynConst(String st);
    List<PrincipalsTitleRepository>findByNConst(String NConst);
    //Optional<PrincipalsTitleRepository> findByJob(String st);
    List<PrincipalsTitleRepository>findByJob(String job);

   // Optional<PrincipalsTitleRepository> findByCharacters(String st);
    List<PrincipalsTitleRepository> findByCharacters(String characters);

}
