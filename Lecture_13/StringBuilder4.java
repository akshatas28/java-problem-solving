import java.util.*;
//Lecture 13 StringBuilder 4

public class StringBuilder4 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("h");
		// now using append, add new chars in front of h
		sb.append("e"); // str=str+"e";etc
		// use single quotes then also it will run
		sb.append("l");
		sb.append("l");
		sb.append("o");
		System.out.println("sb post append is " + sb);
		System.out.println("sb length is " + sb.length());
	}
}