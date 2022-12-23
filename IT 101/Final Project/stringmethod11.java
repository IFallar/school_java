import java.util.Scanner;
import java.util.StringTokenizer;

public class stringmethod11 {
    
    //Method

    static void splitter(String str){
	System.out.println("\nOutput:");
        StringTokenizer defaultTokenizer = new StringTokenizer(str);
        while (defaultTokenizer.hasMoreTokens())
            {
                System.out.println(defaultTokenizer.nextToken());
            }

    }

    //Java

    public static void main(String[] args) {

        System.out.println("Enter a String: ");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();

        splitter(str);
        
    }

}
