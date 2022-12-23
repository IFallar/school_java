import java.util.Scanner;

public class DrinkMachineArray{
    public static void main(String[] args) {

//Items, Price and Stock:
        String drinks[] = {"Water", "Soda", "Coffee"};
        int priceandstock[][]={{10, 12, 15},
                               {10, 10, 10}};

        while(priceandstock[1][0] > 0 || priceandstock[1][1] > 0 || priceandstock[1][2] > 0){
            System.out.println("================================ \nWhat drink would you like?");
            System.out.println("[1] Water  - P10 - " + priceandstock[1][0] + " Remaining");
            System.out.println("[2] Soda   - P12 - " + priceandstock[1][1] + " Remaining");
            System.out.println("[3] Coffee - P15 - " + priceandstock[1][2] + " Remaining");
            System.out.println("================================");

                int input = new Scanner(System.in).nextInt();
                    int i = (input-1);
                    if(i>2){
                        System.out.println("Not Available!");                       
                    }
                    else{
                        System.out.println("How many would you like?");
                        int amount = new Scanner(System.in).nextInt();
                        if(amount>priceandstock[1][i]){
                            System.out.println("Not Enough Stock!");
                        }
                        else{
                            System.out.println("Enter Payment Amount...");
                            int payment = new Scanner(System.in).nextInt();
                            if((priceandstock[0][i]*amount) > payment){
                                    System.out.println("You don't have enough money!");
                                        }
                            else{
                                    priceandstock[1][i] = priceandstock[1][i] - amount;
                                    int change = payment - priceandstock[0][i]*amount;
                                    System.out.println("Enjoy your " + drinks[i] + "! Your change is P" + change);
                                    System.out.println("Would you like to order again? (Y/N)");
                                        String prompt = new Scanner(System.in).nextLine();
                                            switch(prompt){
                                                case "Y":
                                                    break;
                                                case "N": 
                                                    priceandstock[1][0] = 0; 
                                                    priceandstock[1][1] = 0;
                                                    priceandstock[1][2] = 0;
                                                }
                                }            
                        }
                    }
            }      
    }
}
    



        

    
