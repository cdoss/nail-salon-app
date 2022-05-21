package com.cdoss.nailsalon.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NailSalonConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
