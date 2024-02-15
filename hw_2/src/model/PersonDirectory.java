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
public class PersonDirectory {
    private ArrayList<Person> person;
    
    public PersonDirectory(){
        
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
    
    public Person CreatePerson(Person p){
//        Person createPersons = new Person();
        person.add(p);
        return p;
    }

    public Person searchPerson(String text) {
        for(Person person: person){//遍历aaraylist
            if (person.getFirstName().equals(text) ||
            person.getLastName().equals(text) ||
            person.getHomeAddress().gethStreet().equals(text) ||
            person.getWorkAddress().getwStreet().equals(text)) 
            {return person;
        }
    }return null;
    }
}
