//10. print fibonacci series of n terms where n is input by user: 0 1 1 2 3 5..In fibonacci series, a num is sum of previous 2 nums that came before it.

import java.util.*;

public class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n such that n terms fibonacci series will be printed ");
        int n = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(firstTerm + " ");
            int mainNum = firstTerm + secondTerm;
            secondTerm = firstTerm;
            firstTerm = mainNum;
        }
    }
}