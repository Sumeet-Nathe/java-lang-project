package co.in.an.eye.tech.java.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReplaceGivenArrayWordsFromStringStatement {

    public static void main(String[] args) {
        String s = "My name is Sumeet and I am a football fan";

        String[] arr = {"football", "Sumeet"};
        List<String> collect = new ArrayList<>();
        //
        String collect1 = null;
        String newStrArr[] = s.split(" ");

        //Arrays.stream(newStrArr).forEach(System.out::println);


        for (String str : arr) {
            arr = Arrays.stream(newStrArr).map(sample -> sample.equals(str) ? "" : sample).collect(Collectors.toList()).toArray(new String[0]);//.forEach(System.out::println);
        }
        Arrays.stream(arr).forEach(System.out::println);
        //System.out.println(collect1);
    }
}
