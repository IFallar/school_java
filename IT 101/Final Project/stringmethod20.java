import java.util.Scanner;

public class stringmethod20 {
    
    //Method

    static String replacer(String str, String replacee, String strreplacer){
        String newStr = str.replaceAll(replacee, strreplacer);
        return newStr;
    }

    //Main

    public static void main(String[] args) {

        System.out.println("Enter String: ");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();  

        System.out.println("\nEnter Word to be replaced: ");
        Scanner scan2 = new Scanner(System.in);
        String replacee = scan2.nextLine();  

        System.out.println("\nEnter Word to replace it: ");
        Scanner scan3 = new Scanner(System.in);
        String strreplacer = scan3.nextLine();  

        String newstr = replacer(str, replacee, strreplacer);
	System.out.println("\nOutput String:\n" + newstr);
    }
}
