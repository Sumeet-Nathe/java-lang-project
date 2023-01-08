package co.in.an.eye.tech.java.java8.streams;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsForCountingOccurrences {

    public static void main(String[] args) {
        System.out.println("String occurrences in given String Array");
        Map<String, Long> counter = Stream.of("Sum", "Mai", "Appa", "Tai", "Tai", "Tai", "Tai", "Tai", "Tai")
                .collect(Collectors.groupingBy(p -> p, Collectors.counting()));
        System.out.println(counter);

        IntSummaryStatistics summary = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Given int array summary :\n" + summary);

        Integer collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum of given array using collect : " + collect);

        Integer mapToInt = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of given array using mapToInt : " + mapToInt);
    }
}
