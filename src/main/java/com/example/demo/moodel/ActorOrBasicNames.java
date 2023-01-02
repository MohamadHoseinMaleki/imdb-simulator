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


import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Builder

public class ActorOrBasicNames {
    //nConst	primaryName	birthYear	deathYear	primaryProfession	knownForTitles
    @Id
    @GeneratedValue

    private int idnCost;
    private String primaryName;
    private int birthYear;
    private int deathYear;
    private int knownForTitles;

    @Setter
    @ManyToOne
    @JoinColumn(name = "movie_id_t_const")
    private MoviesOrBasics movie;
   // @ManyToMany(mappedBy = "movie")

    private String primaryProfession;
    // relation of project

}
