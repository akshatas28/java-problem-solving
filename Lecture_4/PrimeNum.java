import java.util.Scanner;

public class PrimeNum {

    public static boolean isPrime(int n) {
        // 0 and 1 are not prime numbers
        if (n <= 1)
            return false;

        // Check for factors from 2 up to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a factor, so not prime
            }
        }
        return true; // No factors found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        scanner.close();
    }

}
