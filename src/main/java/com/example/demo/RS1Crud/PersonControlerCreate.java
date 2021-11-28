package com.example.demo.RS1Crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class PersonControlerCreate {
    @Autowired
    Person personInterface;

    @RequestMapping(value="persona", method= RequestMethod.POST)
    public Person addPerson(@RequestBody Person person) {
        personInterface.setId(person.getId());
        personInterface.setName(person.getName());
        personInterface.setCity(person.getCity());
        personInterface.setAge(person.getAge());
        personInterface.createPerson(person);
        System.out.println("3"+ person);
        return person;
    }
}
