import java.util.*;

//code for checking switch case condition
//to print hellos as per user inputs else NA
public class HelloSwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		// a is a button
		switch (a) {
			case 1: {
				System.out.println("Hello");
				break;
			}
			case 2: {
				System.out.println("Namaste");
				break;
			}
			case 3: {
				System.out.println("Bonjour");
				break;
			}
			default: {
				System.out.println("NA");
			}
		}
	}
}