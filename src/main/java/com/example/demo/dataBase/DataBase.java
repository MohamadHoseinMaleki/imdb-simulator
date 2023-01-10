/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.dataBase;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class DataBase implements JpaRepository {

    @Repository
    public interface BlogRespository extends JpaRepository<Blog, Integer> {

        // custom query to search to blog post by title or content
        List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);
    }
}
