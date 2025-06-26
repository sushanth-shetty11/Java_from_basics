import java.util.Arrays;

public class ss17 {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        if (isAnagram(s1, s2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);

        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
}




//swapping every word first and last characters
//paragram string
//print longest palindrome substring in the main string
//check the given string is unique or not
//print longest unique substring in the main string
//reverse the sentence -op - ram is good -op- good is ram
//reverse each word in sentence -op- ramesh is good -op- hsemar si doog
//count how many characters are present in each word -ram is good -op ram-3, is-2, good-4
//count how many characters are present in each word
//ip - aaabbcccaa op - a3b2c3a2