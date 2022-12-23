public class mathmethod19 {
  
    //Method
    static double kelvinconverter(double farenheit){
        double kconstant = (273.15);
        double kel = ((farenheit - 32)*(9/5));
        double kelvin = (kel + kconstant);
        return kelvin;        
    }

    //Main
    public static void main(String[] args) {
        double farenheit = (78);

        double kelvin =  kelvinconverter(farenheit);
        System.out.println(farenheit + " degrees farenheit is equal to " + kelvin + " Kelvin.");
    }
}
