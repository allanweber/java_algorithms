package leetcode;

//Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.
//Return the sorted string. If there are multiple answers, return any of them.

//Example 1:
//Input: s = "tree"
//Output: "eert"
//Explanation: 'e' appears twice while 'r' and 't' both appear once.
//So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
//
//Example 2:
//Input: s = "cccaaa"
//Output: "aaaccc"
//Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
//Note that "cacaca" is incorrect, as the same characters must be together.
//
//Example 3:
//Input: s = "Aabb"
//Output: "bbAa"
//Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
//Note that 'A' and 'a' are treated as two different character

import java.util.*;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree")); // eert
        System.out.println(frequencySort("cccaaa")); //aaaccc
        System.out.println(frequencySort("Aabb")); //bbAa
    }

    public static String frequencySort(String s) {
        Map<Character, Integer> letters = new HashMap<>();

        for (Character character : s.toCharArray()) {
            letters.put(character, letters.getOrDefault(character, 0) + 1);
        }

        List<Character> list = new ArrayList<>(letters.keySet());
        list.sort((a, b) -> letters.get(b) - letters.get(a));
        StringBuilder sb = new StringBuilder();

        for (char c : list) {
            int count = letters.get(c);
            while (count > 0) {
                sb.append(c);
                count--;
            }

        }

        return sb.toString();
    }
}
