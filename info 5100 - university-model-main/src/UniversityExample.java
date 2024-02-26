/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

import College.College;
import College.CollegeOf;
import CourseCatalog.Course;
import CourseCatalog.CourseCatalog;
import CourseSchedule.CourseLoad;
import CourseSchedule.CourseOffer;
import CourseSchedule.CourseSchedule;
import CourseSchedule.SeatAssignment;
import Department.Department;
import Persona.Person;
import Persona.PersonDirectory;
import Persona.StudentDirectory;
import Persona.StudentProfile;
import Persona.Transcript;
import Persona.Faculty.FacultyDirectory;
import Persona.Faculty.FacultyProfile;
import College.CollegeOf;

/**
 *
 * @author kal bugrara
 */
public class UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // CollegeOf college = new CollegeOf("College of Engineering");
        Department department = new Department("Information Systems");
        StudentDirectory sd = department.getStudentDirectory();
        PersonDirectory pd = department.getPersonDirectory();
        FacultyDirectory fd = department.getFacultydirectory();

        // Student side process
        // 10(ten) students in each program.
        Person hongyiPerson = pd.newPerson("0123", "Hongyi");
        StudentProfile hongyi = sd.newStudentProfile(hongyiPerson);
        Transcript hongyisTranscript = hongyi.getTranscript();

        Person emilyPerson = pd.newPerson("0456", "Emily");
        StudentProfile emily = sd.newStudentProfile(emilyPerson);
        Transcript emilysTranscript = emily.getTranscript();

        Person oliverPerson = pd.newPerson("0789", "Oliver");
        StudentProfile oliver = sd.newStudentProfile(oliverPerson);
        Transcript oliversTranscript = oliver.getTranscript();

        Person sophiaPerson = pd.newPerson("0987", "Sophia");
        StudentProfile sophia = sd.newStudentProfile(sophiaPerson);
        Transcript sophiasTranscript = sophia.getTranscript();

        Person danielPerson = pd.newPerson("7654", "Daniel");
        StudentProfile daniel = sd.newStudentProfile(danielPerson);
        Transcript danielsTranscript = daniel.getTranscript();

        Person joshuaPerson = pd.newPerson("4321", "Joshua");
        StudentProfile joshua = sd.newStudentProfile(joshuaPerson);
        Transcript joshuasTranscript = joshua.getTranscript();

        Person miaPerson = pd.newPerson("6543", "Mia");
        StudentProfile mia = sd.newStudentProfile(miaPerson);
        Transcript miasTranscript = mia.getTranscript();

        Person ameliaPerson = pd.newPerson("3210", "Amelia");
        StudentProfile amelia = sd.newStudentProfile(ameliaPerson);
        Transcript ameliasTranscript = amelia.getTranscript();

        Person eliasPerson = pd.newPerson("9876", "Elias");
        StudentProfile elias = sd.newStudentProfile(eliasPerson);
        Transcript eliassTranscript = elias.getTranscript();

        Person lucasPerson = pd.newPerson("2345", "Lucas");
        StudentProfile lucas = sd.newStudentProfile(lucasPerson);
        Transcript lucassTranscript = lucas.getTranscript();

       // Create teacher
        Person BugraraPerson = pd.newPerson("0000", "Bugrara");
        FacultyProfile Bugrara = fd.newFacultyProfile(BugraraPerson);

        Person LiuPerson = pd.newPerson("1111", "Liu");
        FacultyProfile Liu = fd.newFacultyProfile(LiuPerson);

        Person KulkarniPerson = pd.newPerson("2222", "Kulkarni");
        FacultyProfile Kulkarni = fd.newFacultyProfile(KulkarniPerson);

        Person WangPerson = pd.newPerson("3333", "Wang");
        FacultyProfile Wang = fd.newFacultyProfile(WangPerson);

        Person CortezPerson = pd.newPerson("4444", "Cortez");
        FacultyProfile Cortez = fd.newFacultyProfile(CortezPerson);


        // CourseLoad side
        CourseLoad hongyisFall2023 = hongyisTranscript.newCourseLoad("Fall2023");
        CourseLoad hongyisCurrentCourseLoad = hongyi.getCurrentCourseLoad();

        CourseLoad emilysFall2023 = emilysTranscript.newCourseLoad("Fall2023");
        CourseLoad emilysCurrentCourseLoad = emily.getCurrentCourseLoad();

        CourseLoad oliversFall2023 = oliversTranscript.newCourseLoad("Fall2023");
        CourseLoad oliversCurrentCourseLoad = oliver.getCurrentCourseLoad();

        CourseLoad sophiasFall2023 = sophiasTranscript.newCourseLoad("Fall2023");
        CourseLoad sophiasCurrentCourseLoad = sophia.getCurrentCourseLoad();

        CourseLoad danielsFall2023 = danielsTranscript.newCourseLoad("Fall2023");
        CourseLoad danielsCurrentCourseLoad = daniel.getCurrentCourseLoad();

        CourseLoad joshuasFall2023 = joshuasTranscript.newCourseLoad("Fall2023");
        CourseLoad joshuasCurrentCourseLoad = joshua.getCurrentCourseLoad();

        CourseLoad miasFall2023 = miasTranscript.newCourseLoad("Fall2023");
        CourseLoad miasCurrentCourseLoad = mia.getCurrentCourseLoad();

        CourseLoad ameliasFall2023 = ameliasTranscript.newCourseLoad("Fall2023");
        CourseLoad ameliasCurrentCourseLoad = amelia.getCurrentCourseLoad();

        CourseLoad eliassFall2023 = eliassTranscript.newCourseLoad("Fall2023");
        CourseLoad eliassCurrentCourseLoad = elias.getCurrentCourseLoad();

        CourseLoad lucassFall2023 = lucassTranscript.newCourseLoad("Fall2023");
        CourseLoad lucassCurrentCourseLoad = lucas.getCurrentCourseLoad();


        // Course side
        // 5(five) courses per program.
        CourseCatalog courseCatalog = department.getCourseCatalog();
        Course info5001 = courseCatalog.newCourse("info5001", "Application Design & Modeling", 4);  
        Course info5002 = courseCatalog.newCourse("info5002", "Introduction to Python for Information Systems", 4);    
        Course info5100 = courseCatalog.newCourse("info5100", "Application Engineering Development", 4);  
        Course info6150 = courseCatalog.newCourse("info6150", "Web Design and User Experience Engineering", 4);
        Course csye6200 = courseCatalog.newCourse("csye6200", "Concepts of Object-Oriented Design", 4);
        Course csye6202 = courseCatalog.newCourse("csye6202", ". Concepts of Object-Oriented Design with C#", 4);
        Course csye6220 = courseCatalog.newCourse("csye6220", "Enterprise Software Design", 4);
        Course damg6105 = courseCatalog.newCourse("damg6105", "Data Science Engineering with Python", 4);    
        Course damg6210 = courseCatalog.newCourse("damg6210", "Data Management and Database Design", 4);
        Course encp6000 = courseCatalog.newCourse("encp6000", "Career Management for Engineers", 1);  

        //Create a course schedule for Fall 2023 semester

        CourseSchedule csFall2023 = department.newCourseSchedule("Fall2023");
        
        //Create course offerings for each course for the semester

        CourseOffer info5001offerFall2023 = csFall2023.newCourseOffer("info5001");
        CourseOffer info5002offerFall2023 = csFall2023.newCourseOffer("info5002");
        CourseOffer info5100offerFall2023 = csFall2023.newCourseOffer("info5100");
        CourseOffer info6150offerFall2023 = csFall2023.newCourseOffer("info6150");
        CourseOffer csye6200offerFall2023 = csFall2023.newCourseOffer("csye6200");
        CourseOffer csye6202offerFall2023 = csFall2023.newCourseOffer("csye6202");
        CourseOffer csye6220offerFall2023 = csFall2023.newCourseOffer("csye6220");
        CourseOffer damg6105offerFall2023 = csFall2023.newCourseOffer("damg6105");
        CourseOffer damg6210offerFall2023 = csFall2023.newCourseOffer("damg6210");
        CourseOffer encp6000offerFall2023 = csFall2023.newCourseOffer("encp6000");
        
        //Assign teachers to each course offering
        // 1(one) faculty for each course.
        info5001offerFall2023.AssignAsTeacher(Bugrara);
        info5002offerFall2023.AssignAsTeacher(Liu);
        info5100offerFall2023.AssignAsTeacher(Kulkarni);
        info6150offerFall2023.AssignAsTeacher(Wang);
        csye6200offerFall2023.AssignAsTeacher(Cortez);
        csye6202offerFall2023.AssignAsTeacher(Bugrara);
        csye6220offerFall2023.AssignAsTeacher(Liu);
        damg6105offerFall2023.AssignAsTeacher(Cortez);
        damg6210offerFall2023.AssignAsTeacher(Wang);
        encp6000offerFall2023.AssignAsTeacher(Kulkarni);



        //Create 25 seats for each course offering
        info5001offerFall2023.generateSeats(25); // This means 10 students can take this class
        info5002offerFall2023.generateSeats(25);
        info5100offerFall2023.generateSeats(25);
        info6150offerFall2023.generateSeats(25);
        csye6200offerFall2023.generateSeats(25);
        csye6202offerFall2023.generateSeats(25);
        csye6220offerFall2023.generateSeats(25);
        damg6105offerFall2023.generateSeats(25);
        damg6210offerFall2023.generateSeats(25);
        encp6000offerFall2023.generateSeats(25);


        // Register students for the courses
        SeatAssignment hongyiRegisteredForInfo5001 = info5001offerFall2023.assignEmptySeat(hongyisCurrentCourseLoad);
        SeatAssignment hongyiRegisteredForInfo5100 = info5100offerFall2023.assignEmptySeat(hongyisCurrentCourseLoad);
        SeatAssignment hongyiRegisteredForInfo5002 = info5002offerFall2023.assignEmptySeat(hongyisCurrentCourseLoad);

        SeatAssignment emilyRegisteredForInfo5001 = info5001offerFall2023.assignEmptySeat(emilysCurrentCourseLoad);
        SeatAssignment emilyRegisteredForInfo5002 = info5002offerFall2023.assignEmptySeat(emilysCurrentCourseLoad);
        SeatAssignment emilyRegisteredForInfo5100 = info5100offerFall2023.assignEmptySeat(emilysCurrentCourseLoad);

        SeatAssignment oliverRegisteredForInfo5001 = info5001offerFall2023.assignEmptySeat(oliversCurrentCourseLoad);
        SeatAssignment oliverRegisteredForInfo6150 = info6150offerFall2023.assignEmptySeat(oliversCurrentCourseLoad);
        SeatAssignment oliverRegisteredForInfo5100 = info5100offerFall2023.assignEmptySeat(oliversCurrentCourseLoad);

        SeatAssignment sophiaRegisteredForInfo6150 = info6150offerFall2023.assignEmptySeat(sophiasCurrentCourseLoad);
        SeatAssignment sophiaRegisteredForInfo5100 = info5100offerFall2023.assignEmptySeat(sophiasCurrentCourseLoad);
        SeatAssignment sophiaRegisteredForDamg6105 = damg6105offerFall2023.assignEmptySeat(sophiasCurrentCourseLoad);

        SeatAssignment danielRegisteredForInfo5100 = info5100offerFall2023.assignEmptySeat(danielsCurrentCourseLoad);
        SeatAssignment danielRegisteredForDamg6210 = damg6210offerFall2023.assignEmptySeat(danielsCurrentCourseLoad);
        SeatAssignment danielRegisteredForEncp6000 = encp6000offerFall2023.assignEmptySeat(danielsCurrentCourseLoad);

        SeatAssignment joshuaRegisteredForInfo5100 = info5100offerFall2023.assignEmptySeat(joshuasCurrentCourseLoad);
        SeatAssignment joshuaRegisteredForDamg6105 = damg6105offerFall2023.assignEmptySeat(joshuasCurrentCourseLoad);
        SeatAssignment joshuaRegisteredForEncp6000 = encp6000offerFall2023.assignEmptySeat(joshuasCurrentCourseLoad);

        SeatAssignment miaRegisteredForInfo5100 = info5100offerFall2023.assignEmptySeat(miasCurrentCourseLoad);
        SeatAssignment miaRegisteredForInfo6150 = info6150offerFall2023.assignEmptySeat(miasCurrentCourseLoad);
        SeatAssignment miaRegisteredForEncp6000 = encp6000offerFall2023.assignEmptySeat(miasCurrentCourseLoad);

        SeatAssignment ameliaRegisteredForInfo5001 = info5001offerFall2023.assignEmptySeat(ameliasCurrentCourseLoad);
        SeatAssignment ameliaRegisteredForInfo5100 = info5100offerFall2023.assignEmptySeat(ameliasCurrentCourseLoad);
        SeatAssignment ameliaRegisteredForInfo5002 = info5002offerFall2023.assignEmptySeat(ameliasCurrentCourseLoad);

        SeatAssignment eliasRegisteredForInfo5100 = info5100offerFall2023.assignEmptySeat(eliassCurrentCourseLoad);
        SeatAssignment eliasRegisteredForDamg105 = damg6105offerFall2023.assignEmptySeat(eliassCurrentCourseLoad);
        SeatAssignment eliasRegisteredForEncp6000 = encp6000offerFall2023.assignEmptySeat(eliassCurrentCourseLoad);

        SeatAssignment lucasRegisteredForInfo5002 = info5002offerFall2023.assignEmptySeat(lucassCurrentCourseLoad);
        SeatAssignment lucasRegisteredForInfo5100 = info5100offerFall2023.assignEmptySeat(lucassCurrentCourseLoad);
        SeatAssignment lucasRegisteredForInfo6150 = info6150offerFall2023.assignEmptySeat(lucassCurrentCourseLoad);

        
        //Assign grades to students
        hongyiRegisteredForInfo5001.setGrade(4);
        hongyiRegisteredForInfo5100.setGrade(4);
        hongyiRegisteredForInfo5100.setGrade(4);

        emilyRegisteredForInfo5001.setGrade(3.7f);
        emilyRegisteredForInfo5002.setGrade(3.9f);
        emilyRegisteredForInfo5100.setGrade(3.8f);

        oliverRegisteredForInfo5001.setGrade(3.8f);
        oliverRegisteredForInfo6150.setGrade(3.7f);
        oliverRegisteredForInfo5100.setGrade(3.8f);

        sophiaRegisteredForInfo6150.setGrade(4);
        sophiaRegisteredForInfo5100.setGrade(3.8f);
        sophiaRegisteredForDamg6105.setGrade(3.9f);

        danielRegisteredForInfo5100.setGrade(4);
        danielRegisteredForDamg6210.setGrade(3.9f);
        danielRegisteredForEncp6000.setGrade(3.8f);

        joshuaRegisteredForInfo5100.setGrade(3.4f);
        joshuaRegisteredForDamg6105.setGrade(3.6f);
        joshuaRegisteredForEncp6000.setGrade(3.7f);

        miaRegisteredForInfo5100.setGrade(3.7f);
        miaRegisteredForInfo6150.setGrade(3.6f);
        miaRegisteredForEncp6000.setGrade(3.7f);

        ameliaRegisteredForInfo5001.setGrade(3.7f);
        ameliaRegisteredForInfo5100.setGrade(3.7f);
        ameliaRegisteredForInfo5002.setGrade(3.7f);

        eliasRegisteredForInfo5100.setGrade(3.8f);
        eliasRegisteredForDamg105.setGrade(3.7f);
        eliasRegisteredForEncp6000.setGrade(3.7f);

        lucasRegisteredForInfo5002.setGrade(3.2f);
        lucasRegisteredForInfo5100.setGrade(3.3f);
        lucasRegisteredForInfo6150.setGrade(3.4f);


        System.out.println("=========  Part 1  ======== ");
        // System.out.println("1 college: " + college.getCname());
        System.out.println("1 department: " + department.getName());
        System.out.println("5 courses per program & 1 faculty for each course as follows:");
        System.out.println(info5001offerFall2023.getCourseNumber() + ": " + info5001offerFall2023.getCoursename()+ ", " + info5001offerFall2023.getFacultyProfile().getPerson().getName());
        System.out.println(info5002offerFall2023.getCourseNumber() + ": " + info5002offerFall2023.getCoursename()+ ", " + info5002offerFall2023.getFacultyProfile().getPerson().getName());
        System.out.println(info5100offerFall2023.getCourseNumber() + ": " + info5100offerFall2023.getCoursename()+ ", " + info5100offerFall2023.getFacultyProfile().getPerson().getName());
        System.out.println(info6150offerFall2023.getCourseNumber() + ": " + info6150offerFall2023.getCoursename()+ ", " + info6150offerFall2023.getFacultyProfile().getPerson().getName());
        System.out.println(csye6200offerFall2023.getCourseNumber() + ": " + csye6200offerFall2023.getCoursename()+ ", " + csye6200offerFall2023.getFacultyProfile().getPerson().getName());
        System.out.println(csye6202offerFall2023.getCourseNumber() + ": " + csye6202offerFall2023.getCoursename()+ ", " + csye6202offerFall2023.getFacultyProfile().getPerson().getName());
        System.out.println(csye6220offerFall2023.getCourseNumber() + ": " + csye6220offerFall2023.getCoursename()+ ", " + csye6220offerFall2023.getFacultyProfile().getPerson().getName());
        System.out.println(damg6105offerFall2023.getCourseNumber() + ": " + damg6105offerFall2023.getCoursename()+ ", " + damg6105offerFall2023.getFacultyProfile().getPerson().getName());
        System.out.println(damg6210offerFall2023.getCourseNumber() + ": " + damg6210offerFall2023.getCoursename()+ ", " + damg6210offerFall2023.getFacultyProfile().getPerson().getName());
        System.out.println(encp6000offerFall2023.getCourseNumber() + ": " + encp6000offerFall2023.getCoursename()+ ", " + encp6000offerFall2023.getFacultyProfile().getPerson().getName());

        System.out.println("10 students in each program as follows:");
        System.out.println("Student 1, id: " + hongyi.getName() + ", " + hongyi.getPersonId());
        System.out.println("Student 2, id: " + emily.getName() + ", " + emily.getPersonId());
        System.out.println("Student 3, id: " + oliver.getName() + ", " + oliver.getPersonId());
        System.out.println("Student 4, id: " + sophia.getName() + ", " + sophia.getPersonId());
        System.out.println("Student 5, id: " + daniel.getName() + ", " + daniel.getPersonId());
        System.out.println("Student 6, id: " + joshua.getName() + ", " + joshua.getPersonId());
        System.out.println("Student 7, id: " + mia.getName() + ", " + mia.getPersonId());
        System.out.println("Student 8, id: " + amelia.getName() + ", " + amelia.getPersonId());
        System.out.println("Student 9, id: " + elias.getName() + ", " + elias.getPersonId());
        System.out.println("Student 10, id: " + lucas.getName() + ", " + lucas.getPersonId());



        System.out.println("========  Part 2  ======== ");
        
        System.out.println("-------  Course schedule  --------- ");
        System.out.println("Semester: Fall2023");
        System.out.println(info5001offerFall2023.getCourseNumber() + ", " + info5001offerFall2023.getCoursename()+ ", " + info5001offerFall2023.getFacultyProfile().getPerson().getName() + " | " + "seat: " + info5001offerFall2023.getSeatlist().size()+ " | " + info5001offerFall2023.getEmptySeat().getNumber()  +  " registered students" + " | " + ((info5001offerFall2023.getSeatlist().size())-(info5001offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        // System.out.println("number of registered students: " + info5001offerFall2023.getEmptySeat().getNumber());
        // System.out.println("remaining empty seats: " + ((info5001offerFall2023.getSeatlist().size())-(info5001offerFall2023.getEmptySeat().getNumber())));
        System.out.println(info5002offerFall2023.getCourseNumber() + ", " + info5002offerFall2023.getCoursename()+ ", " + info5002offerFall2023.getFacultyProfile().getPerson().getName() + " | " + "seat: " + info5002offerFall2023.getSeatlist().size()+ " | " + info5002offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((info5002offerFall2023.getSeatlist().size())-(info5002offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        System.out.println(info5100offerFall2023.getCourseNumber() + ", " + info5100offerFall2023.getCoursename()+ ", " + info5100offerFall2023.getFacultyProfile().getPerson().getName() + " | " + "seat: " + info5100offerFall2023.getSeatlist().size()+ " | " + info5100offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((info5100offerFall2023.getSeatlist().size())-(info5100offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        System.out.println(info6150offerFall2023.getCourseNumber() + ", " + info6150offerFall2023.getCoursename()+ ", " + info6150offerFall2023.getFacultyProfile().getPerson().getName() + " | " + "seat: " + info6150offerFall2023.getSeatlist().size()+ " | " + info6150offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((info6150offerFall2023.getSeatlist().size())-(info6150offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        System.out.println(csye6200offerFall2023.getCourseNumber() + ", " + csye6200offerFall2023.getCoursename()+ ", " + csye6200offerFall2023.getFacultyProfile().getPerson().getName() + " | " + "seat: " + csye6200offerFall2023.getSeatlist().size()+ " | " + csye6200offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((csye6200offerFall2023.getSeatlist().size())-(csye6200offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        System.out.println(csye6202offerFall2023.getCourseNumber() + ", " + csye6202offerFall2023.getCoursename()+ ", " + csye6202offerFall2023.getFacultyProfile().getPerson().getName() + " | " + "seat: " + csye6202offerFall2023.getSeatlist().size()+ " | " + csye6202offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((csye6202offerFall2023.getSeatlist().size())-(csye6202offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        System.out.println(csye6220offerFall2023.getCourseNumber() + ", " + csye6220offerFall2023.getCoursename()+ ", " + csye6220offerFall2023.getFacultyProfile().getPerson().getName() + " | " + "seat: " + csye6220offerFall2023.getSeatlist().size()+ " | " + csye6220offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((csye6220offerFall2023.getSeatlist().size())-(csye6220offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        System.out.println(damg6210offerFall2023.getCourseNumber() + ", " + damg6210offerFall2023.getCoursename()+ ", " + damg6210offerFall2023.getFacultyProfile().getPerson().getName() + " | " + "seat: " + damg6210offerFall2023.getSeatlist().size()+ " | " + damg6210offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((damg6210offerFall2023.getSeatlist().size())-(damg6210offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        System.out.println(damg6105offerFall2023.getCourseNumber() + ", " + damg6105offerFall2023.getCoursename()+ ", " + damg6105offerFall2023.getFacultyProfile().getPerson().getName() + " | " + "seat: " + damg6105offerFall2023.getSeatlist().size()+ " | " + damg6105offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((damg6105offerFall2023.getSeatlist().size())-(damg6105offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        System.out.println(encp6000offerFall2023.getCourseNumber() + ", " + encp6000offerFall2023.getCoursename()+ ", " + encp6000offerFall2023.getFacultyProfile().getPerson().getName() + " | " + "seat: " + encp6000offerFall2023.getSeatlist().size()+ " | " + encp6000offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((encp6000offerFall2023.getSeatlist().size())-(encp6000offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");



        hongyi.printTranscript();
        emily.printTranscript();
        oliver.printTranscript();
        sophia.printTranscript();
        daniel.printTranscript();
        joshua.printTranscript();
        mia.printTranscript();
        amelia.printTranscript();
        elias.printTranscript();
        lucas.printTranscript();



        System.out.println("========  Part 3  ======== ");

        System.out.println("-------  Course schedule  --------- ");
        System.out.println("Semester: Fall2023");
        System.out.println(info5001offerFall2023.getCourseNumber() + ", " + info5001offerFall2023.getCoursename()+ ", " + info5001offerFall2023.getFacultyProfile().getPerson().getName() + " | " + info5001offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((info5001offerFall2023.getSeatlist().size())-(info5001offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        // System.out.println("number of registered students: " + info5001offerFall2023.getEmptySeat().getNumber());
        // System.out.println("remaining empty seats: " + ((info5001offerFall2023.getSeatlist().size())-(info5001offerFall2023.getEmptySeat().getNumber())));
        System.out.println(info5002offerFall2023.getCourseNumber() + ", " + info5002offerFall2023.getCoursename()+ ", " + info5002offerFall2023.getFacultyProfile().getPerson().getName() + " | " + info5002offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((info5002offerFall2023.getSeatlist().size())-(info5002offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        System.out.println(info5100offerFall2023.getCourseNumber() + ", " + info5100offerFall2023.getCoursename()+ ", " + info5100offerFall2023.getFacultyProfile().getPerson().getName() + " | " + info5100offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((info5100offerFall2023.getSeatlist().size())-(info5100offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        System.out.println(info6150offerFall2023.getCourseNumber() + ", " + info6150offerFall2023.getCoursename()+ ", " + info6150offerFall2023.getFacultyProfile().getPerson().getName() + " | " + info6150offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((info6150offerFall2023.getSeatlist().size())-(info6150offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        System.out.println(csye6200offerFall2023.getCourseNumber() + ", " + csye6200offerFall2023.getCoursename()+ ", " + csye6200offerFall2023.getFacultyProfile().getPerson().getName() + " | " + csye6200offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((csye6200offerFall2023.getSeatlist().size())-(csye6200offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        System.out.println(csye6202offerFall2023.getCourseNumber() + ", " + csye6202offerFall2023.getCoursename()+ ", " + csye6202offerFall2023.getFacultyProfile().getPerson().getName() + " | " + csye6202offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((csye6202offerFall2023.getSeatlist().size())-(csye6202offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        System.out.println(csye6220offerFall2023.getCourseNumber() + ", " + csye6220offerFall2023.getCoursename()+ ", " + csye6220offerFall2023.getFacultyProfile().getPerson().getName() + " | " + csye6220offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((csye6220offerFall2023.getSeatlist().size())-(csye6220offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        System.out.println(damg6210offerFall2023.getCourseNumber() + ", " + damg6210offerFall2023.getCoursename()+ ", " + damg6210offerFall2023.getFacultyProfile().getPerson().getName() + " | " + damg6210offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((damg6210offerFall2023.getSeatlist().size())-(damg6210offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        System.out.println(damg6105offerFall2023.getCourseNumber() + ", " + damg6105offerFall2023.getCoursename()+ ", " + damg6105offerFall2023.getFacultyProfile().getPerson().getName() + " | " + damg6105offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((damg6105offerFall2023.getSeatlist().size())-(damg6105offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");
        System.out.println(encp6000offerFall2023.getCourseNumber() + ", " + encp6000offerFall2023.getCoursename()+ ", " + encp6000offerFall2023.getFacultyProfile().getPerson().getName() + " | " + encp6000offerFall2023.getEmptySeat().getNumber()+  " registered students" + " | " + ((encp6000offerFall2023.getSeatlist().size())-(encp6000offerFall2023.getEmptySeat().getNumber()))+  " remaining empty seats");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to add a new course? (yes/no): ");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("yes")) {
            // 获取新课程信息
            System.out.print("Enter the course name: ");
            String courseName = scanner.next();
            System.out.print("Enter the course number: ");
            String courseNumber = scanner.next();
            System.out.print("Enter the course credit: ");
            int courseCredit = scanner.nextInt();

            // 创建新课程并添加到课程表
            Course newCourse = new Course(courseName, courseNumber, courseCredit);
            // CourseOffer newCourse = csFall2023.newCourseOffer("info5001");
            // CourseSchedule.addCourse(newCourse);

            // 显示更新后的课程表
            CourseSchedule.displaySchedule();
        } else {
            System.out.println("No new course added. Exiting...");
        }


        // System.out.println("-------  Department Revenue  --------- ");
        // System.out.println("Semester: Fall2023");
        // System.out.println("Total revenue of 2023 Fall: $" + csFall2023.calculateTotalRevenues());
        // System.out.println("Department revenue of info 5001: $" + (info5001.getCoursePrice()*info5001offerFall2023.getEmptySeat().getNumber()));
        // System.out.println("Department revenue of info 5002: $" + (info5002.getCoursePrice()*info5002offerFall2023.getEmptySeat().getNumber()));
        // System.out.println("Department revenue of info 5100: $" + (info5100.getCoursePrice()*info5100offerFall2023.getEmptySeat().getNumber()));
        // System.out.println("Department revenue of info 6150: $" + (info6150.getCoursePrice()*info6150offerFall2023.getEmptySeat().getNumber()));
        // System.out.println("Department revenue of damg 6105: $" + (damg6105.getCoursePrice()*damg6105offerFall2023.getEmptySeat().getNumber()));

    }

}
