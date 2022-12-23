public class GradeClass {
    public static void main(String[] args) {   
        //Student A
        double a1 = 95;
        double a2 = 83;
        double a3 = 71;
        double a4 = 87;
        double sAv = ((a1 + a2 + a3 + a4) / 4 );
        if (sAv >= 96){
            System.out.println("Student A: " + sAv + " - BEST");
        } else if (sAv >= 86 && sAv <= 95) {
            System.out.println("Student A: " + sAv + " - BETTER");  
        } else if (sAv >= 75 && sAv <= 85 ){
            System.out.println("Student A: " + sAv + " - GOOD"); 
        } else 
            System.out.println("Student A: " + sAv + " - FAILED");

        //Student B
        double b1 = 81;
        double b2 = 97;
        double b3 = 89;
        double b4 = 96;
        double sBv = ((b1 + b2 + b3 + b4) / 4 );
        if (sBv >= 96){
            System.out.println("Student B: " + sBv + " - BEST");
        } else if (sBv >= 86 && sBv <= 95) {
            System.out.println("Student B: " + sBv + " - BETTER");  
        } else if (sBv >= 75 && sBv <= 85 ){
            System.out.println("Student B: " + sBv + " - GOOD"); 
        } else 
            System.out.println("Student B: " + sBv + " - FAILED");

        //Student C
        double c1 = 82;
        double c2 = 71;
        double c3 = 75;
        double c4 = 70;
        double sCv = ((c1 + c2 + c3 + c4) / 4 );
        if (sCv >= 96){
            System.out.println("Student C: " + sCv + " - BEST");
        } else if (sCv >= 86 && sCv <= 95) {
            System.out.println("Student C: " + sCv + " - BETTER");  
        } else if (sCv >= 75 && sCv <= 85 ){
            System.out.println("Student C: " + sCv + " - GOOD"); 
        } else 
            System.out.println("Student C: " + sCv + " - FAILED");

        //Student D
        double d1 = 95;
        double d2 = 98;
        double d3 = 96;
        double d4 = 99;
        double sDv = ((d1 + d2 + d3 + d4) / 4 );
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
