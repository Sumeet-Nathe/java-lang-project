package co.in.an.eye.tech.java.logical;

import java.util.Arrays;

public class FindTheIndexNumsWhichSumIsEqualToGivenNum {
    public static void main(String[] args) {

        /*
        int arr 3,2,11,7,5
        sum=9
        indexes = 1 3
        */

        int arr[] = new int[]{3, 2, 11, 7, 5};
        int[] ints = verifyIndexes(arr, 10);
        Arrays.stream(ints).forEach(i -> {
            System.out.print("->" + i);
        });
    }

    public static int[] verifyIndexes(int arr[], int sum) {
        int[] ans = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum == arr[i] + arr[j]) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
