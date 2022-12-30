/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.moodel;/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@RequiredArgsConstructor

public class ActorOrBasicNames {
    //nConst	primaryName	birthYear	deathYear	primaryProfession	knownForTitles
    @Id
    @GeneratedValue

    private int idnCost;
    private String primaryName;
    private int birthYear;
    private int deathYear;

    @ManyToOne
    @JoinColumn(name = "movie_id_t_const")
    private MoviesOrBasics movie;
    @ManyToMany(mappedBy = "movie")

    private String primaryProfession;
    // relation of project
    private int knownForTitles;

}
