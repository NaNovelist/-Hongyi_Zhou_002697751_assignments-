/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package College;

import Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class College {
    ArrayList<Department> departments;
    public String college;
    
    public College(String name){
        departments = new ArrayList();
    }

   
    public String getCollege(){
    return college;
    }
    public void setCollege(String college){
        this.college = college;
    }

}
