import java.util.*;
//Lecture 13 StringBuilder Reverse string

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder(str);
		// now using loop, and charAt we fetch each character and start placing it one
		// after another from length-1
		for (int i = sb.length() - 1; i >= 0; i--) {
			System.out.print(sb.charAt(i));
		}
		sc.close();
	}
}