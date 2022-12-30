/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.Repository;

import com.example.demo.moodel.ActorOrBasicNames;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ActorRepository extends JpaRepository <ActorOrBasicNames, Long>{

    Optional<ActorOrBasicNames> findByIdnCost( int intiger );
    Optional<ActorOrBasicNames> findByPrimaryName( String st );
    Optional<ActorOrBasicNames> findByKnownForTitles( int intigger);
    Optional<ActorOrBasicNames> findBirthYear(int intigger);
    Optional<ActorOrBasicNames> findByDeathYear( int intigger);

}
