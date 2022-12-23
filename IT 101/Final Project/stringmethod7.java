import java.util.Scanner;

public class stringmethod7 {

    //Method
    
    static String capital(String str){
        String result = str.toLowerCase();
        return result;
    }

    //Main

    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();

        String output = capital(str);
        System.out.println("\nOutput:\n" + output);
    }
}
