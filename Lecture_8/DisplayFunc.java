//7. write program to enter the nums till the user wants and at the end it should display the count of positive, negative and zeros entered

import java.util.*;

public class DisplayFunc {
    public static void main(String args[]) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (;;) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter choice 0 for stop and 1 for continue");
            int choice = sc.nextInt();
            if (choice == 1) {
                int num = sc.nextInt();
                if (num > 0) {
                    positiveCount = positiveCount + 1;
                } else if (num < 0) {
                    negativeCount = negativeCount + 1;
                } else {
                    zeroCount = zeroCount + 1;
                }
            } else if (choice == 0) {
                break;
            } else {
                System.out.println("invalid input");
                break;
            }
        }
        System.out.println("positive count: " + positiveCount);
        System.out.println("negative count: " + negativeCount);
        System.out.println("zero count: " + zeroCount);
    }
}