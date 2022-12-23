
public class mathmethod2 {
    
    //Method

    static double subtraction(double c, double d){
        double difference = (c - d);
        return difference;
    }

    //Main

    public static void main(String[] args) {

        int c = (78);
        int d = (34);

        double difference = subtraction(c, d);
        System.out.println("The difference of " + c + " and " + d + " is " + difference + "");
    }
}
