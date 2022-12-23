import java.util.Scanner;

public class stringmethod2 {


    static void checker(String password1, String password2){
        boolean x = password1.equals(password2);
            if(x){
                System.out.println("\nPasswords Match!");
            }
            else{
                System.out.println("\nPasswords do not match!");
            }
    }

    public static void main(String[] args) {
        
        System.out.println("Enter Password: ");
        Scanner pass1 = new Scanner(System.in);
        String password1 = pass1.nextLine();

        System.out.println("\nConfirm Password: ");
        Scanner pass2 = new Scanner(System.in);
        String password2 = pass2.nextLine();

        checker(password1, password2);
    }
    
}

