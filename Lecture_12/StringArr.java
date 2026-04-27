import java.util.*;

//lecture 12 - strings : Take an array of Strings input from the user & find the cumulative (combined) length of all those strings
public class StringArr {
	public static void main(String[] args) {
		// fetch size of arr
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String arr[] = new String[size];
		int total = 0;
		for (int i = 0; i < size; i++) {
			arr[i] = sc.next();
			total += arr[i].length();
		}
		System.out.println("total is " + total);
	}
}