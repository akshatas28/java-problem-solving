import java.util.*;

//print all even numbers till n

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n until which even numbers need to be printed");
        int n = sc.nextInt();
        for (int i = 0; i <= n;) {
            if (i % 2 == 0) {
                System.out.println(i);
                i = i + 2;
            } else {
                break;
            }
        }
    }
}
