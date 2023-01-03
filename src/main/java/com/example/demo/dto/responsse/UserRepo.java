/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.dto.responsse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRepo {

    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "family")
    private String sn;
    @JsonProperty(value = "User_id")
    private Integer UserId;

}
