package io.zipcoder;

import java.util.ArrayList;

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

}
