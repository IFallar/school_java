import java.util.Scanner;

public class sohcahtoa {

//Built in Method used: ".equalsIgnoreCase()" , ".sin()", .cos()", .tan()" and ."toRadians"

    public static void main(String[] args) {
        
        System.out.println("What are you looking for?");
        System.out.println("[S] Sine");
        System.out.println("[C] Cosine");
        System.out.println("[T] Tangent");
        System.out.println("==========================");

        Scanner input = new Scanner(System.in);
        String operation = input.nextLine();

        if(operation.equalsIgnoreCase("S")){
            System.out.println("Enter the Angle:");
            int angle = new Scanner(System.in).nextInt();
            double answer = Math.sin(Math.toRadians(angle));
            System.out.println("Sine = " + answer);
        }
        else if(operation.equalsIgnoreCase("C")){
            System.out.println("Enter the Angle:");
            int angle = new Scanner(System.in).nextInt();
            double answer = Math.cos(Math.toRadians(angle));
            System.out.println("Cosine = " + answer);
        }
        else if(operation.equalsIgnoreCase("T")){
            System.out.println("Enter the Angle:");
            int angle = new Scanner(System.in).nextInt();
            double answer = Math.tan(Math.toRadians(angle));
            System.out.println("Tangent = " + answer);
        }

    }
    
}
