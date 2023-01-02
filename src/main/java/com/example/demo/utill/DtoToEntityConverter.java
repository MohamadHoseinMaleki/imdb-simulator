/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.utill;

import com.example.demo.Repository.ActorRepository;
import com.example.demo.Repository.MovieRepository;
import com.example.demo.dto.ActorCreationResponseDTO;
import com.example.demo.moodel.ActorOrBasicNames;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


public class DtoToEntityConverter {
    public static ActorOrBasicNames convertToActor(ActorCreationResponseDTO requestDTO) {
        return ActorOrBasicNames.builder().primaryName(requestDTO.getName()).primaryName(requestDTO.getName()).build();
    }
}
