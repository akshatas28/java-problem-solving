package Lecture_15;

import java.util.*;

//lecture 15 - BIT MANIPULATION : take n perform bit mask, and then an operation
public class BitManipulation {
    public static void main(String[] args) {
        // declaration
        int n = 5;
        int pos = 2;
        // mention pos and then fetch it else mention it directly below
        int bitMask = 1 << pos;
        if ((bitMask & n) == 0) {
            System.out.println("bit is zero");
        } else {
            System.out.println("bit is one");
        }
    }
}
