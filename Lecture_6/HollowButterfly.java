import java.util.*;

//print holllow butterfly - n=5

public class HollowButterfly {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // second loop:
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}