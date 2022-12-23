import java.util.Scanner;
@SuppressWarnings("resource")

public class FunctionAssignment1A {

    static void least(int a, int b, int c){
        System.out.println("===============================");
        if (a <= b && a <= c){
            System.out.println(a + " is the Smallest");
        }
        else if (b <= a && b <= c){
            System.out.println(b + " is the Smallest");
        }
        else 
            System.out.println(c + " is the Smallest");
    }

    public static void main(String[] args) {
        System.out.println("Enter the three Numbers");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        
        least(a, b, c);
    }   
}
