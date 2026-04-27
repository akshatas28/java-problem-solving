import java.util.*;

//lecture 12 - strings : compare 2 strings
public class Strings {
	public static void main(String[] args) {
		String s1 = "tony";
		String s2 = "stark";
		// compare 2 strings using compareTo() function
		// if (s1.compareTo(s2)==0){
		// System.out.println("Strings are equal ");
		// }
		// else {
		// System.out.println("Strings are not equal");
		// }
		// equal to will work but will fail for most of the cases just as below
		if (new String("tony") == new String("tony")) {
			System.out.println("Strings are equal ");
		} else {
			System.out.println("Strings are not equal");
		}
	}
}