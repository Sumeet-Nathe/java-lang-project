package co.in.an.eye.tech.java.java8.streams;

import java.util.Objects;

public class Student {
    private int rollNum;
    private String name;

    public Student() {
    }

    public Student(int rollNum, String name) {
        this.rollNum = rollNum;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNum == student.rollNum && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNum, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                '}';
    }
}
