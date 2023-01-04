/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.service.ratting;

import com.example.demo.Repository.MovieRepository;
import com.example.demo.dto.ActorCreationResponseDTO;
import com.example.demo.moodel.MoviesOrBasics;
import com.example.demo.moodel.RatingTitle;
import com.example.demo.utill.DtoToEntityConverter;
import com.example.demo.utill.EntityToDTOConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
@AllArgsConstructor
public class RattingService {

    final RatingTitle rating;
    final MovieRepository movieRepo;
//    @PostMapping("/RatingTitle")
//    public ActorCreationResponseDTO addRate(ActorCreationResponseDTO requestDTO) {
//        RatingTitle ratingTitle = DtoToEntityConverter.convertRatingToMovie(requestDTO);
//        MoviesOrBasics movie = movieRepo.findById(Long.valueOf(requestDTO.getActorId())).orElseThrow();
//        movie.setMovie(movie);
//        return EntityToDTOConverter.convertRatingToDTO(ratingTitle);
//    }
}
