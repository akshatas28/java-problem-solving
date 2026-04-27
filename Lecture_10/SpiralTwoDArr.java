import java.util.*;

//lecture 2 - 2D array
//take input and print spiral matrix
public class SpiralTwoDArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("provide arr row size");
		int n = sc.nextInt();
		System.out.println("provide arr column size");
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int rowStart = 0;
		int rowEnd = n - 1;
		int colStart = 0;
		int colEnd = m - 1;
		while (rowStart <= rowEnd && colStart <= rowEnd) {
			for (int col = colStart; col <= colEnd; col++) {
				System.out.print(arr[rowStart][col]);
			}
			rowStart++;
			System.out.println();
			for (int row = rowStart; row <= rowEnd; row++) {
				System.out.print(arr[row][colEnd]);
				System.out.println();
			}
			colEnd--;
			for (int col = colEnd; col >= colStart; col--) {
				System.out.print(arr[rowEnd][col]);
			}
			rowEnd--;
			System.out.println();
			for (int row = rowEnd; row >= rowStart; row--) {
				System.out.print(arr[row][colStart]);
				System.out.println();
			}
			colStart++;
		}
	}
}