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


    public HashMap<Student,Integer> getGradeBook(){
        HashMap<Student,Integer> returnHashMap = new HashMap<>();
        Double[] avgScore = new Double[students.size()];

        for(int i=0;i<students.size();i++){
            avgScore[i] = students.get(i).getAvgExamScore();
        }

        int count, percent;
        for(int i=0;i<avgScore.length;i++){
            count = 0;
            for(int j=0; j<avgScore.length;j++){
                if(avgScore[i]>avgScore[j]){
                    count++;
                }
            }
            percent = (count * 100) / (avgScore.length-1);
            returnHashMap.put(students.get(i),percent);
        }

        return returnHashMap;

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
