/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.service;


import org.apache.catalina.Server;

import java.io.IOException;
import java.util.Collection;
import java.util.Optional;

public interface ServerService {
    Server create(org.apache.catalina.Server server);
    Collection<Server>list(int limit);
    Server ping(String ipAddress) throws IOException;
    Optional<com.example.demo.model.Balancer.Server> get(long id);
    Server update (Server server);
    Boolean delete(Long id);

}
