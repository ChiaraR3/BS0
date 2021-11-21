
package com.example.demo.Inyección;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controlador1 {

    @Autowired
    Persona persona;

    @GetMapping("/controlador1/addPersona")
    public String addPerson (@RequestHeader ("nombre") String name,@RequestHeader ("población") String city,@RequestHeader("edad") int age){
        persona.setName(name);
        persona.setCity(city);
        persona.setAge(age);
        return persona.getName() +persona.getCity()+persona.getAge();
    }


}
