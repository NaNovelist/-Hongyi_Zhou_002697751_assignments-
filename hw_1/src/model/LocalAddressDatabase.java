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
public class LocalAddressDatabase {
    private ArrayList<LocalAddress> local;
    
    public LocalAddressDatabase(){
        
        this.local = new ArrayList<LocalAddress>();
    }

    public ArrayList<LocalAddress> getLocal() {
        return local;
    }

    public void setLocal(ArrayList<LocalAddress> local) {
        this.local = local;
    }

    public LocalAddress addNewLocals() {
        LocalAddress newLocals = new LocalAddress();
        local.add(newLocals);
        return newLocals;
    }

    public void deleteLocals(LocalAddress la) {
        local.remove(la);
    }
    
}
