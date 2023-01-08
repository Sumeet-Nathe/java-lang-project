package co.in.an.eye.tech.java.design.patterns;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class IteratorPattern {
    Object[] elements;

    public IteratorPattern(Object[] elements) {
        this.elements = elements;
    }

    public static void main(String[] args) {
        IteratorPattern itr = new IteratorPattern(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        itr.forEach(System.out::println);

        System.out.println("Using streams : inbuilt methods with sorting : ");
        Stream.of(5, 6, 7, 8, 1, 2, 3, 4, 9).forEachOrdered(System.out::println);
    }

    public void forEach(Consumer<Object> consumer) {
        for (Object element : elements) {
            consumer.accept(element);
        }
        //You can do in following way also
        //Arrays.stream(elements).forEach(consumer::accept);
    }
}
