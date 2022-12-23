import java.util.Scanner;

public class stringmethod9 {

    static boolean lengthcheker(String input){

        int passlength = input.length();
        if(passlength >= 8){
            System.out.println("\nPassword Set!");
            boolean i = false;
            return i;
        }
        else{
            System.out.println("\nMust be atleast 8 characters.\n");
            boolean i = true;
            return i;
        }

    }

    public static void main(String[] args) {

        boolean i = true;
        while(i == true){

            System.out.println("Please Enter your password (8 characters): ");
            Scanner scan1 = new Scanner(System.in);
            String input = scan1.nextLine(); 
    
            i = lengthcheker(input);
        }
    }
}
