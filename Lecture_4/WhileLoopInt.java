import java.util.*;

// code to print 0-10 numbers list
public class WhileLoopInt {
	public static void main(String[] args) {
		// initialize i
		int i = 0;
		// code for while loop
		while (i < 11) {
			// if we need to print numbers one below another - println(i)
			System.out.print(i + " ");
			// if we dont write i++ then only 0 will get printed, so i inctementation is
			// necessary if we need to print 0-10 list
			i++;
		}
	}
}