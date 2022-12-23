import java.util.Scanner;

public class stringmethod12 {

    //Method

    static String first5(String str){
        String first5ch = "";
            if (str.length() > 5) {
                first5ch = str.substring(0, 5);
            } 
            else{
                first5ch = str;
            }
        return first5ch;

    }

    //Main

    public static void main(String[] args) {
        
        System.out.println("Enter a String: ");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();

        String output = first5(str);
        System.out.println("\nThe first 5 characters are: " + output);
    }
}
