public class mathmethod4 {
    
    //Method
    static double division(double g, double h){
        double quotient = (g/h);
        return quotient;
    }

    //Main

    public static void main(String[] args) {
        int g = (60);
        int h = (25);

        double quotient = division(g, h);
        System.out.println("The quotient of " + g + " and " + h + " is " + quotient + "");
    }
}

