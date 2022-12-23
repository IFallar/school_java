import java.util.Scanner;


public class stringmethod16 {
    
    //Method

    static void characterfinder(String str, int idx){
        int index = str.charAt(idx);
        System.out.println("\nCharacter at position " + idx + " is: " + (char)index);

    }

    //Main

    public static void main(String[] args) {
        
        System.out.println("Enter String: ");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();

        System.out.println("\nEnter Index: ");
        Scanner scan2 = new Scanner(System.in);
        int idx = scan2.nextInt();

        characterfinder(str, idx);

    }

}
