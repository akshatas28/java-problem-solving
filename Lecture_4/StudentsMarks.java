import java.util.*;

//Make a menu driven program. The user can enter 2 numbers either 1 or 0. if the user enters 1 then keep taking input from the user for the students marks(out of 100). if they enter 0 then stop. If he/she scores:
//marks>=90 -> print"this is good"; 89>=marks>=60 -> print"this is also good"; 59>=marks>=0 -> print"this is good as well" because marks dont matter but our efforts does. (hint use do while but think and understand why?)

public class StudentsMarks {
    public static void main(String[] args) {
        for (;;) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 or 0: 1 to continue, 0 to exit");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("Enter Students marks out of 100");
                int i = sc.nextInt();
                if (i >= 90) {
                    System.out.println("this is good");
                } else if (i >= 60 && i <= 89) {
                    System.out.println("this is also good");
                } else if (i >= 0 && i <= 59) {
                    System.out.println("this is good as well");
                } else {
                    System.out.println("invalid input");
                }
            } else if (n == 0) {
                System.out.println("Loop ends");
                break;
            } else {
                System.out.println("invalid input");
                break;
            }
        }
    }
}