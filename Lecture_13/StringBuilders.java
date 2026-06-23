import java.util.*;
//Lecture 13 StringBuilder

public class StringBuilders {
    public static void main(String args[]) {
        // using normal string or stringbuilder, character at particular index can be
        // fetched
        String s = "FAYE";
        System.out.println("normal s is " + s.charAt(0));
        // StringBuilder Declaration
        StringBuilder sb = new StringBuilder("Tony");
        // fetching normally
        System.out.println("sb is " + sb);
        // fetching at particular index
        System.out.println("sb is index 0 is " + sb.charAt(0));
        // removing a char from particular index and setting new char at that index
        sb.setCharAt(0, 'P');
        System.out.println("new sb is " + sb);
    }
}