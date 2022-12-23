public class mathmethod14 {

   //Method
   static double farenheitconverter(double celsius){
        double far = ((celsius*9/5)+32);
        return far;        
}

    //Main
    public static void main(String[] args) {
        double celsius = (1);

        double farenheit =  farenheitconverter(celsius);
        System.out.println(celsius + " degrees celsius is equal to " + farenheit + " degrees farenheit.");
    }
}

