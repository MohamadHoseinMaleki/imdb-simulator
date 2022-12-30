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

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@Getter
@Setter
@RequiredArgsConstructor

public class User extends UserDetailsServiceAutoConfiguration {
    private String UserName;
    private String Password;
    private String email;

}
