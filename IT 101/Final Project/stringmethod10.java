import java.util.Scanner;

public class stringmethod10 {

    //Method

    static String countrycode(String number){
        String prefix = "+63";
        String newnum = number.replaceFirst("[0]", prefix);
        return newnum;
    }

    //Main

    public static void main(String[] args) {
        
        System.out.println("Please Enter your Number: ");
        Scanner scan1 = new Scanner(System.in);
        String number = scan1.nextLine();

        String newnum = countrycode(number);
        System.out.println("\nYour number with appended country code :\n" + newnum);
    }
}
