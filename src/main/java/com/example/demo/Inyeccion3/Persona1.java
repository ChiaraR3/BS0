package com.example.demo.Inyeccion3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@Component

public class Persona1 implements PersonaInterface{

    String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Bean
    @Qualifier("Persona1")
    PersonaInterface personaInterface1(){
        PersonaInterface pers1 = new Persona1();
        pers1.setName("Hulio");
        return pers1;
    }
}
