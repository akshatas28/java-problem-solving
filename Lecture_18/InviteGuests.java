package Lecture_18;

import java.util.*;

// lect 18 = recursion one shot advanced
// find the number of ways in which u can invite n people to your party, single or in pairs
public class InviteGuests {
    // declare another function apart from main
    public static int callGuest(int n) {
        if (n <= 1) {
            return 1;
        }
        int singleCall = callGuest(n - 1);
        int twoPairsCall = (n - 1) * callGuest(n - 2);
        return singleCall + twoPairsCall;
        // its doing one step and then calling itself
        // self call = recursion
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(callGuest(n));
    }
}
