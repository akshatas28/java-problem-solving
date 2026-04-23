import java.util.*;

//arrays start by second defn
public class ArraysScanVal2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		// take input size
		int n = sc.nextInt();
		// map input size
		int numbers[] = new int[n];
		// input
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		// the above loop will contain values which will be printed in below output
		// output
		for (int i = 0; i < n; i++) {
			System.out.println("output is");
			System.out.println(numbers[i]);
		}
	}
}