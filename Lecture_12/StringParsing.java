import java.util.*;

//lecture 12 - strings : parsing
public class StringParsing {
	public static void main(String[] args) {
		// converting string to int
		// here string must contain an integer if any char is passed, it will fail
		String s = "123";
		int s1 = Integer.parseInt(s);
		System.out.println("str converted to int " + s1);
		// convert int to string
		int a = 123;
		String str = Integer.toString(a);
		// here keep in mind while declaring the string, dont give single cgar else it
		// will fail to fetch length, so if need to fwtxh length, better mention naming
		// convention as 2 or more chars
		System.out.println("int converted to str " + str.length());
	}
}