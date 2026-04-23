import java.util.*;

public class ArrString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("provide arr size");
		int n = sc.nextInt();
		String arr[] = new String[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("provide arr input names");
			arr[i] = sc.next();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}