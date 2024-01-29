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
public class HomeAddressDatabase {
    
    private ArrayList<HomeAddress> home;
    
    public HomeAddressDatabase(){
        
        this.home = new ArrayList<HomeAddress>();
    }

    public ArrayList<HomeAddress> getHome() {
        return home;
    }

    public void setHome(ArrayList<HomeAddress> home) {
        this.home = home;
    }
    
    public HomeAddress addNewHomes(){
        
        HomeAddress newHomes = new HomeAddress();
        home.add(newHomes);
        return newHomes;
        //use new reference to put new data inside what
    }
    
    public void deleteHomes(HomeAddress ha){
        home.remove(ha);
    }
}
