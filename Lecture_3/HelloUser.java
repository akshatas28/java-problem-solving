import java.util.*;

//code for checking if else condition
//to print hellos as per user inputs else NA
public class HelloUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a == 1) {
			System.out.println("Hello");
		} else if (a == 2) { 
			System.out.println("Namaste");
		} else if (a == 3) {
			System.out.println("Bonjour");
		} else {
			System.out.println("NA");
		}
	}
}