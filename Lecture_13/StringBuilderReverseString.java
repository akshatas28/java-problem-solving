import java.util.*;
//Lecture 13 StringBuilder Reverse string

public class StringBuilderReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder(str);
		// now using reverse directly
		System.out.println(sb.reverse());
		sc.close();
	}
}
