import java.util.Scanner;
@SuppressWarnings("resource")

public class FunctionAssignment2 {

    static void receipt(int drink, int amount, int payment, int Coffee, int Chocolate, int Water){
        int cprice = 15, chprice = 20, wprice = 10;
        System.out.println("==========================");
        
        if (drink == 1 && payment >= cprice*amount){
            int Change = payment - cprice*amount;
            System.out.println("Thank you for your Purchase! \nYour change is " + Change);
        }
        else if (drink == 2 && payment >= chprice*amount){
            int Change = payment - chprice*amount;

            System.out.println("Thank you for your Purchase! \nYour change is " + Change);
        }
        else if (drink == 3 && payment >= wprice*amount){
            int Change = payment - wprice*amount;

            System.out.println("Thank you for your Purchase! \nYour change is " + Change);
        }
        else 
            System.out.println("You don't have enough money");

            
    }

    public static void main(String[] args) {
        int Coffee = 10, Chocolate = 10, Water = 10;
        while(Coffee >0 || Chocolate >0 || Water >0){
            System.out.println("=====Available Drinks=====");
            System.out.println("(1) Coffee - P15.00 " + "(" + Coffee + ")" + " Remaining");
            System.out.println("(2) Hot Chocolate - P20.00 " + "(" + Chocolate + ")" + " Remaining");
            System.out.println("(3) Water - P10.00 " + "(" + Water + ")" + " Remaining");
            System.out.println("==========================");

            System.out.println("Enter the Number of the Drink you want to buy");
            int drink = new Scanner(System.in).nextInt();
            System.out.println("How Many?");
            int amount = new Scanner(System.in).nextInt();
            System.out.println("How much are you paying?");
            int payment = new Scanner(System.in).nextInt(); 
                
            receipt(drink, amount, payment, Coffee, Chocolate, Water);
                
                if(drink == 1){
                    Coffee -= amount;
                }
                else if (drink == 2){
                    Chocolate -= amount;
                }
                else if (drink == 3){
                    Water -= amount;
                }
            
            System.out.println("==========================");
            System.out.println("");
                if (Coffee >0 || Chocolate >0 || Water >0){
                    System.out.println("Would you like something else?");
                }
                else
                    System.out.println("Sold Out!");
        }
        
    }
  
}
