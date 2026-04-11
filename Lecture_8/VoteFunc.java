//5. func that takes in age as input and returns if that person is eligible to vote or not. A person >18 is eligible to vote

import java.util.*;

public class VoteFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(voteFunc(age));
    }

    public static String voteFunc(int age) {
        if (age > 18) {
            return "eligible";
        } else {
            return "not eligible";
        }
    }
}