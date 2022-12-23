import java.util.Scanner;

public class requiredanswer {

//Built in Method used: ".isEmpty()"
    
    public static void main(String[] args) {
    
    boolean i = true;
    while(i == true){
        System.out.println("Please Enter your Name (Required): ");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine(); 
        i = answer.isEmpty();
    }
    
    }

}
