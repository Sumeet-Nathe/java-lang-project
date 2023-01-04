package co.in.an.eye.tech.java.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceFunction {
    public static void main(String[] args) {
        System.out.println("\n\nMin number from streams :");
        Stream.of(10,15,8,49,25,98,98,32,15).reduce((i, j) -> i <= j ? i : j).ifPresent(System.out::println);

        System.out.println("\nAddition of given streams :");
        Stream.of(10,15,8,49,25,98,98,32,15).reduce((i,sum) -> sum + i).ifPresent(System.out::println);

        System.out.println("\nFind max from given stream using operator :");
        Stream.of(2, 2, 4, 3, 5, 1).reduce((i, j) -> i >= j ? i : j).ifPresent(System.out::println);

        System.out.println("Streams are lazy :");
        Stream<Integer> integerStream = Stream.of(2, 2, 4, 3, 5, 134, 53, 53, 13541, 413, 234, 23413, 234, 0)
                .filter(i -> i % 2 == 0)
                .peek(i->System.out.println("Even number : "+i))
                .filter(i->i>4);

        System.out.println("Filtering Done : before : collect : function call!");
        collect(integerStream);
    }

    private static void collect(Stream<Integer> integerStream) {
        List<Integer> evenGT4 = integerStream.collect(Collectors.toList());
        System.out.println("Filtering Done : inside : collect : function call!");
        evenGT4.forEach(System.out::println);
    }
}
