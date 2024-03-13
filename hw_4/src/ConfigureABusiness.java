/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/
package Business;

import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;

import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;


/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Information Systems");

// Create Persons
      PersonDirectory persondirectory = business.getPersonDirectory();
// person representing sales organization        
        Person person001 = persondirectory.newPerson("John Smith");
        Person person002 = persondirectory.newPerson("Gina Montana");
        Person person003 = persondirectory.newPerson("Adam Rollen");
        Person person004 = persondirectory.newPerson("Hongyi Zhou");
        Person person005 = persondirectory.newPerson("Jim Dellon");
        Person person006 = persondirectory.newPerson("Anna Shnider");
        
        Person person007 = persondirectory.newPerson("Laura Brown");
        Person person008 = persondirectory.newPerson("Jack While");
        Person person009 = persondirectory.newPerson("Fidelity"); //we use this as customer
        Person person010 = persondirectory.newPerson("Maria Rodriguez");
        Person person011 = persondirectory.newPerson("Chen Wei");
        Person person012 = persondirectory.newPerson("Emily Johnson");
        Person person013 = persondirectory.newPerson("Mohammed Ali");
        Person person014 = persondirectory.newPerson("Alicia Martinez");
        Person person015 = persondirectory.newPerson("David Lee");
        Person person016 = persondirectory.newPerson("Sophie Wang");    

// Create Admins to manage the business
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(person001);
        EmployeeProfile employeeprofile1 = employeedirectory.newEmployeeProfile(person002);
        EmployeeProfile employeeprofile2 = employeedirectory.newEmployeeProfile(person003);
        EmployeeProfile employeeprofile3 = employeedirectory.newEmployeeProfile(person004);
        EmployeeProfile employeeprofile4 = employeedirectory.newEmployeeProfile(person005);
        EmployeeProfile employeeprofile5 = employeedirectory.newEmployeeProfile(person006);
        EmployeeProfile employeeprofile6 = employeedirectory.newEmployeeProfile(person007);
        EmployeeProfile employeeprofile7 = employeedirectory.newEmployeeProfile(person008);
        EmployeeProfile employeeprofile8 = employeedirectory.newEmployeeProfile(person009);
        
        
        StudentDirectory studentdirectory = business.getStudentDirectory();
        StudentProfile studentprofile0 = studentdirectory.newStudentProfile(person007);
        StudentProfile studentprofile1 = studentdirectory.newStudentProfile(person008);
        StudentProfile studentprofile2 = studentdirectory.newStudentProfile(person009);
        StudentProfile studentprofile3 = studentdirectory.newStudentProfile(person010);
        studentdirectory.newStudentProfile(person011);
        StudentProfile studentprofile5 = studentdirectory.newStudentProfile(person012);
        StudentProfile studentprofile6 = studentdirectory.newStudentProfile(person013);
        StudentProfile studentprofile7 = studentdirectory.newStudentProfile(person014);
        StudentProfile studentprofile8 = studentdirectory.newStudentProfile(person015);
        StudentProfile studentprofile9 = studentdirectory.newStudentProfile(person016);
        StudentProfile studentprofile10 = studentdirectory.newStudentProfile(person017);

   
// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "admin", "****"); /// order products for one of the customers and performed by a sales person
        UserAccount ua4 = uadirectory.newUserAccount(studentprofile0, "adam", "****"); /// order products for one of the customers and performed by a sales person

        return business;

    }

}
