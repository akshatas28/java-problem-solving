import java.util.*;

//print inverted pattern 1-4 - inverted pyramid
public class PrintNum1_4Inverted {
	public static void main(String[] args) {
		int n = 4;
		// outer loop
		for (int i = 1; i <= n; i++) {
			// inner loop
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}