package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void constructorTest1(){
        Double[] scores = new Double[]{90.0,80.0,100.0,90.0};
        Student student1 = new Student("Chris","Allen",scores);

        String expected = "Chris";
        String actual = student1.getFirstName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void constructorTest2(){
        Double[] scores = new Double[]{90.0,80.0,100.0,90.0};
        Student student1 = new Student("Chris","Allen",scores);

        String expected = "Allen";
        String actual = student1.getLastName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void constructorTest3(){
        Double[] scores = new Double[]{90.0,80.0,100.0,90.0};
        Student student1 = new Student("Chris","Allen",scores);

        Double[] expected = scores;
        Double[] actual = student1.getExamScores();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setFirstNameTest(){
        Double[] scores = new Double[]{90.0,80.0,100.0,90.0};
        Student student1 = new Student("Chris","Allen",scores);

        student1.setFirstName("Bob");
        String expected = "Bob";
        String actual = student1.getFirstName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setLastNameTest(){
        Double[] scores = new Double[]{90.0,80.0,100.0,90.0};
        Student student1 = new Student("Chris","Allen",scores);

        student1.setLastName("Smith");
        String expected = "Smith";
        String actual = student1.getLastName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getAverageTest(){
        Double[] scores = new Double[]{90.0,80.0,100.0,90.0};
        Student student1 = new Student("Chris","Allen",scores);

        Double expected = 90.0;
        Double actual = student1.getAvgExamScore();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addExamTest(){
        Double[] scores = new Double[]{90.0,80.0,100.0,90.0};
        Student student1 = new Student("Chris","Allen",scores);

        student1.addExamScore(100);
        Double[] newScores = new Double[]{90.0,80.0,100.0,90.0,100.0};

        Double[] expected = newScores;
        Double[] actual = student1.getExamScores();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setExamTest(){
        Double[] scores = new Double[]{90.0,80.0,100.0,90.0};
        Student student1 = new Student("Chris","Allen",scores);

        student1.setExamScore(1,100);
        scores[1] = 100.0;
        Double[] expected = scores;
        Double[] actual = student1.getExamScores();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void toStringTest(){
        Double[] scores = new Double[]{90.0,80.0,100.0,90.0};
        Student student1 = new Student("Chris","Allen",scores);

        String expectedString = "Student Name: Chris Allen\nAverage Score: 90.0\nExam Scores: \nExam 1 -> 90.0\nExam 2 -> 80.0\nExam 3 -> 100.0\nExam 4 -> 90.0";
        String actual = student1.toString();

        Assert.assertEquals(expectedString,actual);
    }

}