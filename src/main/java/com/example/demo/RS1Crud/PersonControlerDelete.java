package com.example.demo.RS1Crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class PersonControlerDelete {

    @Autowired
    Person personInterface;


    @DeleteMapping("persona/{id}")
    public String personDelete(@PathVariable int id){

        personInterface.deletePerson(id);

        return "ID "+ id + " cancelado";
}
}

