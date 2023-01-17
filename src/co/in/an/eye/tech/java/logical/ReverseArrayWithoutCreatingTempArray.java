package co.in.an.eye.tech.java.logical;

import java.util.Arrays;

public class ReverseArrayWithoutCreatingTempArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int length = arr.length - 1;
        int start = 0;
        System.out.println("Before Reversing : ");
        Arrays.stream(arr).forEach(x -> System.out.print(x + "->"));
        reverseArray(arr, start, length);
        System.out.println("\n\nAfter Reversing : ");
        Arrays.stream(arr).forEach(x -> System.out.print(x + "->"));
    }

    private static void reverseArray(int[] arr, int start, int length) {
        if (start >= length) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[length];
        arr[length] = temp;
        start++;
        length--;
        reverseArray(arr, start, length);
    }
}
