public class mathmethod3 {
    
    //Method
    static double multiplication(double e, double f){
        double product = (e*f);
        return product;
    }

    //Main

    public static void main(String[] args) {
        int e = (9);
        int f = (23);

        double product = multiplication(e, f);
        System.out.println("The product of " + e + " and " + f + " is " + product + "");
    }
}