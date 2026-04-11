import java.util.*;

//1. enter 3 nums from user and make a func to print avg

public class AvgFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        avgFunc(a, b, c);
    }

    public static void avgFunc(int a, int b, int c) {
        float avg = (a + b + c) / 3.0f; // very imp to introduce .0f condition if need exact value
        System.out.println(avg);
        return;
    }
}