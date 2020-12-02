package io.zipcoder.interfaces;

import java.util.ArrayList;

public class ZipCodeWilmington {
    static private ArrayList<Instructor> instructorsList;

static {
    String[] instructorNames = { "Leon", "Tariq", "Froilan", "David", "Zach", "Iyasu" };
    for (String instructorName : instructorNames){
        Instructor instructor = new Instructor(instructorName);
        hire(instructor);
    }
}


    public static void hire(Instructor instructorList){
        Instructor newInstructor = new Instructor("");
        instructorsList.add(newInstructor);

    }

    public static ArrayList<Instructor> getInstructors(){
        return instructorsList;
    }

    public static void fireStaff(){
        instructorsList.clear();
    }



}
