package Lecture_18;

import java.util.*;

// lect 18 = recursion 2
// print reverse of a string
public class ReverseString {
    // declare another function apart from main
    public static void main(String[] args) {
        String st = "abcd";
        int n = st.length() - 1;
        reverseString(st, n);
    }

    public static void reverseString(String st, int n) {
        if (n == 0) {
            System.out.println(st.charAt(n));
            return;
        }

        System.out.println(st.charAt(n));
        reverseString(st, n - 1);
        // its doing one step and then calling itself
        // self call = recursion
    }
}
