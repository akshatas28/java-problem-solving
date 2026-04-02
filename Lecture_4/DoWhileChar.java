import java.util.*;

public class DoWhileChar {
	public static void main(String[] args) {
		// code for do while loop
		// print a-z list
		// initialize ch
		char ch = 'a';
		// initialize do loop
		do {
			System.out.println(ch); // prints one after another else print(ch+" ") for ome after another in same
									// line
			// increment i
			ch++;
		} while (ch <= 'z'); // add while condition at end with a terminator that is semi colon mark
	}
}