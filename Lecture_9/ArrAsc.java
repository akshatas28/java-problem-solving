import java.util.*;

//arr is sorted in ascending or not
public class ArrAsc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("provide arr size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("provide arr input int");
			arr[i] = sc.nextInt();
		}
		boolean isAscending = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isAscending = false;
			}
		}
		if (isAscending) {
			System.out.println("arr is in ascending order");
		} else {
			System.out.println("arr is not in ascending order");
		}
	}
}