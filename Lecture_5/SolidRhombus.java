import java.util.*;

// print solid rhombus
public class SolidRhombus {
	public static void main(String[] args) {
		// the below is outer for loop
		int n = 5;
		int m = 9;
		for (int i = 1; i <= n; i++) {
			// inner for loop
			for (int j = 1; j <= m; j++) {

				if ((i + j) <= 5 || (i + j) >= 10) {
					System.out.print(" ");
				} else
					System.out.print("*");
			}
			System.out.println();
		}

	}
}