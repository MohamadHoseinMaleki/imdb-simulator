/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public class ActorCreationResponseDTO {

    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "brith")
    private Integer brith;
    @JsonProperty(value = "death")
    private Integer death;
    @JsonProperty(value = "Known")
    private Integer known;
    @JsonProperty(value = "Actor_id")
    private Integer ActorId;
}
