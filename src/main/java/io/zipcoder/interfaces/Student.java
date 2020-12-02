package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(String studentName) {
    }


    public void learn(double numberOfHours) {
        totalStudyTime++;

    }
    public double getTotalStudyTime(){
        return totalStudyTime;
    }
}
