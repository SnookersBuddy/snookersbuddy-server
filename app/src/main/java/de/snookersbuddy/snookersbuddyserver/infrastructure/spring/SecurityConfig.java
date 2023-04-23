package de.snookersbuddy.snookersbuddyserver.infrastructure.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
            .authorizeHttpRequests().requestMatchers("/api/prometheus/**").authenticated().and().httpBasic()
            .and()
            .authorizeHttpRequests().requestMatchers("/**").permitAll()
            .and()
            .build();
    }

    @Bean
    public UserDetailsService users() {
        final UserBuilder users = User.withDefaultPasswordEncoder();
        final UserDetails apiuser = users
            // FIXME: Obviously not ready for production
            .username("prometheus")
            .password("prometheus")
            .roles("MONITORING")
            .build();
        return new InMemoryUserDetailsManager(apiuser);
    }

}
