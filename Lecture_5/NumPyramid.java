import java.util.*;

//print number pyramid
public class NumPyramid {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= (n); i++) {
			// inner for loop
			for (int j = 1; j <= n + i; j++) {
				if (j <= n - i || j >= n + i) {
					System.out.print(" ");
				} else if ((i + j) % 2 == 0) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}