package leetcode;

//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

//Example 1:
//Input: s = "leetcode"
//Output: 0
//
//Example 2:
//Input: s = "loveleetcode"
//Output: 2
//
//Example 3:
//Input: s = "aabb"
//Output: -1

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterinaString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode")); //0
        System.out.println(firstUniqChar("loveleetcode")); //2
        System.out.println(firstUniqChar("aabb")); //0
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap<>();
        int n = s.length();
        for (int index = 0; index < n; index++) {
            char c = s.charAt(index);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
