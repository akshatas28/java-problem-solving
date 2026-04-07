import java.util.*;

//print inverted half pyramid
public class InvertedHalfPyramid {
	public static void main(String[] args) {
		int n = 4;
		// outer loop
		for (int i = 1; i <= n; i++) {
			// inner loop
			for (int j = n; j >= i; j--) {
				// it will print until i=/j
				System.out.print("*");
			}
			System.out.println();
		}
	}
}