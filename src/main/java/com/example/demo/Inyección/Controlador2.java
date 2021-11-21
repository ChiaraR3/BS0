package com.example.demo.Inyección;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controlador2 {
@Autowired
Persona persona;

    @GetMapping("/controlador2/getPersona")
    public String getPersona(){
        return "Nombre: " +persona.getName() +" " + "Ciudad: " +persona.getCity()+" " + "Edad por dos: "+persona.getAge()*2;
    }
}

