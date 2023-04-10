package com.example.demo.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled=true)
@Slf4j
public class WebSecurity {
	// antMatchers... 

}
