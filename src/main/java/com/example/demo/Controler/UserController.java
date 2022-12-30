package com.example.demo.Controler;/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */
import com.example.demo.dto.request.LoginRequest;
import com.example.demo.service.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
public class UserController {

    UserServices userServices ;

    @GetMapping("user/login")
    public void register(
            @RequestBody LoginRequest loginRequest
            ){

        userServices.login(loginRequest);
        return;
    }
}
