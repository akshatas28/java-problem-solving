import java.util.*;

public class diffWhileAndDoWhile {
	public static void main(String[] args) {
		// code for checking difference between while and do while loop
		// print output
		// initialize i
		int i = 12;
		// initialize do loop
		while (i < 11) {
			System.out.println("While loop ran");
		}
		do {
			System.out.println("do while loop ran");
		} while (i < 11); // add while condition at end with a terminator that is semi colon mark
		// do while loop will run because it will first print then check the condition
		// so at least once the conditions will be executed/printed but while loop will
		// not execute as it is checking condiont before execution same as college guard
		// checking id before sending in
	}
}