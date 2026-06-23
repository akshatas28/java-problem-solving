import java.util.*;

// lect 20 = backtracking
// print all permutations of a str
public class Permutations {
    // declare another function apart from main
    public static void printPerm(String st, String perm, int n) {
        if (st.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < st.length(); i++) {
            char currChar = st.charAt(i);
            String newSt = st.substring(0, i) + st.substring(i + 1);
            printPerm(newSt, perm + currChar, n + 1);
        }
        // its doing one step and then calling itself
        // self call = recursion
    }

    public static void main(String[] args) {
        String st = "abc";
        printPerm(st, "", 0);
    }
}
