//8. 2 nums entered by user, x and n: func to find value of one num raised to power of another: x raised to n

import java.util.*;

public class PowerFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base number x: ");
        int x = sc.nextInt();
        System.out.println("enter to the power number n: ");
        int n = sc.nextInt();
        System.out.println(x + " to the power " + n + " is " + raiseTo(x, n));
    }

    public static double raiseTo(int x, int n) {
        double ans = Math.pow(x, n);
        return ans;
    }
}