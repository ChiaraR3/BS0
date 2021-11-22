package com.example.demo.Inyeccion2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SegundaInyeccion {
    public static void main(String[] args) {
        SpringApplication.run(SegundaInyeccion.class, args);
    }

    @Bean
    CiudadInterface ciudadInterface(){
        return new Ciudad();
    }

}
