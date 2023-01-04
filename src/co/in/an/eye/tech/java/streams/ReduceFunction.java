package co.in.an.eye.tech.java.streams;

import java.util.stream.Stream;

public class ReduceFunction {
    public static void main(String[] args) {
        System.out.println("\n\nMin number from streams :");
        Stream.of(10,15,8,49,25,98,98,32,15).reduce((i, j) -> i <= j ? i : j).ifPresent(System.out::println);

        System.out.println("\nAddition of given streams :");
        Stream.of(10,15,8,49,25,98,98,32,15).reduce((i,sum) -> sum + i).ifPresent(System.out::println);

    }
}
