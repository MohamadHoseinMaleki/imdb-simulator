/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.service.implementaion;

import com.example.demo.repo.Balancer.ServerRepo;
import com.example.demo.service.ServerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.apache.catalina.Server;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.transaction.Transactional;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Optional;
import java.util.Random;

import static com.example.demo.enumeration.Status.SERVER_DOWN;
import static com.example.demo.enumeration.Status.SERVER_UP;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j

public class ServerServiceImplemention implements ServerService {
    private final ServerRepo serverRepo;

    @Override
    public Server create(Server server) {
        log.info("saving new server : {} ", server.getStateName());
//        server.setImageUrl(setServerImageUrl());
//        return serverRepo.save(server);
        return null;
    }

    @Override
    public Server ping(String ipAddress) throws IOException {
        log.info("Pinging server Ip : {} ", ipAddress);
        Server server = (Server) serverRepo.findByIpAddress(ipAddress);
        InetAddress address= InetAddress.getByName(ipAddress);
//        server.getStatus(address.isReachable(10000) ? SERVER_UP : SERVER_DOWN );
//        serverRepo.save(server);
        return server;
    }

    @Override
    public Collection<Server> list(int limit) {
        log.info("Fetching all servers");
        return serverRepo.findAll(0,limit).stream().toList();
    }

    @Override
    public Optional<com.example.demo.model.Balancer.Server> get(long id) {
        log.info("Fetching server by id : {}" ,id);
        return serverRepo.findById(id);
    }

    @Override
    public Server update(Server server) {
        log.info("Updating server  : {}" ,server.getStateName());
        /*return serverRepo.save(server);*/return null;
    }

    @Override
    public Boolean delete(Long id) {
        log.info("Deleting server by id : {}" ,id);
        serverRepo.deleteById(id);
        return Boolean.TRUE;
    }

    private String  setServerImageUrl(){
        String[] imageNames ={"server1.png "};
        return ServletUriComponentsBuilder.fromCurrentContextPath().path("/server/image"+imageNames[new Random().nextInt(1)]).toUriString();
    }
}
