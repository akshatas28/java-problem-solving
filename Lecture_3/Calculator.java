import java.util.*;

//code for checking switch case condition
//to create a calculator for add, sub, mul, div, mod using 2 numbers
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		// a and b are integers
		System.out.println("Enter opea" +
				"ration: add, sub, mul, div, mod");
		String operation = sc.next();
		switch (operation) {
			case "add": {
				int result = a + b;
				System.out.println(result);
				break;
			}
			case "sub": {
				int result = a - b;
				System.out.println(result);
				break;
			}
			case "mul": {
				int result = a * b;
				System.out.println(result);
				break;
			}
			case "div": {
				int result = a / b; // here u can use if else loop to check if b is 0 and then proceed accordingly
				System.out.println(result);
				break;
			}
			case "mod": {
				int result = a % b; // here also u can use if else loop to check if b is 0 and then proceed
									// accordingly
				System.out.println(result);
				break;
			}
			default: {
				System.out.println("NA");
			}
		}
	}
}