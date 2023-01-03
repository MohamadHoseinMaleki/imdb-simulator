/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.service;

import com.example.demo.dto.request.LoginRequest;
import com.example.demo.model.Balancer.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {
    List<User> user = new ArrayList<>();

    public void login(LoginRequest loginRequest) {

        //username sreach to data base

        loginRequest.getUserName();
    }
}
