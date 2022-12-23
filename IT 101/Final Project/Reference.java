public class Reference{
   
    public static void main(String[] args) {
    
    //Number 1

        //Original String
        String line1 = "May the warp be the gold light of dawn,";

        //Getting Indexes
        int index1 = line1.charAt(9);
        int index2 = line1.charAt(20);

        //Results
        System.out.println("Item No. 1: \n\nSource String: " + line1);
        System.out.println("Character at position 3 is: " + (char)index1);
        System.out.println("Character at position 20 is: " + (char)index2);
        System.out.println("==============================================");

    //Number 2.
        
        //Original String
        String line2 = "May the weft be the red glow of dusk,";

        //Getting Indexes
        int uni1 = line2.codePointAt(3);
        int uni2 = line2.codePointAt(22);

        //Results
        System.out.println("Item No. 2: \n\nSource String: " + line2);
        System.out.println("Character (Unicode Point): " + uni1);
        System.out.println("Character (Unicode Point): " + uni2);
        System.out.println("==============================================");

    //Number 3.
        
        //Original String
        String line3 = "May the fringes be the falling rain,";

        //Getting Indexes
        int buni1 = line3.codePointBefore(7);
        int buni2 = line3.codePointBefore(13);

        //Results
        System.out.println("Item No. 3: \n\nSource String: " + line3);
        System.out.println("Character (Unicode Point before Index): " + buni1);
        System.out.println("Character (Unicode Point before Index): " + buni2);
        System.out.println("==============================================");

    //Number 4.
        
        //Original String
        String line4 = "May the border be the standing rainbow,";

        //Getting Indexes
        int cpc1 = line4.codePointCount(1, 15);

        //Results
        System.out.println("Item No. 4: \n\nSource String: " + line4);
        System.out.println("Code Point Count: " + cpc1);
        System.out.println("==============================================");

    //Extra Line

        System.out.println("\nThus weave for us a garment of brightness.\n");
        

    }

}
