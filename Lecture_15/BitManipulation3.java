package Lecture_15;

import java.util.*;

//lecture 15 - BIT MANIPULATION : take n perform bit mask, and then an operation
public class BitManipulation3 {
    public static void main(String[] args) {
        // declaration
        int n = 5;
        int pos = 1;
        // mention pos and then fetch it else mention it directly below
        int bitMask = 1 << pos;
        // orring below and printing int
        System.out.println(bitMask | n);
    }
}
