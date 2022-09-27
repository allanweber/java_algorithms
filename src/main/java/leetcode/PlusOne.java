package leetcode;

import java.util.Arrays;
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
//The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.

//Example 1:
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//
//Example 2:
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
//
//Example 3:
//Input: digits = [0]
//Output: [1]
//Explanation: The array represents the integer 0.
//Incrementing by one gives 0 + 1 = 1.
//Thus, the result should be [1].
//
//Example 4:
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3}))); //1,2,4
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1}))); //4,3,2,2
        System.out.println(Arrays.toString(plusOne(new int[]{0}))); //1

        System.out.println(Arrays.toString(plusOne(new int[]{9}))); //1,0
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 9, 9}))); //1,3,0,0
    }

    public static int[] plusOne(int[] digits) {
        int currentIndex = digits.length - 1;
        while (currentIndex >= 0) {
            if (digits[currentIndex] + 1 == 10) {
                digits[currentIndex] = 0;
                if(currentIndex == 0) {
                    int[] newArray = Arrays.copyOf(digits, digits.length + 1);
                    newArray[0] = 1;
                    System.arraycopy(digits, 0, newArray, 1, digits.length);
                    return newArray;
                }
            } else {
                digits[currentIndex] = digits[currentIndex] + 1;
                currentIndex = -1;
            }
            currentIndex--;
        }

        return digits;
    }
}
