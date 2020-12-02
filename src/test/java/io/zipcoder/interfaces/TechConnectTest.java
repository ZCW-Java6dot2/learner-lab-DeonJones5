package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TechConnectTest {
    public void setUp()  {
        TechConnect.removeStudent();
    }

    @Test
    public void testRemoveStudent() {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.isEmpty();

        Assert.assertTrue(studentList.isEmpty());
    }
    @Test
    public void testRecruitStudent() {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.get(0);
        studentList.add(new Student(""));
        studentList.get(1);

        Assert.assertTrue(studentList.contains(""));
    }

    public void testGetStudents() {
    }

}
