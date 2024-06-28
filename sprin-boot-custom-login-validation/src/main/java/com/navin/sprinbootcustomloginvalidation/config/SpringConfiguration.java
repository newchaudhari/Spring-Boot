/*
package com.navin.sprinbootcustomloginvalidation.config;

import com.navin.sprinbootcustomloginvalidation.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(
                        (request) -> request.requestMatchers("/", "/user").
                                permitAll()
                                .anyRequest()
                                .authenticated())
                .formLogin((form) -> form.loginPage("/login")
                        .permitAll())
                .logout(LogoutConfigurer::permitAll);
        return httpSecurity.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        return new UserService();
    }
}
*/
