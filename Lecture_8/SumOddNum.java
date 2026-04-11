//2. func to print sum of all odd num from 1 to n

import java.util.*;

public class SumOddNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOddNum(n);
    }

    public static void sumOddNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}