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


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@RequiredArgsConstructor


public class RatingTitle {
    //idTConst	averageRating	numVotes
    @Id
    @GeneratedValue

    private String idTConst;
    private Double averageRating;
    private int numVotes;

    @OneToOne(mappedBy= "movie")
    @ToString.Exclude
    MoviesOrBasics movie;
}

