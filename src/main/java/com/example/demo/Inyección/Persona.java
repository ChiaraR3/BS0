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
            return "Chiara";
        }
        public String getCity() {
            return "Bari";
        }
        public int getAge() {
            return 30;
        }
    }


