package com.example.demo.Inyeccion3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@Component

public class Persona3 implements PersonaInterface {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Bean
    @Qualifier("Persona3")
    PersonaInterface personaInterface3(){
        PersonaInterface pers3 = new Persona3();
        pers3.setName("Chiara");
        return pers3;
    }
}
