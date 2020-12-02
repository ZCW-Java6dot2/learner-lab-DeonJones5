package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest extends Person implements Teacher {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor("");

        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor("");

        Assert.assertTrue(instructor instanceof Person);
    }


    @Test
    public void testTeach() {
        Student student = new Student("");
        Instructor instructor = new Instructor("");
        instructor.teach(new Student(""), 0.0);

        double value = student.getTotalStudyTime();

    }

    public void testLecture() {
    }

    public void teach(Student student, double numberOfHours) {

    }

    public void lecture(Student[] student, double numberOfHours) {

    }
}
