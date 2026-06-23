package Lecture_18;

import java.util.*;

// lect 18 = recursion 2
// print all x to the end of the string
public class PrintXToEnd {
    // declare another function apart from main
    String result = "";
    int count = 0;

    public static void main(String[] args) {
        String st = "axbcxxd";
        int n = st.length() - 1;

        xToEnd(st, 0, 0, "");
    }

    public static void xToEnd(String st, int n, int count, String result) {
        if (n == st.length()) {
            for (int i = 0; i < count; i++) {
                result += 'x';
            }
            System.out.println(result);
            return;
        }
        if (st.charAt(n) != 'x') {
            result += st.charAt(n);
        } else {
            count = count + 1;
        }
        xToEnd(st, n + 1, count, result);

        // its doing one step and then calling itself
        // self call = recursion
    }
}
