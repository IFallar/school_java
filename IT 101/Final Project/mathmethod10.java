public class mathmethod10 {
    
    //Method
    static double circumference(int radius){
        int r = radius;
        double c = (2*Math.PI*r);
        return c;
        
    }

    //Main

    public static void main(String[] args) {
        int radius = (12);
        
        double circ = circumference(radius);
        double roundOff = Math.round(circ*100.0)/100.0;
        System.out.printf("The circumference of a circle with radius of " + radius + "cm" + " is " + roundOff + "cm\n" );
    }
}

