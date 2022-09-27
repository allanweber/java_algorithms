package leetcode;

//Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

//Example 1:
//Input: nums = [1,1,1,2,2,3], k = 2
//Output: [1,2]
//
//Example 2:
//Input: nums = [1], k = 1
//Output: [1]

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,1,1,2,2,3}, 2))); //[1,2]

        System.out.println(Arrays.toString(topKFrequent(new int[]{1,1,1,2,2,3}, 1))); //[1]

        System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1))); //[1]
    }

    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));

        int returns = k;
        if(list.size() < returns) {
            returns = list.size();;
        }

        int[] topFrequent = new int[returns];
        for (int index = 0; index < returns; index++) {
            topFrequent[index] = list.get(index);
        }

        return topFrequent;
    }
}
