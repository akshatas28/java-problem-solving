import java.util.*;

//lecture 12 - strings : substring
public class StringSubString {
	public static void main(String[] args) {
		String s1 = "My name is tony";
		String s2 = s1.substring(11, s1.length());
		// from 11 till length-1 chars, it wipl fetch the words
		System.out.println("word is " + s2);
	}
}