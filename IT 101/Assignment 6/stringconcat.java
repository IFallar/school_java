import java.util.Scanner;

public class stringconcat {

//Built in Method used: ".concat()"
    
    public static void main(String[] args) {
        
        System.out.println("Enter a string: ");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();

        System.out.println("Enter another string: ");
        Scanner scan2 = new Scanner(System.in);
        String str2 = scan2.nextLine();

        System.out.println(str.concat(str2));
    }

}
