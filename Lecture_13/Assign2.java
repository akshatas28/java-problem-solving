import java.util.*;

//lecture 13 - strings : Input an string from the user. replace all e with i within that string
public class Assign2 {
	public static void main(String[] args) {
		// fetch string
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder(str);
		String result = "";
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == 'e') {
				result += 'i';
			} else {
				result += sb.charAt(i);
				continue;
			}
		}
		System.out.print(result);
		sc.close();
	}
}
