package co.in.an.eye.tech.java.logical;

import java.util.Comparator;
import java.util.stream.Stream;

public class DescendingSortArray {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 1, 0, 2};

        System.out.println("First Way to reverse array : ");
        Stream.of(0, 1, 2, 1, 0, 2).sorted(Comparator.reverseOrder()).forEach(a -> {
            System.out.print(" -> " + a);
        });

        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {

    }
}
