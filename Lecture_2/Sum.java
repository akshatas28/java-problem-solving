public class Sum {
    // code for understanding mathematical fundamentals
    public static void main(String[] args) {
        int a = 10; // variable declarations
        int b = 25;
        int sum = a + b; // variable additions
        System.out.println(sum); // output = 35
        int mul = a * b; // multiplication operation
        int diff = a - b; // difference operation
        float mod = a % b;
        System.out.println(mul); // 250
        System.out.println(diff); // -15
        System.out.println(((a * b) / (a - b))); // -16
        System.out.println(((a * b) / (b - a))); // 16
        float c = ((a * b) / (b - a));
        System.out.println(c); // 16.0
        System.out.println(mod); // 10.0
        System.out.println("sum class over");
    }
}