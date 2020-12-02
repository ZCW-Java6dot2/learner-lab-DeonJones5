package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {


    @Test

    public void testSetName() {
        Person person = new Person();
        person.setName("Person Name");

        Assert.assertEquals(person, person);

    }
    @Test

    public void testConstructor(){
        Person person = new Person();
        person.setName("Person");

        Assert.assertEquals(person, person);
    }
}
