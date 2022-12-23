public class mathmethod21 {
    
    //Method
    static double auconverter(double au){
        double auconstant = (149597870.7);
        double auconvert = (au + auconstant);
        return auconvert;        
    }

    //Main
    public static void main(String[] args) {
        double au = (2);

        double auconvert =  auconverter(au);
        System.out.println(au + " AU is equal to " + auconvert + " Kilometers");
    }
}

