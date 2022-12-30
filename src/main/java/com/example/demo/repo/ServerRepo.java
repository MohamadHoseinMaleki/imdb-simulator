/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.repo;


import com.example.demo.model.Balancer.Server;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);

    Collection<org.apache.catalina.Server> findAll(int i, int limit);
}
