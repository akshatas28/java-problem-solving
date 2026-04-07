import java.util.*;

//print pattern 1-5
public class PrintNum1_5 {
	public static void main(String[] args) {
		int n = 4; // u can put 5 and print it
		// outer loop
		for (int i = 1; i <= n; i++) {
			// inner loop
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}