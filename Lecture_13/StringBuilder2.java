import java.util.*;
//Lecture 13 StringBuilder 2.2

public class StringBuilder2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Tony");
		// insert at particular index such that other chars get shifted to next index
		sb.insert(2, 'n');
		System.out.println("sb is " + sb);
	}
}