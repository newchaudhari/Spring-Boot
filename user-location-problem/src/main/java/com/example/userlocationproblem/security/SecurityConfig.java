package com.example.userlocationproblem.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    //This class gives permission that which user can use which method
    //ADMIN can do all the CRUD operation and READER can only use Get method
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails admin = User.withUsername("admin")  //ADMIN username:admin
                .password("admin")  //ADMIN password: admin
                .roles(UserRoles.ADMIN)
                .build();

        UserDetails reader = User.withUsername("reader")  //READER username: reader
                .password("reader")   ////READER password: reader
                .roles(UserRoles.READER)
                .build();

        return new InMemoryUserDetailsManager(admin, reader);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
