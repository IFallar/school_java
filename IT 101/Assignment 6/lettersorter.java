import java.util.Arrays;
import java.util.Scanner;

public class lettersorter{

//Built in Method used: ".toCharArray()"

    public static void main(String[] args) {


        System.out.println("Enter a string: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        char strarray[] = str.toCharArray();
        Arrays.sort(strarray);
        
        System.out.println(new String(strarray));
    }

}