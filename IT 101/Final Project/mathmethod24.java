public class mathmethod24 {

    //Method
    static double percentfinder(double value, double percent){
        double percentage = (percent/100);
        double result = (value*percentage);
        return result;
    }

    public static void main(String[] args) {
        double value = (1892);
        double percent = (67);

        double result = percentfinder(value, percent);
        System.out.println(percent + "% of " + value + " is " + result);
    }
}
