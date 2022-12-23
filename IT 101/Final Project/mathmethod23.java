public class mathmethod23 {
    
    //Method
    static double conevolume(double radius, double height){
       double radsq = (radius*radius);
       double h = (height/3);
       double volume = (Math.PI*radsq*h);
       return volume;
    
    }

    //Main
    public static void main(String[] args) {
      double radius = (5);
      double height = (7);
      
      double volume = conevolume(radius, height);
      double roundOff = Math.round(volume*100.0)/100.0;
      System.out.println("Volume is equals to " + roundOff + "\n");
    }
}
