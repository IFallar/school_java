public class mathmethod6 {

    static double squareroot(double j){
        double root = java.lang.Math.sqrt(j);
        return root;
    }

    //Main
    public static void main(String[] args) {
        int j = (144);

        double root = squareroot(j);
        System.out.println("The square root of " + j + " is " + root);
    }
}
