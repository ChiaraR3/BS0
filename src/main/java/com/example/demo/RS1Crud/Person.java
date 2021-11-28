package com.example.demo.RS1Crud;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Component
public class Person implements PersonInterface{


    String name;
    String city;
    int age;
    int id;

    /* List<Person> peopleList = new ArrayList();

     Person(String name, String city, int age, int id) {

         this.name = name;
         this.city = city;
         this.age=age;
         this.id=id;
     }

     public int getId() {
         return this.id;
     }

     public String getName() {
         return this.name;
     }

     public String getCity() {
         return this.city;
     }
     public int getAge() {
         return this.age;
     }
     public void setId(int id) {
         this.id = id;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setCity(String city) {
         this.city = city;
     }
     public void setAge(int age) {
         this.age = age;
     } */
      List<Person> peopleList = new ArrayList();


     public void setName(String name) {
         this.name = name;
     }
     public void setCity(String city) {
         this.city = city;
     }
     public void setAge(int age) {
         this.age = age;
     }
     public void setId(int id) {
         this.id = id;
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
     public int getId() {
         return id;}

    @Override
    public List<Person> peopleList(Person person) {
        return peopleList;
    }

    @Override
    public void createPerson(Person person) {
        peopleList.add(person);
    }

    @Override
    public Stream<Person> getPersonById(int id) {
        return peopleList.stream()
                 .filter(per -> per.id == id);
    }



    @Override
    public Stream<Person> getPersonByName(String name) {
        return peopleList.stream()
                   .filter(perN -> perN.name.equals(name));

    }

    @Override
    public void deletePerson(int id) {
        peopleList.removeIf(per -> per.getId() == id);
    }

     /*
        peopleList.stream().map(per->per.getId() == id).collect(Collectors.toList());
        peopleList.remove(id);*/



    @Override
    public Stream updatePerson(int id, Person person) {
     var pers =  peopleList.stream()
            .filter(per ->per.getId()==id)
            .map(people -> {
                if(person.getName() != null){people.setName(person.getName());}
                if(person.getCity() != null ){people.setCity(person.getCity());}
                if(person.getAge() != 0){people.setAge(person.getAge());
                return person;
            })
            .orElseGet(() -> {
            Person.setId(id);
            return peopleList.save(Person);
            });

    }
    }


}
