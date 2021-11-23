package com.example.demo.Inyeccion3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class ControladorP {
    @Autowired
    @Qualifier("Persona1")
    PersonaInterface personaInterface1;
    @Autowired
    @Qualifier("Persona2")
    PersonaInterface personaInterface2;
    @Autowired
    @Qualifier("Persona3")
    PersonaInterface personaInterface3;


    @GetMapping("/controlador/beans/{bean}")
    public PersonaInterface getPersonaInterface(@PathVariable String bean) {
     if(Objects.equals(bean, "bean1")){
        return personaInterface1;}
        System.out.println(personaInterface1);
     if(Objects.equals(bean, "bean2")){
         return personaInterface2;}
     if(Objects.equals(bean, "bean3")){
         return personaInterface3;}


 return null;

}}
