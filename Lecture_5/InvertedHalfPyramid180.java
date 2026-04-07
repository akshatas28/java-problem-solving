import java.util.*;

//print inverted half pyramid rotated 180
public class InvertedHalfPyramid180 {
	public static void main(String[] args) {
		int n = 4;
		// outer loop
		for (int i = 1; i <= n; i++) {
			// inner loop
			for (int j = 1; j <= n; j++) {
				if (j <= n - i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}