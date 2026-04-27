import java.util.*;

//lecture 12 - strings : substring
public class StringSubStringAlt {
	public static void main(String[] args) {
		// from 0 till end index-1 chars, it will fetch the words substring(beg index,
		// end index)
		String s = "TonyStark";
		String s1 = s.substring(0, 4);
		System.out.println("String s1 is " + s1);
		// no need to mention end index, it will fetch until end automatically
		String s2 = s.substring(4);
		System.out.println("String s2 is " + s2);
	}
}