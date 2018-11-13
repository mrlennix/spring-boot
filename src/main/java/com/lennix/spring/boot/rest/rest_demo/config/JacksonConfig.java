package com.lennix.spring.boot.rest.rest_demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Component
public class JacksonConfig {
	
	@Bean
    @Primary
    public ObjectMapper objectMapper(Jackson2ObjectMapperBuilder builder) {
    ObjectMapper objectMapper = builder.createXmlMapper(false).build();
//    objectMapper.configure(SerializationFeature.WRAP_EXCEPTIONS, true);
    objectMapper.setSerializationInclusion(Include.NON_NULL);
    objectMapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
//    objectMapper.configure(DeserializationFeature.WRAP_EXCEPTIONS, true);
    objectMapper.configure(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS, true);
    

    return objectMapper;
}

}
