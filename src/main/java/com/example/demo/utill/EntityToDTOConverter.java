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

public class EntityToDTOConverter {
    public static ActorCreationResponseDTO convertToDTO(ActorOrBasicNames actor) {
        return new ActorCreationResponseDTO(actor.getPrimaryName(),actor.getBirthYear(),actor.getDeathYear(), actor.getKnownForTitles(), actor.getIdnCost());
    }
}
