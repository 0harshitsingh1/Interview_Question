/*
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at
 least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The 
returned string should only have a single space separating the words. Do not include any extra 
spaces.


Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"

Example 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.

Example 3:
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
*/

package StringQuestion;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
    //     StringBuilder sb = new StringBuilder();

    //     int l=0, r=s.length()-1;

    //     while (l <= r && s.charAt(l) == ' ') {
    //         l++;
    //     }

    //     while (r >= l && s.charAt(r) == ' ') {
    //         r--;
    //     }

    //     while (l <= r) {
    //         if(s.charAt(l) != ' ') {
    //             sb.append(s.charAt(l));
    //             l++;
    //         } else if (s.charAt(l) == ' '){
    //             if(sb.charAt(sb.length()-1) != ' ' ) {
    //                 sb.append(' ');
    //                 l++;
    //             } else {
    //                 l++;
    //             }
    //         }
    //     }

    //     int i=0, j=sb.length()-1;
    //     while (i < j) {
    //         char temp = sb.charAt(i);
    //         sb.setCharAt(i, sb.charAt(j));
    //         sb.setCharAt(j, temp);

    //         i++;
    //         j--;
    //     }

    //     int start = 0,
    //         end = 0;

    //     while (start < sb.length()) {
    //         while (end < sb.length() && sb.charAt(end) != ' ') {
    //             end++;
    //         }

    //         int p1 = start,
    //             p2 = end-1;

    //         while (p1 < p2) {
    //             char temp = sb.charAt(p1);
    //             sb.setCharAt(p1, sb.charAt(p2));
    //             sb.setCharAt(p2, temp);

    //             p1++;
    //             p2--;
    //         }

    //         start = end + 1;
    //         end = start;
    //     }

    //     return sb.toString();


// Brute force approach
        s = s.trim();
        String[] arr = s.split("\\s+");

        int i=0,
            j = arr.length-1;

        while (i < j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        return String.join(" ", arr);
    }
    
    public static void main(String[] args) {
        String s = "The sky is blue";

        System.out.println(reverseWords(s));
    }
}
