//9. funct that calculates GCD of 2 nums

import java.math.BigInteger;
import java.util.*;

public class GCDFunc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
        System.out.println(gcd);
    }
}