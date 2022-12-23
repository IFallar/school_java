import java.util.Scanner;

public class stringmethod18 {
    
//Method

    static void codepointbefore(String str, int idx){
        int unic = str.codePointBefore(idx);
        System.out.println("Character (Unicode Point): " + unic);

    }

    //Main

    public static void main(String[] args) {
        
        System.out.println("Enter String: ");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();

        System.out.println("Enter Character Index: ");
        Scanner scan2 = new Scanner(System.in);
        int uni = scan2.nextInt();

        codepointbefore(str, uni);

    }
}
