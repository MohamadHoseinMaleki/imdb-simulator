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
import com.example.demo.moodel.RatingTitle;


public class EntityToDTOConverter {
    public static ActorCreationResponseDTO convertToDTO(ActorOrBasicNames actor) {
        return new ActorCreationResponseDTO(actor.getPrimaryName(),actor.getBirthYear(),actor.getDeathYear(), actor.getKnownForTitles(), actor.getIdnCost());
    }

    public static ActorCreationResponseDTO convertPrincipalToDTO(PrincipalsTitle principalsTitle) {
        return new ActorCreationResponseDTO(principalsTitle.getNConst(),principalsTitle.getOrdering(),principalsTitle.getJob(),principalsTitle.getIdTConst());
    }

    public static ActorCreationResponseDTO convertRatingToDTO(RatingTitle rattingTitle) {
        return new ActorCreationResponseDTO(rattingTitle.getIdTConst(),rattingTitle.getNumVotes(),rattingTitle.getIdTConst(),rattingTitle.getIdTConst());
    }

}
