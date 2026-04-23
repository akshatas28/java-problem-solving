import java.util.*;

//arrays start by second defn
public class ArraysFindInd2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		// take input size
		int n = sc.nextInt();
		// map input size
		int numbers[] = new int[n];
		// input
		for (int i = 0; i < n; i++) {
			System.out.println("enter input values");
			numbers[i] = sc.nextInt();
		}
		// the above loop will contain values which will be printed in below output
		// provide the input that needs to be fetched in the arr
		System.out.println("enter a num to be found");
		int x = sc.nextInt();
		// output
		// arr.length defines size of arr
		for (int i = 0; i < numers.length; i++) {
			if (numbers[i] == x) {
				System.out.println("output is");
				System.out.println(i);
			}
		}
	}
}