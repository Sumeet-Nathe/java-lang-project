package co.in.an.eye.tech.java.java8.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

public class FilterFunction {
    public static void main(String[] args) {

        System.out.println("Duplicate number from stream :");
        HashSet dups = new HashSet();
        Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15).filter(i -> !dups.add(i)).forEach(i -> System.out.print(i + " "));

        System.out.println("\n\nUnique number from Array :");
        int arr[] = {10, 15, 8, 49, 25, 98, 98, 32, 15};
        HashSet unique = new HashSet();
        Arrays.stream(arr).filter(i -> unique.add(i)).forEach(i -> System.out.print(i + " "));

        System.out.println("\n\nNumber divisible by 2 (Even number) from given streams :");
        Stream.of(2, 2, 4, 3, 5, 134, 53, 53, 13541, 413, 234, 23413, 234, 0)
                .filter(i -> i % 2 == 0)
                /* .map(i -> {
                     System.out.println(i);
                     return i * 2;
                 })*/
                .toList()
                .forEach(i -> System.out.print(i + " "));
    }
}
