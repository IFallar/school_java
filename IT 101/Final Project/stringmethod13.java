import java.util.Scanner;

public class stringmethod13 {
    
     //Method

     static String last5(String str){
        String last5ch = "";
            if (str.length() > 5) {
                last5ch = str.substring(str.length() - 5);
            } 
            else{
                last5ch = str;
            }
        return last5ch;

    }

    //Main

    public static void main(String[] args) {
        
        System.out.println("Enter a String: ");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();

        String output = last5(str);
        System.out.println("\nThe last 5 characters are: " + output);
    }
}


