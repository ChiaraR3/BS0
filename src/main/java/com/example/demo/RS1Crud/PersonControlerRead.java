package com.example.demo.RS1Crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonControlerRead {
    @Autowired
    Person personInterface;


    @GetMapping("persona/{id}")
    public Person getPersonId(@PathVariable int id) {
        personInterface.getPersonById(id);
        System.out.println(personInterface);
        return  personInterface;
    }

    @GetMapping("persona/nombre/{name}")
    public Person getPersonName(@PathVariable String name){
        personInterface.getPersonByName(name);
        System.out.println("2"+ personInterface);
         return  personInterface;

    }
}
