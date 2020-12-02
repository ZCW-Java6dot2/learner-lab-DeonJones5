package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom extends TechConnect {
    ArrayList<Student> students;
    public HashMap<String, Person> getRoster(){
        ArrayList<Student> students = new ArrayList<Student>();
        TechConnect.getStudents();
        ZipCodeWilmington.getInstructors();

        return null;
    }
}
