package com.example.demo.RS1Crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class PersonControlerUpdate {
    @Autowired
   PersonInterface personInterface;

    @PutMapping("persona/{id}")
    public PersonInterface updatePerson (@PathVariable int id, @RequestBody Person person){
        personInterface.updatePerson(id, person);
        return personInterface;
    }
}
