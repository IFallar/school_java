public class mathmethod17 {
    
    //Method
    static double cylindervol(double height, double radius){
        double radsq = (radius*radius);
        double Volume = (Math.PI*height*radsq);
        return Volume;
                                
    }

    //Main
    public static void main(String[] args) {
        double height = (35);
        double radius = (15);

        double volume =  cylindervol(height, radius);
        double roundOff = Math.round(volume*100.0)/100.0;
        System.out.println("A cylinder with a height = " +height+ " and radius = " +radius+ " has a volume = " + roundOff);
    }
}
