package co.in.an.eye.tech.java.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DistinctFunction {

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "Sumeet", Arrays.asList(new Marksheet(1001, 87, 100))));
        students.add(new Student(11, "Sumit", Arrays.asList(new Marksheet(1001, 87, 100))));
        students.add(new Student(12, "Nilesh", Arrays.asList(new Marksheet(1001, 87, 100))));
        students.add(new Student(13, "Anirudh", Arrays.asList(new Marksheet(1001, 87, 100))));
        students.add(new Student(9, "Sumeet", Arrays.asList(new Marksheet(1001, 87, 100))));
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = getStudents();
        long count = students.stream().distinct().count();
        System.out.println("Total distinct students : count : " + count);


        Student s1 = new Student(9, "Sumeet", Arrays.asList(new Marksheet(1001, 87, 100)));
        Student s2 = new Student(9, "Sumeet", Arrays.asList(new Marksheet(1001, 87, 100)));

        students.add(s1);
        students.add(s2);

        HashMap<Student, Integer> hashMap = new HashMap<>();
        hashMap.put(s1, 2);
        hashMap.put(s2, 3);

        System.out.println("s1 :" + hashMap.get(s1));
        System.out.println("s2 :" + hashMap.get(s2));

        //As we have implemented equals and hashcode in Employee class
        //Above statements doesn't matter because those will be pointing to
        //same object just reference will be different

        long countNew = students.stream().distinct().count();
        System.out.println("Total distinct students : countNew : " + countNew);

        Student s3 = new Student(19, "Sumeet", Arrays.asList(new Marksheet(1001, 87, 100)));
        students.add(s3);
        long countNew1 = students.stream().distinct().count();
        System.out.println("Total distinct students : countNew1 : " + countNew1);
    }
}
