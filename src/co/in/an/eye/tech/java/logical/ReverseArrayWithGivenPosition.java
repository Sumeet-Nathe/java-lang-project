package co.in.an.eye.tech.java.logical;

import java.util.Arrays;

public class ReverseArrayWithGivenPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int length = arr.length;
        int start = 0;
        System.out.println("Before Reversing : ");
        Arrays.stream(arr).forEach(x -> System.out.print(x + "->"));
        int pos = 2;
        int other = length - pos;
        reverseArray(arr, start, other - 1);
        reverseArray(arr, other, length - 1);
        reverseArray(arr, start, length - 1);
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

        //using while loop

       /* while(start<=length){
            int temp = arr[start];
            arr[start] = arr[length];
            arr[length] = temp;
            start++;
            length--;
        }*/
    }
}
