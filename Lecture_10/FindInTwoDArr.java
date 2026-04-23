import java.util.*;

//lecture 2 - 2D array
//take input and print indices where x is found
public class FindInTwoDArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("provide arr row size");
		int n = sc.nextInt();
		System.out.println("provide arr column size");
		int m = sc.nextInt();
		System.out.println("provide num to be found");
		int x = sc.nextInt();
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == x) {
					System.out.print(i + " " + j);
				}
			}
			System.out.println();
		}
	}
}