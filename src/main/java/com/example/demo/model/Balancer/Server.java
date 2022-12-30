/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

/*
 * *
 * @version 1
 * @moh-m82
 * /
 *
 */

package com.example.demo.model.Balancer;


import com.example.demo.enumeration.Status;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import java.util.Objects;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor

public class Server {

    @Id
    @GeneratedValue (strategy = AUTO)
    private Long id;
    @Column(unique = true)
    @NotEmpty(message ="Ip Address cannot be empty or null")
    private String ipAddress;
    private String name ;
    private String memory ;
    private String type ;
    private Status status  ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Server server = (Server) o;
        return id != null && Objects.equals(id, server.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
