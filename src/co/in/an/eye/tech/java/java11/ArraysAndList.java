package co.in.an.eye.tech.java.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ArraysAndList {
    public static void main(String[] args) {
        List list = Arrays.asList("Sumeet","Manoj","Shobha","Snehal");
        System.out.println(list);

        String [] stringArray =(String[]) list.toArray(String[]::new);
        Arrays.stream(stringArray).forEach(System.out::println);

        System.out.println("Removed empty elements from String list : ");
        List listWithEmptyElements = Arrays.asList("Java"," ","C-Programming","Python"," ");
        listWithEmptyElements.stream()
                .filter(Predicate.not(String::isBlank))//Predicate.not() : method added in java 11
                .forEach(System.out::println);
    }
}
