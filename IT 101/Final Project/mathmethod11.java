public class mathmethod11 {
    
    //Method
    static double pythagorean(double a, double b){
        double sidea = (a*a);
        double sideb = (b*b);
        double c = (sidea + sideb);
        double hypotenuse = java.lang.Math.sqrt(c);
        return hypotenuse;
        
    }

    //Main
    public static void main(String[] args) {
        int a = (4);
        int b = (3);

        int hypotenuse = (int) pythagorean(a, b);
        System.out.println("The hypotenuse is " + hypotenuse + "cm");
    }
}
