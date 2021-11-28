package com.example.demo.RS1Crud;

import java.util.List;
import java.util.stream.Stream;

public interface PersonInterface {


    String getName();
    void setName(String name);
    String getCity();
    void setCity(String city);
    int getId();
    void setId(int id);
    int getAge();
    void setAge(int age);
    public List<Person> peopleList(Person person);
    public void createPerson(Person person);
    public Stream<Person> getPersonById(int id);
    public Stream<Person> getPersonByName(String name);
    public void deletePerson(int id);
    public Stream updatePerson(int id, Person person);

}