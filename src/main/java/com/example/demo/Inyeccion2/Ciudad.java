package com.example.demo.Inyeccion2;

import org.springframework.stereotype.Component;

@Component
public class Ciudad implements CiudadInterface{


        String name;
        int population;

        public void setName(String name) {
            this.name = name;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public String getName() {
            return name;
        }

        public int getPopulation() {
            return population;
        }
}

