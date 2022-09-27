package leetcode;

public class LengthOfLastWord {

//    Example 1:
//    Input: s = "Hello World"
//    Output: 5
//    Explanation: The last word is "World" with length 5.
//
//    Example 2:
//    Input: s = "   fly me   to   the moon  "
//    Output: 4
//    Explanation: The last word is "moon" with length 4.
//
//    Example 3:
//    Input: s = "luffy is still joyboy"
//    Output: 6
//    Explanation: The last word is "joyboy" with length 6.
    public static void main(String[] args) {
        //Using Regex
        System.out.println(lengthOfLastWordRegex("Hello World"));
        System.out.println(lengthOfLastWordRegex("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWordRegex("luffy is still joyboy"));

        //No Regex
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWordRegex(String s) {
        String[] split = s.split("\\s+");
        return split[split.length -1].length();
    }

    public static int lengthOfLastWord(String s) {
        // Used for checking extra spaces at the end.
        boolean charStarted = false;
        int res = 0;

        // Starts the loop from the end of string.
        // If there are extra spaces at the end, the loop will skip those indexes.
        // This will happen till it encounters atleast one non-space character.
        // After that, as soon as the loop encounters another space, the loop breaks.
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (charStarted && c == ' ')
                break;
            else if (c != ' ') {
                charStarted = true;
                res++;
            }
        }

        return res;
    }
}
