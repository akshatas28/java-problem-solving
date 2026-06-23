package Lecture_15;

import java.util.*;

//lecture 15 - BIT MANIPULATION : take n perform bit mask, and then an operation
public class BitManipulation4 {
    public static void main(String[] args) {
        // declaration
        int n = 5;
        int pos = 1;
        // get = AND
        // set = OR
        // clear = AND with NOT = first negate bitmask then perform AND
        // update = set for 1 and clear for 0
        int bitMask = 1 << pos;
        // anding below and printing int
        System.out.println(bitMask | n);
    }
    // Same can be done for pos-3 to change 1 to 0
    // U can use if else and fetch operation from user to change any bit to 0 or 1,
    // also the n and pos can be fetched by using scanner class
}
