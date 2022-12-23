public class MyFirstProgram {
    
    
// Problem Number 1
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println();

// Problem Number 2

        int x = 42;
        int y = 14;
        int z = 18;

        System.out.println("18 is the legal voting age.");
        System.out.println();
        
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
    
    System.out.println();

// Problem Number 3

    //Student A
    float a1 = 95;
    float a2 = 83;
    float a3 = 71;
    float a4 = 87;
    float sAv = ((a1 + a2 + a3 + a4) / 4 );
    if (sAv >= 96){
        System.out.println("Student A: " + sAv + " - BEST");
    } else if (sAv >= 86 && sAv <= 95) {
        System.out.println("Student A: " + sAv + " - BETTER");  
    } else if (sAv >= 75 && sAv <= 85 ){
        System.out.println("Student A: " + sAv + " - GOOD"); 
    } else 
        System.out.println("Student A: " + sAv + " - FAILED");



    //Student B
    float b1 = 81;
    float b2 = 97;
    float b3 = 89;
    float b4 = 96;
    float sBv = ((b1 + b2 + b3 + b4) / 4 );
    if (sBv >= 96){
        System.out.println("Student B: " + sBv + " - BEST");
    } else if (sBv >= 86 && sBv <= 95) {
        System.out.println("Student B: " + sBv + " - BETTER");  
    } else if (sBv >= 75 && sBv <= 85 ){
        System.out.println("Student B: " + sBv + " - GOOD"); 
    } else 
        System.out.println("Student B: " + sBv + " - FAILED");

    //Student C
    float c1 = 82;
    float c2 = 71;
    float c3 = 75;
    float c4 = 70;
    float sCv = ((c1 + c2 + c3 + c4) / 4 );
    if (sCv >= 96){
        System.out.println("Student C: " + sCv + " - BEST");
    } else if (sCv >= 86 && sCv <= 95) {
        System.out.println("Student C: " + sCv + " - BETTER");  
    } else if (sCv >= 75 && sCv <= 85 ){
        System.out.println("Student C: " + sCv + " - GOOD"); 
    } else 
        System.out.println("Student C: " + sCv + " - FAILED");

    //Student D
    float d1 = 95;
    float d2 = 98;
    float d3 = 96;
    float d4 = 99;
    float sDv = ((d1 + d2 + d3 + d4) / 4 );
    if (sDv >= 96){
        System.out.println("Student D: " + sDv + " - BEST");
    } else if (sDv >= 86 && sDv <= 95) {
        System.out.println("Student D: " + sDv + " - BETTER");  
    } else if (sDv >= 75 && sDv <= 85 ){
        System.out.println("Student D: " + sDv + " - GOOD"); 
    } else 
        System.out.println("Student D: " + sDv + " - FAILED");


    }
}