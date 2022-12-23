public class mathmethod15 {
    
    //Method
    static double feetconverter(double meters){
        double ft = (meters*3.281);
        return ft;        
    }

    //Main
    public static void main(String[] args) {
        double meters = (20);

        double feet =  feetconverter(meters);
        System.out.println(meters + " meters is equals to " + feet + " feet.");
    }
}
