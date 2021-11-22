package com.example.demo.Inyeccion2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorC1 {

    @Autowired
    CiudadInterface ciudadInterface;

    @PostMapping("/controlador1/addCiudad")
    public CiudadInterface  addCiudad(@RequestBody Ciudad ciudad) {

        ciudadInterface.setName(ciudad.getName());
        ciudadInterface.setPopulation(ciudad.getPopulation());

        return ciudadInterface;
    }

    @GetMapping("/controlador1/getCiudad")
    public CiudadInterface getCiudad() {
       return ciudadInterface;
    }
}

