import java.util.Scanner;
@SuppressWarnings("resource")

public class FunctionAssignment1B {
    static void ave(double a, double b, double c, double d){
        System.out.println("===============================");
        double sum = (a + b + c + d);
        double average = (sum/4);
        System.out.println("Average is " + average);
    }

    public static void main(String[] args) {
        System.out.println("Enter four Numbers");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        int d = new Scanner(System.in).nextInt();
        ave(a, b, c, d);
    } 
}
