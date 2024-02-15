/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hyZHO
 */
public class Person {
    private String firstName;
    private String lastName;
    private String SSN;
    private String LicenseNumber;
    private HomeAddress homeAddress;
    private WorkAddress workAddress;
    
    public Person(){
        
    }
    public Person(String firstName,String lastName,String SSN,String LicenseNumber,HomeAddress homeAddress, WorkAddress workAddress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.LicenseNumber = LicenseNumber;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getLicenseNumber() {
        return LicenseNumber;
    }

    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    public WorkAddress getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(WorkAddress workAddress) {
        this.workAddress = workAddress;
    }

    public HomeAddress getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(HomeAddress homeAddress) {
        this.homeAddress = homeAddress;
    }
    
    public HomeAddress addNewHomes(String hStreet,String hUnit,String hCity,String hZip){
        HomeAddress newHomes = new HomeAddress();
        newHomes.sethStreet(hStreet);//现在set的是传进的参数
        newHomes.sethUnit(hUnit);
        newHomes.sethCity(hCity);
        newHomes.sethZip(hZip);
        this.homeAddress = newHomes;//没有存在person class，所以信息丢失了
        return newHomes;
    }
    
    public WorkAddress addNewWorks(String wStreet,String wUnit,String wCity,String wZip){        
        WorkAddress newWorks = new WorkAddress();
        newWorks.setwStreet(wStreet);
        newWorks.setwUnit(wUnit);
        newWorks.setwCity(wCity);
        newWorks.setwZip(wZip);
        this.workAddress = newWorks;
        return newWorks;
    }
    
    @Override
    public String toString() {
        return firstName;
    }
}
