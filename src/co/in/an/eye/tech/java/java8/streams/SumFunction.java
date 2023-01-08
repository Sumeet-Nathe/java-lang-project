package co.in.an.eye.tech.java.java8.streams;

import java.util.Arrays;

public class SumFunction {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
