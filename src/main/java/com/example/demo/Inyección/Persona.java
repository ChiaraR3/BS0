package com.example.demo.Inyección;

import org.springframework.stereotype.Component;

@Component
public class Persona {

        String name;
        String city;
        int age;


        public void setName(String name) {
            this.name = name;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public void setAge(int age) {
            this.age = age;
        }
       public String getName() {
            return name;
        }
        public String getCity() {
            return city;
        }
        public int getAge() {
            return age;
        }
    }


