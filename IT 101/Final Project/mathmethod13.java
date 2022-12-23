public class mathmethod13 {
    
    //Method
    static double poundconverter(double kg){
        double convertrate = 2.205;
        double lbs = (kg*convertrate);
        return lbs;        
    }

    //Main
    public static void main(String[] args) {
        double kg = (3);

        double lbs = poundconverter(kg);
        System.out.println(kg + " kilograms is equal to " + lbs + " pounds.");
    }
}
