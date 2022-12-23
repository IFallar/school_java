import java.util.Scanner;

public class passwordchecker {

//Built in Method used: ".equals()"

    public static void main(String[] args) {
        
        System.out.println("Account Name: ");
        Scanner name = new Scanner(System.in);

        System.out.println("Enter Password: ");
        Scanner pass1 = new Scanner(System.in);
        String password1 = pass1.nextLine();

        System.out.println("Confirm Password: ");
        Scanner pass2 = new Scanner(System.in);
        String password2 = pass2.nextLine();

        boolean x = password1.equals(password2);
            if(x){
                System.out.println("Account Creation Successful!");
            }
            else{
                System.out.println("Password do not match!");
            }

    }
    
}
