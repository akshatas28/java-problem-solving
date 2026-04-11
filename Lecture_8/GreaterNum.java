//3. func which takes in 2 nums and returns greater of those 2

import java.util.*;

public class GreaterNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greaterNum(a, b);
    }

    public static void greaterNum(int a, int b) {
        if (a > b) {
            System.out.println("a is greater");
            return;
        } else if (a < b) {
            System.out.println("b is greater");
            return;
        } else {
            System.out.println("both are equal");
            return;
        }
    }
}