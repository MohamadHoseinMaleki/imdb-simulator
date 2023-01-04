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

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

