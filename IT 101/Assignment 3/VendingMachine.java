import java.util.Scanner;
@SuppressWarnings("resource")


public class VendingMachine {

    static String order(String item){
        return item;

    }
    static int calc(int price, int amount, int payment){
        return payment-price*amount;
    }
    
    public static void main(String[] args) {

    //Values and Prices
    
        int Coffee = 10, Chocolate = 10, Water = 10;
        int price = 0;
        String item = ("");
        
    //Main
        while(Coffee >0 || Chocolate >0 || Water >0){
            System.out.println("=====Available Drinks=====");
            System.out.println("(1) Coffee - P15.00 " + "(" + Coffee + ")" + " Remaining");
            System.out.println("(2) Hot Chocolate - P20.00 " + "(" + Chocolate + ")" + " Remaining");
            System.out.println("(3) Water - P10.00 " + "(" + Water + ")" + " Remaining");
            System.out.println("==========================");
        
        //Input
            System.out.println("Enter the Number of the Drink you want to buy");
            int drink = new Scanner(System.in).nextInt();
            System.out.println("How Many?");
            int amount = new Scanner(System.in).nextInt();
            System.out.println("How much are you paying?");
            int payment = new Scanner(System.in).nextInt();
        
        //Setting Price and Checking inventory
                if (drink == 1){
                    item = ("Coffee");
                        price = 15; 
                }
                else if (drink == 2){
                    item = ("Chocolate");
                    price = 20;
                }
                else if (drink == 3){
                        item = ("Water");
                        price = 10;
                }

        //Updating Inventory and Validating Purchase
                
                if(payment >= amount*price && amount <= 10){
                    if(drink == 1){
                        Coffee -= amount;
                    }
                    else if (drink == 2){
                        Chocolate -= amount;
                    }
                    else if (drink == 3){
                        Water -= amount;
                    }

        //Methods
                double Change = calc(price, amount, payment);
                String order = order(item);

        //Finalization
                System.out.println("==========================");
                System.out.println("Thank you for your purchase." + "\nEnjoy your " + order + "!" + " \nYour change is P" + Change);
                System.out.println("");
                    if (Coffee >0 || Chocolate >0 || Water >0){
                        System.out.println("Would you like something else? (Y/N)");
                            String prompt = new Scanner(System.in).nextLine();
                                switch(prompt){
                                    case "Y":
                                        break;
                                    case "N": 
                                        Chocolate = 0; 
                                        Coffee = 0;
                                        Water = 0;
                                }
                    }
                    else
                        System.out.println("Sold Out!");
                }
                else{
                    System.out.println("==========================");
                    if(payment<amount*price){
                        System.out.println("You don't have enough money.");
                    }
                    else if(amount>10){
                        System.out.println("Not enough stock");
                    }
                    System.out.println("");
                    System.out.println("Would you like to order again? (Y/N)");
                            String prompt = new Scanner(System.in).nextLine();
                                switch(prompt){
                                    case "Y":
                                        break;
                                    case "N": 
                                        Chocolate = 0; 
                                        Coffee = 0;
                                        Water = 0;
                                }
            }
        }
    }
 }
