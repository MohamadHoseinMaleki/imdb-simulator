/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.service.principals;

import com.example.demo.Repository.MovieRepository;
import com.example.demo.Repository.PrincipalsTitleRepository;
import com.example.demo.dto.ActorCreationResponseDTO;
import com.example.demo.moodel.MoviesOrBasics;
import com.example.demo.moodel.PrincipalsTitle;
import com.example.demo.utill.DtoToEntityConverter;
import com.example.demo.utill.EntityToDTOConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
@AllArgsConstructor
public class principalsService {
    final PrincipalsTitleRepository principalsRepo;
    final MovieRepository movieRepo;

    @PostMapping("/principal")
    public ActorCreationResponseDTO addPrinc(ActorCreationResponseDTO requestDTO) {
        PrincipalsTitle principal = DtoToEntityConverter.convertToMovie(requestDTO);
        MoviesOrBasics movie = movieRepo.findById(Long.valueOf(requestDTO.getActorId())).orElseThrow();
        movie.setMovie(movie);
        return EntityToDTOConverter.convertPrincipalToDTO((principal));
    }

}
