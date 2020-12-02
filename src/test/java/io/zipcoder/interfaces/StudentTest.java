package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;

public class StudentTest extends TestCase {


    public void testImplementation(){
        Student student = new Student("");

        assertTrue(student instanceof Learner);
    }

    public void testInheritance(){
        Student student = new Student("");

        assertTrue(student instanceof Person);
    }

    public void testLearn() {
        Student student = new Student("");
        student.learn(0.0);

        double value = student.getTotalStudyTime();

        assertEquals(student.getTotalStudyTime(), value);

    }

    public void testGetTotalStudyTime() {
    }
}