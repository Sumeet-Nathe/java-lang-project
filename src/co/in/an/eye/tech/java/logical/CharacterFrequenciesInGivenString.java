package co.in.an.eye.tech.java.logical;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequenciesInGivenString {
    public static void main(String[] args) {
        String name = "Sumeet";
        char[] charArray = name.toCharArray();
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (char c : charArray) {
            if (characterIntegerMap.containsKey(c) && characterIntegerMap.get(c) > 0) {
                characterIntegerMap.put(c, characterIntegerMap.get(c) + 1);
            } else {
                characterIntegerMap.put(c, 1);
            }
        }
        System.out.println(characterIntegerMap);

        Map<Character, Integer> frequencies = new HashMap<>();
        for (char ch : charArray) {
            frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);
        }
        System.out.println(frequencies);
    }
}
