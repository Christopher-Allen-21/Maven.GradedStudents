package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {

    @Test
    public void getAverageExamScoreForClassTest() {
        Double[] s1Scores = {90.0, 80.0, 100.0, 90.0};
        Double[] s2Scores = {70.0, 80.0, 100.0, 85.0};
        Student s1 = new Student("Chris", "Allen", s1Scores);
        Student s2 = new Student("Bob", "Smith", s2Scores);
        Student[] studentArr = new Student[]{s1, s2};

        Classroom classroom1 = new Classroom(studentArr);


        Double expected = 86.875;
        Double actual = classroom1.getAverageExamScoreForClass();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addStudentTest() {
        Double[] s1Scores = {90.0, 80.0, 100.0, 90.0};
        Double[] s2Scores = {70.0, 80.0, 100.0, 85.0};
        Double[] s3Scores = {100.0, 80.0, 90.0, 90.0};
        Student s1 = new Student("Tony", "Soprano", s1Scores);
        Student s2 = new Student("Chris", "Moltisanti", s2Scores);
        Student s3 = new Student("Pauli", "ItalianName", s3Scores);
        Student[] studentArr = new Student[]{s1, s2};

        Classroom classroom1 = new Classroom(studentArr);
        classroom1.addStudent(s3);

        Student[] expected = new Student[]{s1,s2,s3};
        Student[] actual = classroom1.getStudents();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeStudentTest() {
        Double[] s1Scores = {90.0, 80.0, 100.0, 90.0};
        Double[] s2Scores = {70.0, 80.0, 100.0, 85.0};
        Double[] s3Scores = {100.0, 80.0, 90.0, 90.0};
        Student s1 = new Student("Tony", "Soprano", s1Scores);
        Student s2 = new Student("Chris", "Moltisanti", s2Scores);
        Student s3 = new Student("Pauli", "ItalianName", s3Scores);
        Student[] studentArr = new Student[]{s1,s2,s3};

        Classroom classroom1 = new Classroom(studentArr);
        classroom1.removeStudent("Chris","Moltisanti");

        Student[] expected = new Student[]{s1,s3};
        Student[] actual = classroom1.getStudents();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getStudentsByScoreTest1() {
        Double[] s1Scores = {90.0, 80.0, 100.0, 90.0}; //Average = 90
        Double[] s2Scores = {70.0, 80.0, 100.0, 85.0}; //Average = 83.75
        Double[] s3Scores = {100.0, 80.0, 90.0, 95.0}; //Average = 91.25
        Student s1 = new Student("Tony", "Soprano", s1Scores);
        Student s2 = new Student("Chris", "Moltisanti", s2Scores);
        Student s3 = new Student("Pauli", "ItalianName", s3Scores);
        Student[] studentArr = new Student[]{s2,s1,s3};

        Classroom classroom1 = new Classroom(studentArr);

        Student[] expected = studentArr;
        Student[] actual = classroom1.getStudentsByScore();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStudentsByScoreTest2() {
        Double[] s1Scores = {90.0, 80.0, 100.0, 90.0}; //Average = 90
        Double[] s2Scores = {70.0, 80.0, 100.0, 85.0}; //Average = 83.75
        Double[] s3Scores = {90.0, 80.0, 90.0, 100.0}; //Average = 90
        Student s1 = new Student("Tony", "Soprano", s1Scores);
        Student s2 = new Student("Chris", "Moltisanti", s2Scores);
        Student s3 = new Student("Pauli", "ItalianName", s3Scores);
        Student[] studentArr = new Student[]{s2,s1,s3};

        Classroom classroom1 = new Classroom(studentArr);

        Student[] expected = studentArr;
        Student[] actual = classroom1.getStudentsByScore();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStudentsByScoreTest3() {
        Double[] s1Scores = {90.0,100.0,95.0}; //Average = 95
        Double[] s2Scores = {100.0,90.0,95.0}; //Average = 95
        Double[] s3Scores = {60.0,70.0,80.0}; //Average = 70
        Student s1 = new Student("Tony", "Soprano", s1Scores);
        Student s2 = new Student("Chris", "Moltisanti", s2Scores);
        Student s3 = new Student("Pauli", "ItalianName", s3Scores);
        Student[] studentArr = new Student[]{s3,s1,s2};

        Classroom classroom1 = new Classroom(studentArr);

        Student[] expected = studentArr;
        Student[] actual = classroom1.getStudentsByScore();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void percentileTest() {
        Double[] s1Scores = {10.0};
        Double[] s2Scores = {20.0};
        Double[] s3Scores = {30.0};
        Double[] s4Scores = {40.0};
        Double[] s5Scores = {50.0};
        Double[] s6Scores = {60.0};
        Double[] s7Scores = {70.0};
        Double[] s8Scores = {80.0};
        Double[] s9Scores = {90.0};
        Double[] s10Scores = {100.0};
        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);
        Student s3 = new Student("student", "three", s3Scores);
        Student s4 = new Student("student", "four", s4Scores);
        Student s5 = new Student("student", "five", s5Scores);
        Student s6 = new Student("student", "six", s6Scores);
        Student s7 = new Student("student", "seven", s7Scores);
        Student s8 = new Student("student", "eight", s8Scores);
        Student s9 = new Student("student", "nine", s9Scores);
        Student s10 = new Student("student", "ten", s10Scores);
        Student[] studentArr = new Student[]{s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};

        Classroom classroom1 = new Classroom(studentArr);


        System.out.print(classroom1.getGradeBook());
    }
}
