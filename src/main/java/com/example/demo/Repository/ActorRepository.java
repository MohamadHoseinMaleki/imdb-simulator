/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.Repository;

import com.example.demo.moodel.ActorOrBasicNames;
import org.attoparser.dom.INestableNode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ActorRepository extends JpaRepository <ActorOrBasicNames, Integer>{

    //Optional<ActorOrBasicNames> findByIdnCost( int intiger );
    //Optional<ActorOrBasicNames> findByPrimaryName( String st );
    List<ActorRepository> findByPrimaryName(String st);
   // Optional<ActorOrBasicNames> findByKnownForTitles( int intigger);
    List<ActorRepository> findByKnownForTitles(int i);
   // Optional<ActorOrBasicNames> findBirthYear(int intigger);
    List<ActorRepository>findByBirthYear(int i);
   // Optional<ActorOrBasicNames> findByDeathYear( int intigger);
    List<ActorRepository>findByDeathYear(int i);

}
