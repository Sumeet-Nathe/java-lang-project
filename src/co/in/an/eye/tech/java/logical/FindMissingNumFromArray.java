package co.in.an.eye.tech.java.logical;

import java.util.HashSet;

public class FindMissingNumFromArray {
    public static void main(String[] args) {
        int i = missingInteger(new int[]{1, 2, 4, 5, 6, 7});
        System.out.println("Missing element in array : " + i);
    }

    private static int missingInteger(int[] ints) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 1; i <= ints.length + 1; i++) {
            hashSet.add(i);
        }
        System.out.println("Inside for each");
        for (int a : ints) {
            System.out.println("Array Element : " + a);
            hashSet.remove(a);
        }
        return hashSet.iterator().next();
    }
}
