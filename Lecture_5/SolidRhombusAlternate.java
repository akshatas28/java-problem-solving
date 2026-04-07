import java.util.*;

// print solid rhombus
public class SolidRhombusAlternate {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}