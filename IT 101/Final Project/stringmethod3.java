import java.util.Scanner;

public class stringmethod3 {

    //Method

    static boolean required(String answer){
        return answer.isEmpty();

    }

    //Main
    
    public static void main(String[] args) {
    
    boolean i = true;
    while(i == true){
        System.out.println("Please Enter your Name (Required): ");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine(); 

        i = required(answer);
    }
	System.out.println("\nName Recorded!");
    
    }

}
