package com.example.demo;

import com.example.demo.enumeration.Status;
import com.example.demo.model.Balancer.Server;
import com.example.demo.repo.Balancer.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    @Bean
    CommandLineRunner run (ServerRepo serverRepo){
        return args -> {
            serverRepo.save(new Server(null,"192.168.43.1","Windows 11", "Personal PC", "http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
            serverRepo.save(new Server(null,"192.168.43.1","Windows 11", "Personal PC", "http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
            serverRepo.save(new Server(null,"192.168.43.1","Windows 11", "Personal PC", "http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
            serverRepo.save(new Server(null,"192.168.43.1","Windows 11", "Personal PC", "http://localhost:8080/server/image/server1.png", Status.SERVER_UP));

        };
}

}
