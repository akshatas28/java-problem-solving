import java.util.*;

//code for checking switch case condition
//to print hellos as per user inputs else NA
public class SwitchCaseChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		// a is a String
		switch (a) { // for char and string include the word in double quotes
			case "tony": {
				System.out.println("Hello");
				break;
			}
			case "thor": {
				System.out.println("Namaste");
				break;
			}
			case "captain": {
				System.out.println("Bonjour");
				break;
			}
			default: {
				System.out.println("NA");
			}
		}
	}
}