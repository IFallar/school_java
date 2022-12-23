public class ClassGrades {
    public static void getgrades(String student, double a, double b, double c, double d) {
        double ave = ((a + b + c + d) / 4);
        if (ave >= 96){
            System.out.println(" Student " + student + ": " + ave + " - BEST");
        } else if (ave >= 86 && ave <= 95) {
            System.out.println(" Student " + student + ": " + ave + " - BETTER"); 
        } else if (ave >= 75 && ave <= 85 ){
            System.out.println(" Student " + student + ": " + ave + " - GOOD");
        } else 
            System.out.println(" Student " + student + ": " + ave + " - FAILED");
    }
    public static void main(String[] args) {
        getgrades("A", 95, 83, 71, 87);
        getgrades("B", 81, 97, 89, 96);
        getgrades("C", 82, 71, 75, 70);
        getgrades("D", 95, 98, 96, 99);
    }
}
