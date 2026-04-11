import java.util.*;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        // call function, function can be written above or below main function
        printMyName(name);
        // function block will be returned
    }

    public static void printMyName(String name) {
        // whatever output is needed can be specified here
        System.out.println(name);
        // return mandatory
        return;
    }
}