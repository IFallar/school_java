public class Voting {
    public static void main(String[] args) {
    //Ages    
    
        int x = 42;
        int y = 14;
        int z = 18;

        System.out.println("18 is the legal voting age.");
        System.out.println();
    
    //Conditions
    if (x >= 18){
        System.out.println( x + " is Eligible to vote.");
    }  
    else
        System.out.println( x + " is Ineligible to vote.");
    if (y >= 18){
        System.out.println( y + " is Eligible to vote.");
    }
    else
        System.out.println( y + " is Ineligible to vote.");
    if (z >= 18){
        System.out.println( z + " is Eligible to vote.");
    }       
    else
        System.out.println( z + " is Ineligible to vote.");
    }
}
