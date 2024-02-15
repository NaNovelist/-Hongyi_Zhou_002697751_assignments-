/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hyZHO
 */
public class WorkAddress {
    private String wStreet;
    private String wUnit;
    private String wCity;
    private String wZip;
    
    public WorkAddress(){
        this.wStreet = wStreet;
        this.wUnit = wUnit;
        this.wCity = wCity;
        this.wZip = wZip;
    }
    
    public WorkAddress(String wStreet,String wUnit,String wCity,String wZip){
        this.wStreet = wStreet;
        this.wUnit = wUnit;
        this.wCity = wCity;
        this.wZip = wZip;
    }

    public String getwStreet() {
        return wStreet;
    }

    public void setwStreet(String wStreet) {
        this.wStreet = wStreet;
    }

    public String getwUnit() {
        return wUnit;
    }

    public void setwUnit(String wUnit) {
        this.wUnit = wUnit;
    }

    public String getwCity() {
        return wCity;
    }

    public void setwCity(String wCity) {
        this.wCity = wCity;
    }

    public String getwZip() {
        return wZip;
    }

    public void setwZip(String wZip) {
        this.wZip = wZip;
    }
    
    
    
}
