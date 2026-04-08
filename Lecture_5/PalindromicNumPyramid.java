import java.util.*;

//print inverted half pyramid rotated 180
public class PalindromicNumPyramid {
	public static void main(String[] args) {
		int n = 9;
		for (int i = 0; i <= n; i++) {
			// inner for loop
			for (int j = 1; j <= n + i; j++) {
				if (j <= n - i || j >= n + i) {
					System.out.print(" ");
				} else if (j < n) {
					System.out.print(n - j + 1);
				} else {
					System.out.print(j - n + 1);
				}
			}
			System.out.println();
		}
	}
}