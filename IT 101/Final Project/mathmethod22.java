public class mathmethod22 {
  
    //Method
    static double dltimer(double dlsizegb, double speedmbps){
        double dlsizemb = (dlsizegb*1000);
        double dltimesec = (dlsizemb/speedmbps);
        double dltimemin = (dltimesec/60);
            if (dltimesec < 60){
                return dltimesec;
            }
            else{
                return dltimemin;
            }
                           
    }

    //Main
    public static void main(String[] args) {
        double dlsizegb = (3);
        double speedmbps = (2);

        double dltime = dltimer(dlsizegb, speedmbps);      
        if (dltime < 1){
            System.out.println("A " + dlsizegb + " gb file at " + speedmbps + " mbps will take " + dltime + " seconds to download.");
        }  
        else{
            System.out.println("A " + dlsizegb + " gb file at " + speedmbps + " mbps will take " + dltime + " minutes to download.");
        } 
    }
}
