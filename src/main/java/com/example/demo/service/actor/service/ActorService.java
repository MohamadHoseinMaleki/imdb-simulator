/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.service.actor.service;

import com.example.demo.Repository.ActorRepository;
import com.example.demo.Repository.MovieRepository;
import com.example.demo.dto.ActorCreationResponseDTO;
import com.example.demo.moodel.ActorOrBasicNames;
import com.example.demo.moodel.MoviesOrBasics;
import com.example.demo.utill.DtoToEntityConverter;
import com.example.demo.utill.EntityToDTOConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
@AllArgsConstructor
public class ActorService {
    private final ActorRepository actorRepo;
    private final MovieRepository movieRepo;

    @PostMapping("/actor")
    public ActorCreationResponseDTO addStudent(ActorCreationResponseDTO requestDTO) {
        ActorOrBasicNames actor  = DtoToEntityConverter.convertToActor(requestDTO);
        MoviesOrBasics movie = movieRepo.findById(Long.valueOf(requestDTO.getActorId())).orElseThrow();
        actor .setMovie(movie);
        return EntityToDTOConverter.convertToDTO(actorRepo.save(actor));
    }

}
