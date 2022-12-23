public class mathmethod1 {

    //Method
    static double addition(double a, double b){
        double sum = (a + b);
        return sum;
    }

    //Main

    public static void main(String[] args) {
        int a = (5);
        int b = (8);

        double sum = addition(a, b);
        System.out.println("The sum of " + a + " and " + b + " is " + sum + "");
    }
}