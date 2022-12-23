public class mathmethod20 {
  
    //Method
    static double voltagecalculator(double resistance, double amperes){
        double voltage = (amperes + resistance);
        return voltage;        
    }

    //Main
    public static void main(String[] args) {
        double resistance = (440);
        double amperes = (0.062);

        double voltage =  voltagecalculator(resistance, amperes);
        System.out.println("Voltage is equals to " + voltage);
    }
}
