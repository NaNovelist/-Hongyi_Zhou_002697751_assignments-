/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSchedule;

/**
 *
 * @author kal bugrara
 */
public class Seat {
    float grade;
    Boolean occupied; 
    int number;
    SeatAssignment seatassignment; //links back to studentprofile
    CourseOffer courseoffer;
    public Seat (CourseOffer co, int n){
        courseoffer = co;
        number = n;
        occupied = false;
        
    }
    
    public Boolean isOccupied(){
        return occupied;

    }
    public SeatAssignment newSeatAssignment(CourseLoad cl){
        
        seatassignment = new SeatAssignment(cl, this, grade); //links seatassignment to seat
        occupied = true;   
        return seatassignment;
    }
    public CourseOffer getCourseOffer(){
        return courseoffer;
    }
    public int getCourseCredits(){
        return courseoffer.getCreditHours();
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
