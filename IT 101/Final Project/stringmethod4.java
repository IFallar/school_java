import java.util.Scanner;

public class stringmethod4 {

    //Method

    static String combine(String str, String str2){
        String result = str + str2;
        return result;
    }

    //Main
    
    public static void main(String[] args) {
        
        System.out.println("Enter a string: ");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();

        System.out.println("\nEnter another string: ");
        Scanner scan2 = new Scanner(System.in);
        String str2 = scan2.nextLine();

        String output = combine(str, str2);

        System.out.println("\nResult: " + output);
    }

}
