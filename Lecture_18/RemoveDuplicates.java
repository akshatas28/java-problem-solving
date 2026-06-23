package Lecture_18;

import java.util.*;

// lect 18 = recursion 2
// remove all duplicates from a string
public class RemoveDuplicates {
    // declare another function apart from main
    public static boolean[] map = new boolean[26];

    public static void main(String[] args) {
        String st = "abbccda";
        String newString = "";
        removeDuplicates(st, 0, newString);
    }

    public static void removeDuplicates(String st, int n, String newString) {
        if (n == st.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = st.charAt(n);
        if (map[currChar - 'a']) {// == true is implied here even if nothing is written
            removeDuplicates(st, n + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(st, n + 1, newString);
        }
        // its doing one step and then calling itself
        // self call = recursion
    }
}
