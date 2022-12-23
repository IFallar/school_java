import java.util.Scanner;

public class stringmethod8 {

    //Method

    static void reverse(String str){
        char[] ch = str.toCharArray();
        int j = ch.length;
	    for(var i = j ; i > 0 ; i--){
          System.out.print(ch[ i - 1 ]);  
        }
    }
    
    //Main

    public static void main(String[] args) {
        
        System.out.println("Enter a string: ");
        Scanner scan1 = new Scanner(System.in);
        String str = scan1.nextLine();

        System.out.println("\nReverse of '" + str + "' String is :"); 
        reverse(str);
    }

}



