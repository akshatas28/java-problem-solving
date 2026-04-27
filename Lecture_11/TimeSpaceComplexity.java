//Java - time and space complexity

// time complexity -- depends on operations needed for i/p size

//best case - omega (n), 
//average case - theta(n),
//worst case - big O(n)

//space complexity -- depends on i/p size

public class TimeSpaceComplexity {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Hello"); // for n times hello will be printed so time complexity is big O(n)
            // here for space complexity: vars will be stored in memory in a kind of stack
            // formation...as and when input is appended, it clears from stack and makes
            // room for next input
            // so space complexity will be big O(1) for this.
        }
    }
}