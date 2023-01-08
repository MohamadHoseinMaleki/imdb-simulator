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


import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor


public class PrincipalsTitle {
    //idTConst	ordering	nConst	category	job	characters
    @Id
    @GeneratedValue

    private String idTConst;
    private int ordering;
    private String nConst;
    private String category;
    private String job;
    private String characters;


}

