import java.util.*;

public class ForLoopSum {
	public static void main(String[] args) {
		// learning for loop
		// print sum for n numbers using for loop
		// n=4
		int sum = 0;
		for (int i = 1; i < 5; i++) {
			sum = i + sum;
			// if sum is declared inside then that will get stuck in the stuck and no
			// expected output can be received
		}
		System.out.print(sum);
	}
}