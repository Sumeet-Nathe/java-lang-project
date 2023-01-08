package co.in.an.eye.tech.java.java8.streams;

import java.util.function.Function;
import java.util.function.Supplier;

public class InBuiltFunctionalInterfaces {
    public static void main(String[] args) {
        Supplier<Double> random = () -> Math.random();
        System.out.println("Supplier Function : for getting random num : " + random.get());

        Function<Integer, Float> square = integer -> Float.valueOf(integer * integer);
        System.out.println("Function function : for square of given number : " + square.apply(3));
    }
}
