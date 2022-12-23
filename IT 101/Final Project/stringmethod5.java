import java.util.Scanner;

public class stringmethod5 {

    //Method
        
    static String finder(String str, String substr){
        String main = str;
        boolean i = main.contains(substr);
        if(i = true){
            String check = "Substring found!";
            int position = str.indexOf(substr);
            String confirmation = check + " First instance at index " + position;
            return confirmation;
        }
        else{
            String confirmation = "Substring not Found!";
            return confirmation;
        }
        
    }

    //Main

    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();

        System.out.println("\nEnter the substring you're looking for: ");
        Scanner scan2 = new Scanner(System.in);
        String substr = scan2.nextLine();

        String output = finder(str, substr);
        System.out.println("\n" + output);
    }

}
