public class mathmethod7 {

    //Method
    static double average(double k , double l, double m, double n){
            double ave = (k + l + m + n)/4;
            return ave;
    }
    
    //Main
    public static void main(String[] args) {
        int k = (67);
        int l = (43);
        int m = (23);
        int n = (89);
        double ave = average(k, l, m ,n);
        System.out.println("The average of (" + k + ", " + l + ", " + m + ", " + n + ") is " + ave + "");
    }
}
