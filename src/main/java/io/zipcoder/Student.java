package io.zipcoder;

import java.util.ArrayList;

public class Student {

    String firstName;
    String lastName;
    ArrayList<Double> examScores = new ArrayList<>(10);

    public Student(String firstName, String lastName, Double[] examScores){
        this.firstName = firstName;
        this.lastName = lastName;

        for(Double i : examScores){
            this.examScores.add(i);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double[] getExamScores() {
        Double[] returnArr = new Double[examScores.size()];
        for(int i=0;i<examScores.size();i++){
            returnArr[i] = examScores.get(i);
        }
        return returnArr;

    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void addExamScore(double examScore){
        this.examScores.add(examScore);
    }

    public void setExamScore(int examNum, double examScore){
        this.examScores.set(examNum,examScore);
    }

    public double getAvgExamScore(){
        double sum = 0;
        for(Double i : examScores){
            sum += i;
        }
        return sum/examScores.size();
    }

    @Override
    public String toString(){
        String returnString = "Student Name: "+firstName+" "+lastName+"\nAverage Score: "+this.getAvgExamScore()+"\nExam Scores: ";
        for(int i=0;i<examScores.size();i++){
            returnString += "\nExam "+(i+1)+" -> "+examScores.get(i);
        }

        return returnString;
    }



}
