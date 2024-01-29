/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hyZHO
 */
public class HomeAddress {
    private String name;
    private String street;
    private String aprartment;
    private String city;
    private String state;
    private int zip_code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAprartment() {
        return aprartment;
    }

    public void setAprartment(String aprartment) {
        this.aprartment = aprartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
