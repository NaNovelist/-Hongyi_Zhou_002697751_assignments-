/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author hyZHO
 */
public class PersonDatabase {
    private ArrayList<Person> person;
    
    public PersonDatabase(){
        
        this.person = new ArrayList<Person>();
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }

    public Person addPersons(){
        
        Person newPersons = new Person();
        person.add(newPersons);
        return newPersons;
        //use new reference to put new data inside what
    }
  
    public void deletePersons(Person p){
        person.remove(p);
    }
}
