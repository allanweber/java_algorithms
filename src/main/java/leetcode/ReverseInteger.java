package leetcode;

//Given a signed 32-bit integer x, return x with its digits reversed.
//If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

//Example 1:
//Input: x = 123
//Output: 321
//
//Example 2:
//Input: x = -123
//Output: -321
//
//Example 3:
//Input: x = 120
//Output: 21
//
//Example 4:
//Input: x = 0
//Output: 0

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123)); //321
        System.out.println(reverse(-123)); //-321
        System.out.println(reverse(120)); //21
        System.out.println(reverse(0)); //0
    }

    public static int reverse(int x) {
        String numString = String.valueOf(Math.abs(x));
        StringBuilder text = new StringBuilder();
        int start = numString.length() - 1;
        for (int index = start; index >= 0; index--) {

            if (!(index == start && numString.charAt(start) == '0')) {
                text.append(numString.charAt(index));
            }
        }

        try {
            if (x < 0) {
                return Integer.parseInt(text.toString()) * -1;
            } else {
                return Integer.parseInt(text.toString());
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
