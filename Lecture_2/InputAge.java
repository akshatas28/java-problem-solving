import java.util.*;

//code for checking if else condition
//to check if entered age is adult or not
public class InputAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("adult");
		} else {
			System.out.println("not adult");
		}
	}
}