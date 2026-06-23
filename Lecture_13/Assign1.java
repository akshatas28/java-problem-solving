import java.util.*;
//lecture 13 - strings : Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
//Example :

//email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”

//email = “helloWorld123@gmail.com”; username = “helloWorld123”
public class Assign1 {
	public static void main(String[] args) {
		// fetch string
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder(str);
		String result = "";
		for (int i = 0; i < sb.length() - 1; i++) {
			if (sb.charAt(i) == '@') {
				break;
			} else {
				result += sb.charAt(i);
			}
		}
		System.out.print(result);
		sc.close();
	}
}
