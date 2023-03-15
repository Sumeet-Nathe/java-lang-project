package co.in.an.eye.tech.java.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student {
    private int rollNum;
    private String name;

    List<Marksheet> marks;

    public Student() {
    }

    public Student(int rollNum, String name, List<Marksheet> marks) {
        this.rollNum = rollNum;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(115130, "Sumeet",
                Arrays.asList(new Marksheet(1001, 98, 100)
                        , new Marksheet(1002, 97, 100)
                        , new Marksheet(1003, 96, 100)
                        , new Marksheet(1004, 95, 100)
                )));

        students.add(new Student(115119, "Harshad",
                Arrays.asList(new Marksheet(1001, 50, 100)
                        , new Marksheet(1002, 60, 100)
                        , new Marksheet(1003, 70, 100)
                        , new Marksheet(1004, 75, 100)
                )));

        students.add(new Student(115138, "Sumit",
                Arrays.asList(new Marksheet(1001, 98, 100)
                        , new Marksheet(1002, 91, 100)
                        , new Marksheet(1003, 92, 100)
                        , new Marksheet(1004, 90, 100)
                )));

        students.add(new Student(115139, "Gaurav",
                Arrays.asList(new Marksheet(1001, 78, 100)
                        , new Marksheet(1002, 75, 100)
                        , new Marksheet(1003, 76, 100)
                        , new Marksheet(1004, 70, 100)
                )));

        return students;
    }

    public List<Marksheet> getMarks() {
        return marks;
    }

    public void setMarks(List<Marksheet> marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNum == student.rollNum && name.equals(student.name) && marks.equals(student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNum, name, marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
