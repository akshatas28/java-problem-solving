import java.util.*;

// code to print 0-10 numbers list
public class WhileLoopSum {
	public static void main(String[] args) {
		// initialize i
		int i = 1;
		// code for while loop
		int sum = 0;
		while (i < 5) {
			// if we need to print numbers one below another - println(i)
			// System.out.print(i);
			sum = i + sum;
			i++;
			// if we dont write i++ then only 0 will get printed, so i inctementation is
			// necessary if we need to print 0-10 list
		}
		System.out.print("sum:" + sum);
	}
}