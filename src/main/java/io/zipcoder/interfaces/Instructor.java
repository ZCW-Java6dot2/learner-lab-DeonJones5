package io.zipcoder.interfaces;

import java.util.Arrays;

public class Instructor extends Person implements Teacher {
    public Instructor(String instructorName) {
    }

    public void teach(Student student, double numberOfHours) {
        student.learn(10);

    }

    public void lecture(Student[] student, double numberOfHours) {
        Student students = new Student("");
        double numberOfHoursPerStudent = numberOfHours / student.length;
        students.learn(numberOfHoursPerStudent);



    }
}
