import java.util.Scanner;
@SuppressWarnings("resource")

public class FunctionAssignment1C {
    static void strcount(String str){
        System.out.println("===============================");
        int count = 1;
        for (int i=0;i<=str.length()-1;i++)
        {
            if (str.charAt(i) == ' ' && str.charAt(i+1) != ' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        System.out.println("Input String");
        String str  = new Scanner(System.in).nextLine();
        strcount(str);
    } 
}
