import java.util.*;

// print hollow rectangle
public class HollowRectangle {
	public static void main(String[] args) {
		// the below is outer for loop
		int n = 4;
		int m = 5;
		for (int i = 1; i <= n; i++) {
			// here u can declare 2 vars for m and n or fetch it from user using scanner
			// class
			// the below is inner for loop
			for (int j = 1; j <= m; j++) {
				// here you have to print star only if i or j value is 1 or n and m respectively
				if (i == 1 || i == n || j == 1 || j == m)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}