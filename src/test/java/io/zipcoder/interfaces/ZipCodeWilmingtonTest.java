package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ZipCodeWilmingtonTest {
    @Before
    public void setUp()  {
        ZipCodeWilmington.fireStaff();

    }

    public void testHire() {
        Instructor newInstructor = new Instructor("");
        newInstructor.getName();

    }


    @Test
    public void testFireStaff() {
        ArrayList<Instructor> instructorsList = new ArrayList<Instructor>();
        instructorsList.isEmpty();

        Assert.assertTrue(instructorsList.isEmpty());
    }
}
