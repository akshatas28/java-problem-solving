import java.util.*;

public class EvenOddFunc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isEvenOrOdd(n);
    }

    public static void isEvenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("even");
            return;
        } else {
            System.out.println("odd");
            return;
        }
    }
}