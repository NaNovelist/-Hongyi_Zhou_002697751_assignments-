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
public class BankAccountDatabase {
    private ArrayList<BankAccount> account;
    
    public BankAccountDatabase(){
        
        this.account = new ArrayList<BankAccount>();
    }

    public ArrayList<BankAccount> getAccount() {
        return account;
    }

    public void setPerson(ArrayList<BankAccount> account) {
        this.account = account;
    }
  
    public BankAccount addAccounts(){
        
        BankAccount newAccounts = new BankAccount();
        account.add(newAccounts);
        return newAccounts;
        //use new reference to put new data inside what
    }
    public void deleteAccounts(BankAccount ba){
        account.remove(ba);
    }
}
