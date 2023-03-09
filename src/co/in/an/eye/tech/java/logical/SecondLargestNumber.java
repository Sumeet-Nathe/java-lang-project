package co.in.an.eye.tech.java.logical;

import java.util.Comparator;
import java.util.stream.Stream;

public class SecondLargestNumber {
    public static void main(String[] args) {
        System.out.println("First Way to find Second largest num from array : ");
        Stream.of(1, 3, 5, 7, 9, 2, 4, 6, 8).sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::print);


        System.out.println("\n\nSecond Way to find Second largest num from array : ");
        Stream.of(1, 3, 5, 7, 9, 2, 4, 6, 8).sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::print);
    }
}
