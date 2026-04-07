import java.util.*;

//Print solid rectangle
public class Patterns {
    public static void main(String[] args) {
        // the below is outer for loop
        for (int i = 1; i <= 4; i++) {
            // here u can declare 2 vars for 4 and 5 or fetch it from user using scanner
            // class
            // the beliw is inner for loop
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}