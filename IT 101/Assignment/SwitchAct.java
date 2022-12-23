public class SwitchAct {
    
    public static void getgrades(String student, int a, int b, int c, int d) {
        int ave = ((a + b + c + d) / 4);
        switch (ave){
            case 100:
            case 99:
            case 98:
            case 97:
            case 96:
                System.out.println(" Student " + student + ": " + ave + " - BEST");
                break;
            case 95:
            case 94:    
            case 93:
            case 91:
            case 90:
            case 89:
            case 88:
            case 87:
            case 86:
            System.out.println(" Student " + student + ": " + ave + " - BETTER");
                break;
            case 85:
            case 84:
            case 83:
            case 81:
            case 80:
            case 79:
            case 78:
            case 77:
            case 76:
            case 75:
                System.out.println(" Student " + student + ": " + ave + " - GOOD");
                break;
            default:
                System.out.println(" Student " + student + ": " + ave + " - FAILED");
                break;
        }
        
   }
    
    public static void main(String[] args) {
        getgrades("A", 95, 83, 71, 87);
        getgrades("B", 81, 97, 89, 96);
        getgrades("C", 82, 71, 75, 70);
        getgrades("D", 95, 98, 96, 99);
   } 

   
}
