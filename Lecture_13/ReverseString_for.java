import java.util.*;
//Lecture 13 StringBuilder Reverse string

public class ReverseString_for {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		// now using append, add new chars in front of h
		for (int i = 0; i < sb.length() / 2; i++) {
			int front = i;
			int back = sb.length() - 1 - i;
			char frontChar = sb.charAt(front);
			char backChar = sb.charAt(back);
			sb.setCharAt(front, backChar);
			sb.setCharAt(back, frontChar);
		}
		System.out.print(sb);
	}
}
