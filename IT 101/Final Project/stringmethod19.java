import java.util.Scanner;

public class stringmethod19 {
    
//Method

    static void codepointcounter(String str, int cp1, int cp2){
        int cpc1 = str.codePointCount(cp1, cp2);
        System.out.println("\nCode Point Count: " + cpc1);;

    }

    //Main

    public static void main(String[] args) {

        System.out.println("Enter String: ");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();
        
        System.out.println("\nEnter Initial Character Index: ");
        Scanner scan2 = new Scanner(System.in);
        int cp1 = scan2.nextInt();

        System.out.println("\nEnter Final Character Index: ");
        Scanner scan3 = new Scanner(System.in);
        int cp2 = scan3.nextInt();

        codepointcounter(str, cp1, cp2);

    }
}
