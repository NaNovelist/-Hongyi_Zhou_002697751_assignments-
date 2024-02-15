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
    private String hStreet;
    private String hUnit;
    private String hCity;
    private String hZip;
    
    public HomeAddress(){
    }
    
    public HomeAddress(String hStreet,String hUnit,String hCity,String hZip){
        this.hStreet = hStreet;
        this.hUnit = hUnit;
        this.hCity = hCity;
        this.hZip = hZip;
    }

    public String gethStreet() {
        return hStreet;
    }

    public void sethStreet(String hStreet) {
        this.hStreet = hStreet;
    }

    public String gethUnit() {
        return hUnit;
    }

    public void sethUnit(String hUnit) {
        this.hUnit = hUnit;
    }

    public String gethCity() {
        return hCity;
    }

    public void sethCity(String hCity) {
        this.hCity = hCity;
    }

    public String gethZip() {
        return hZip;
    }

    public void sethZip(String hZip) {
        this.hZip = hZip;
    }
    
    
    
}
