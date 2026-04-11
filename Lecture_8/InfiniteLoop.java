//6. write an infinite loop using do while condition

// this is just for int, but same can be done for string, char, double, float etc using any function of greater than, less than, divide, multiple, sum, etc

import java.util.*;

public class InfiniteLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        infiniteLoop(n);
    }

    public static void infiniteLoop(int n) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= n || i >= n);
    }
}