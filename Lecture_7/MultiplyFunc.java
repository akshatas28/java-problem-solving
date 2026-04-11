import java.util.*;

//print product using function block
public class MultiplyFunc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// call function, finction can be written above or below main function
		int product = multiplyNum(a, b);
		System.out.println(product);
		// function block will be returned
	}

	public static int multiplyNum(int a, int b) {
		// whatever output is needed can be specified here
		int product = a * b;
		// return mandatory
		return product;
	}
}