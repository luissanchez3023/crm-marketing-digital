package com.crmmarketingdigitalback2024.commons.helperMapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelperMapper {
    @Bean
    public static ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
