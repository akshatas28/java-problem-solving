import java.util.*;
//lecture 12 - strings : Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
//Example :

//email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”

//email = “helloWorld123@gmail.com”; username = “helloWorld123”
public class StringDoNotPrintPostSpecificChar {
	public static void main(String[] args) {
		// fetch string
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '@') {
				break;
			} else {
				result += str.charAt(i);
			}
		}
		System.out.println(result);
	}
}