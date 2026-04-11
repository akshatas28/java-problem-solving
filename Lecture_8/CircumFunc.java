//4. func that takes in radius as input an return circumference of circle

import java.util.*;

public class CircumFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(circumference(r));
    }

    public static double circumference(double r) {
        double circum = 2 * Math.PI * r; // Math.pi function == 3.1415...
        return circum;
    }

}