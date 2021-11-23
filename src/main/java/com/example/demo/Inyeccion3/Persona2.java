package com.example.demo.Inyeccion3;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component

public class Persona2 implements PersonaInterface{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bean
    @Qualifier("Persona2")
    PersonaInterface personaInterface2(){
        PersonaInterface pers2 = new Persona2();
        pers2.setName("Rafael");
        return pers2;
    }

}
