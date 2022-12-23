import java.util.Scanner;
@SuppressWarnings("resource")


public class FunctionAssignment2A {

    static String order(String item){
        return item;

    }
    static int calc(int price, int amount, int payment){
        return payment-price*amount;
    }
    
    public static void main(String[] args) {

    //Values and Prices
    
        int Coffee = 10, Chocolate = 10, Water = 10;
        int Cprice = 15, Chprice = 20, Wprice = 10;
        int stock = 0;
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

//Choice Validity Check

                if(drink == 1 || drink == 2 || drink == 3){   
                    if (drink == 1){
                        item = ("Coffee");
                        price = Cprice; 
                        stock = Coffee;
                    }
                    else if (drink == 2){
                        item = ("Chocolate");
                        price = Chprice;
                        stock = Chocolate;
                    }
                    else if (drink == 3){
                        item = ("Water");
                        price = Wprice;
                        stock = Water;
                    }

                    System.out.println("How Many?");
                    int amount = new Scanner(System.in).nextInt();
//Stock Check
                        if(amount<=stock){     
                            System.out.println("How much are you paying?");
                            int payment = new Scanner(System.in).nextInt();

//Payment Check

                                if(payment >= amount*price){
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
                                    System.out.println("Thank you for your purchase.");
                                    System.out.println("Enjoy your " + order + "!");
                                    System.out.println("Your change is P" + Change);
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
                                        else{
                                            System.out.println("Sold Out!");
                                        }

//Not Enough Money Error

                                }
                                else{
                                    System.out.println("==========================");
                                    System.out.println("You do not have enough money.");
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

//Not Enough in Inventory Error

                            }
                            else{
                                System.out.println("==========================");
                                System.out.println("Not Enough in Stock.");
                                System.out.println("");
                                System.out.println("Would you like to order something else? (Y/N)");
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

//Item Not Available Error                

                }
                else{
                    System.out.println("==========================");
                    System.out.println("That item is not available.");
                    System.out.println("");
                    System.out.println("Would you like to order something else? (Y/N)");
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
    
