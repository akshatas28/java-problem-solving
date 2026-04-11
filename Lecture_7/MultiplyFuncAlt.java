import java.util.*;

//print product using function block
public class MultiplyFuncAlt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// call function, fuction can be directly called
		System.out.println("product is: " + multiplyNum(a, b));
		// function block will be returned
	}

	public static int multiplyNum(int a, int b) {
		// return mandatory
		return a * b;
	}
}