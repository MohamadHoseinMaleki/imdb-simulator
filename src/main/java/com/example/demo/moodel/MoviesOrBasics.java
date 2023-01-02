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

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.aspectj.apache.bcel.classfile.Module;

import javax.persistence.*;

@Getter
@Setter
@Entity
@RequiredArgsConstructor

public class MoviesOrBasics implements Comparable {
    //idTConst	titleType	primaryTitle	originalTitle	isAdult	startYear	endYear	runtimeMinutes	genres
    @Id
    @GeneratedValue

    private int idTConst;
    private String titleType;
    private String primaryTitle;
    private int isAdult;
    private int startYear;
    private int endYear;
    private int runtimeMinutes;
    private String genres;
    @ManyToOne
    @JoinColumn(name = "movie_id_t_const")
    MoviesOrBasics movie;
    @OneToMany(mappedBy = "movie")
    @ToString.Exclude
    private List <MoviesOrBasics> movies;


    public Comparator<? super MoviesOrBasics> setEndYear(int endYear) {
        this.endYear = endYear;
        return null;
    }

    public void setRuntimeMinutes(int runtimeMinutes) {
        this.runtimeMinutes = runtimeMinutes;
    }

    @Override
    public int compareTo(Object o) {
        MoviesOrBasics music = (MoviesOrBasics) o;

        if (endYear > music.endYear) {
            return 1;
        } else {
            if (endYear < music.endYear) {
                return -1;
            } else {
                return 0;
            }
        }
    }



}

