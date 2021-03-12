package io.zipcoder;

import java.util.*;

public class Classroom {

    int maxStudents;
    ArrayList<Student> students = new ArrayList<>();

    public Classroom(){

    }

    public Classroom(int maxStudents){
        this.maxStudents = maxStudents;
    }

    public Classroom(Student[] students){
        for(int i=0;i<students.length;i++){
            this.students.add(students[i]);
        }
    }

    public Student[] getStudents(){
        Student[] returnArr = new Student[students.size()];

        for(int i=0;i<students.size();i++){
            returnArr[i] = students.get(i);
        }
        return returnArr;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(String fName,String lName){
        for(int i=0;i<students.size();i++){
            if(students.get(i).firstName==fName && students.get(i).lastName==lName){
                students.remove(i);
            }
        }
    }

    public Student[] getStudentsByScore(){
        Student[] orderedStudents = new Student[students.size()];
        for(int i=0;i<students.size();i++){
            orderedStudents[i] = students.get(i);
        }

        for(int i=0;i<orderedStudents.length-1;i++){
            for(int j=0;j<orderedStudents.length-1-i;j++){
                if(orderedStudents[j].getAvgExamScore()>orderedStudents[j+1].getAvgExamScore()){
                    Student temp = orderedStudents[j];
                    orderedStudents[j] = orderedStudents[j+1];
                    orderedStudents[j+1] = temp;
                }
                else if(orderedStudents[j].getAvgExamScore()==orderedStudents[j+1].getAvgExamScore()){
                    if(orderedStudents[j].lastName.charAt(0)<orderedStudents[j+1].lastName.charAt(0)){
                        Student temp = orderedStudents[j];
                        orderedStudents[j] = orderedStudents[j+1];
                        orderedStudents[j+1] = temp;
                    }
                }
            }

        }
        return orderedStudents;
    }


    public HashMap<Student,Character> getGradeBook(){
        Student[] lowToHigh = getStudentsByScore();
        HashMap<Student,Character> gradeBook = new LinkedHashMap<>();

        for(int i=0;i< lowToHigh.length;i++){
            double percentile = ((i+1)*100.0) / lowToHigh.length;
            if(percentile>89.0){
                gradeBook.put(lowToHigh[i],'A');
            }
            else if(percentile>51.0 && percentile <= 89.0){
                gradeBook.put(lowToHigh[i],'B');
            }
            else if(percentile>30.0 && percentile <= 51.0){
                gradeBook.put(lowToHigh[i],'C');
            }
            else if(percentile>11.0 && percentile <= 30.0){
                gradeBook.put(lowToHigh[i],'D');
            }
            else if(percentile<=11){
                gradeBook.put(lowToHigh[i],'F');
            }
        }
        return gradeBook;
    }




    public Double getAverageExamScoreForClass(){
        double sum = 0;
        double countOfTests = 0;
        for(int i=0;i<students.size();i++){
            for(Double j : students.get(i).getExamScores()){
                sum += j;
                countOfTests++;
            }
        }
        return sum/countOfTests;
    }


}
