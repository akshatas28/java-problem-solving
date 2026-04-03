import java.util.*;

public class QuestionForLoop {
    public static void main(String[] args) {
        for (;;) {
            System.out.println("A"); // The loop does NOT need initialization to start. That part is purely optional
                                     // and for the programmer’s convenience.
            // it will print infinite A until stopped externally/manually by users.
            // no condition provided, so it's qual to always run, no updation, so whatever
            // print is provided, will be printed rather than any incrementation.
        }
    }
}