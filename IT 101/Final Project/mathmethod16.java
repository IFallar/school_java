public class mathmethod16{

    //Method
    static double secondconverter(double days){
        double daylength = 86400;
        double secs = (days*daylength);
        return secs;
                                 
    }

    //Main
    public static void main(String[] args) {
        double days = (3);

        double converted =  secondconverter(days);
        System.out.println(days + " days is equals to " + converted + " seconds.");
    }
}