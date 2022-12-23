import java.util.InputMismatchException;
import java.util.Scanner;

public class forloopexercise3 {
    public static void main(String[] args) {
        int pos = 0, neg = 0, zer = 0;
        
        System.out.println("Enter the numbers (Input a Non-Integer when finished) : ");
        

        while (true) {
            try {
                int n = new Scanner(System.in).nextInt();
                if (n>0)
                {
                    pos++;
                }
                if (n==0)
                {
                    zer++;
                }
                if (n<0)
                {
                    neg++;
                }
            } catch (InputMismatchException ignored) {
                break;
            }
            
        }

        System.out.println ("Number of Positive Numbers: " + pos);
        System.out.println ("Number of Zeroes: " + zer);
        System.out.println ("Number of Negative Numbers: " + neg);
    }
}
