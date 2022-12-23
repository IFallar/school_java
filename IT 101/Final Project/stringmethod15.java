import java.util.Scanner;

public class stringmethod15 {
    
    //Method

    static int wordcount(String str, String word){
    
        String a[] = str.split("\\s");
 
        int count = 0;
            for (int i = 0; i < a.length; i++){

            if (word.equals(a[i]))
            count++;
        }
 
        return count;
}

    //Main

    public static void main(String[] args) {

        System.out.println("Enter a String: ");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();

        System.out.println("\nEnter the word to be counted: ");
        Scanner scan2 = new Scanner(System.in);
        String word = scan2.nextLine();

        int output = wordcount(str, word);
        System.out.println("\nThere are " + output + " instances of " + "'" + word + "'");
    }
    
}
