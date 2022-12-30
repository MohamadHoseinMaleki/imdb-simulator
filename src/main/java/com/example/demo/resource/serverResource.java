/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.resource;

import com.example.demo.model.Balancer.Response;
import com.example.demo.service.implementaion.ServerServiceImplemention;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.Server;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

import static com.example.demo.enumeration.Status.SERVER_UP;
import static java.util.Map.*;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.IMAGE_PNG_VALUE;

@RestController
@RequestMapping("/server")
@RequiredArgsConstructor



public class serverResource {
    private ServerServiceImplemention serverServiceImpl;

    @GetMapping("/list")
    private ResponseEntity<Response> getServers() {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(of("servers", serverServiceImpl.list(30)))
                        .message("Server retrieved")
                        .status(HttpStatus.OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    @GetMapping("/ping/{ipAddress}")
    private ResponseEntity<Response> pingServer(@PathVariable String ipAddress) throws IOException {
        Server server = serverServiceImpl.ping(ipAddress);
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(of("servers", server))
                        .message(server.getStateName().equals(SERVER_UP) ? "Ping success" : "Ping failed")
                        .status(OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    @PostMapping("/save")
    private ResponseEntity<Response> saveServer(@RequestBody @Valid Server server) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(of("servers", serverServiceImpl.create(server)))
                        .message("Server created")
                        .status(CREATED)
                        .statusCode(CREATED.value())
                        .build()
        );
    }


    @GetMapping("/get/id")
    private ResponseEntity<Response> getServer(@PathVariable("id") Long id) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(of("servers", serverServiceImpl.get(id)))
                        .message("Server retrieved")
                        .status(HttpStatus.OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    @DeleteMapping("/delete/id")
    private ResponseEntity<Response> deleteServer(@PathVariable("id") Long id) {
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(of("deleted", serverServiceImpl.delete(id)))
                        .message("Server deleted")
                        .status(HttpStatus.OK)
                        .statusCode(OK.value())
                        .build()
        );
    }

    @GetMapping(path = "/image/{finalName} ", produces = IMAGE_PNG_VALUE)
    private byte[] getServerImage(@PathVariable("finalName") String fileName) throws IOException {
        return Files.readAllBytes(Paths.get(System.getProperty("user.home") + "Downloads/images/" + fileName));
    }

}
