import java.util.Arrays;
import java.util.Scanner;

public class stringmethod1{

    //Method

    static String lettersorter(String str){
        char strarray[] = str.toCharArray();
        Arrays.sort(strarray);
        String sorted = new String(strarray);
        return sorted;
    }

    //Main

    public static void main(String[] args) {

        System.out.println("Enter a string: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        String sorted = lettersorter(str);
        
        System.out.println("\nSorted Characters: \n" + sorted);
    }
}
