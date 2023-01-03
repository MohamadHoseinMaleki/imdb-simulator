/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.utill;

import com.example.demo.dto.ActorCreationResponseDTO;
import com.example.demo.moodel.ActorOrBasicNames;
import com.example.demo.moodel.PrincipalsTitle;
import com.example.demo.moodel.RattingTitle;


public class DtoToEntityConverter {
    public static ActorOrBasicNames convertToActor(ActorCreationResponseDTO requestDTO) {
        return ActorOrBasicNames.builder().primaryName(requestDTO.getName()).primaryName(requestDTO.getName()).build();
    }

    public static PrincipalsTitle convertToMovie(ActorCreationResponseDTO requestDTO) {
        return PrincipalsTitle.builder().nConst(requestDTO.getName()).idTConst(requestDTO.getName()).build();
    }

    public static RattingTitle convertRatingToMovie(ActorCreationResponseDTO requestDTO) {
        return RattingTitle.builder().idTConst(requestDTO.getName()).idTConst(requestDTO.getName()).build();
    }
}
