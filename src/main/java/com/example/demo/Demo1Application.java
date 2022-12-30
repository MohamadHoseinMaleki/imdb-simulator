package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

//    CommandLineRunner run (ServerRepo serverRepo){
//        return args -> {
//            serverRepo.save(new Server(null,"192.168.43.1","Windows 11", "16 GB", "Personal PC",
//                    "http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
//        };
//}

}
