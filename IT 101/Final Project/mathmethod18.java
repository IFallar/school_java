public class mathmethod18 {
    
    //Method
    static double simpleinterest(double initprincipal, double interate, double years){
        double P = initprincipal;
        double r = (interate/100);
        double t = years;
        
        double interest = (P*r*t);
        return interest;
    }

    //Main

    public static void main(String[] args) {
        double years = (5);
        double interate = (.5);
        double initprincipal = (5000);

        double interest = simpleinterest(initprincipal, years, interate);
        System.out.println("The interest is equals to " + interest);
    }
}



