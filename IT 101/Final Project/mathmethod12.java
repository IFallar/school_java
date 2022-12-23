public class mathmethod12 {
    
    //Method
    static double areacirc(int radius){
        int rad = (radius*radius);
        double area = (Math.PI*rad);
        return area;
        
    }

    //Main
    public static void main(String[] args) {

        int radius = (9);
        
        double areac = areacirc(radius);
        double roundOff = Math.round(areac*100.0)/100.0;
        System.out.println("The area of a circle with radius of " + radius + "cm" + " is " + roundOff + "cm");
    }
}
