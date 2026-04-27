import java.util.*;

//lecture 12 - strings : length
public class StringLength {
	public static void main(String[] args) {
		String s1 = "tony";
		String s2 = "stark";
		// both s1 and s2 are added and made into one string
		String s = s1 + s2;
		// length of string calculated by .length()
		System.out.println("String length is " + s.length());
		System.out.println("String is " + s);
	}
}