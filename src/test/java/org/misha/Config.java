package org.misha;

import org.misha.mapper.CarMapper;
import org.misha.mapper.CarMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public CarMapper carMapper() {
        return new CarMapperImpl();
    }

}
