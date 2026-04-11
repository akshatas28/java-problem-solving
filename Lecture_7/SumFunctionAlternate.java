import java.util.*;

//print sum using function block
public class SumFunctionAlternate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// call function, finction can be written above or below main function
		int sum = addNum(a, b);
		System.out.println(sum);
		// function block will be returned
	}

	public static int addNum(int a, int b) {
		// whatever output is needed can be specified here
		int sum = a + b;
		// return mandatory
		return sum;
	}
}