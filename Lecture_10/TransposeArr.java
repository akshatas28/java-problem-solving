import java.util.*;

//lecture 2 - 2D array
//take input and print transpose matrix
public class TransposeArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("provide arr row size");
		int n = sc.nextInt();
		System.out.println("provide arr column size");
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for (int i = 0; i<n;i++){
			for (int j = 0; j<m;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("the matrix is ");
		for 
		for (int i = 0; i<n;i++){
			for (int j = 0; j<m;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("the transpose of above matrix is ");
		for (int j=0;j<m;j++){
			for(int i = 0;i<n;i++){
				System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
	}
}