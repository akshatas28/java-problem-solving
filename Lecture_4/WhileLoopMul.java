import java.util.*;

// code to print table of n: n is input given by user 
public class WhileLoopMul {
	public static void main(String[] args) {
		// fetch n
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value of which table needs to be printed");
		int n = sc.nextInt();
		int mul = 0;
		// code for while loop
		int i = 1;
		while (i <= 10) {
			// if we need to print numbers one below another - println(i)
			mul = i * n;
			System.out.println(n + " * " + i + " = " + mul);
			// if we dont write i++ then only 0 will get printed, so i incrementation is
			// necessary if we need to print 0-10 list
			i++;
		}

	}
}