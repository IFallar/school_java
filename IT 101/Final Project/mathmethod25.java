public class mathmethod25 {
    
    //Method
    static double volumesphere(double radius){
        double radcube = (radius*radius*radius);
        double volume = ((4/3)*Math.PI*radcube);
        return volume;

    }


    //Main

    public static void main(String[] args) {
        double radius = (9);

        double spherevol = volumesphere(radius);
	double roundOff = Math.round(spherevol*100.0)/100.0;
        System.out.print("Volume is equals to " + roundOff + "\n" );  
      
    }
}
