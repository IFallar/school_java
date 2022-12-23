import java.util.Arrays;
import java.util.Scanner;

public class stringmethod14{

    //Method

    static String[] strtoarr(String str){
        String[] strArray = str.split("\\s");

        return strArray;
    }

    //Main

    public static void main(String[] args) {
        
        System.out.println("Enter a String: ");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();

        String[] output = strtoarr(str);
        System.out.println("\nOutput:\n" + Arrays.toString(output));

    }


}