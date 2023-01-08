package co.in.an.eye.tech.java.logical;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InvertGivenStringUsingStreams {

    public static void main(String[] args) {
        String sumeet = invert("Sumeet");
        System.out.println("Using map function : " + sumeet);

        String nathe = "NATHE";
        char[] charArray = nathe.toCharArray();
        System.out.println("\nUsing mapToObj function : ");
        IntStream.range(0, charArray.length)
                .mapToObj(i -> charArray[(charArray.length - 1) - i])
                .forEach(c -> System.out.print(c + "-"));

        System.out.println("\n\nOriginal String : " + nathe);
    }

    public static String invert(String s) {
        if (s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        } else {
            return Stream.of(s)
                    .map(word -> new StringBuilder(word).reverse())
                    .collect(Collectors.joining(" "));
        }
    }
}
