/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hyZHO
 */
public class LocalAddress {
    private String local_name;
    private String local_street;
    private String local_aprartment;
    private String local_city;
    private String local_state;
    private int local_zip_code;

    public String getLocal_name() {
        return local_name;
    }

    public void setLocal_name(String local_name) {
        this.local_name = local_name;
    }

    public String getLocal_street() {
        return local_street;
    }

    public void setLocal_street(String local_street) {
        this.local_street = local_street;
    }

    public String getLocal_aprartment() {
        return local_aprartment;
    }

    public void setLocal_aprartment(String local_aprartment) {
        this.local_aprartment = local_aprartment;
    }

    public String getLocal_city() {
        return local_city;
    }

    public void setLocal_city(String local_city) {
        this.local_city = local_city;
    }

    public String getLocal_state() {
        return local_state;
    }

    public void setLocal_state(String local_state) {
        this.local_state = local_state;
    }

    public int getLocal_zip_code() {
        return local_zip_code;
    }

    public void setLocal_zip_code(int local_zip_code) {
        this.local_zip_code = local_zip_code;
    }
    
    @Override
    public String toString(){
        return local_name;
    }
    
}
