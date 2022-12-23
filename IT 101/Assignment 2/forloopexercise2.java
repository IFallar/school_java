import java.util.Scanner;

public class forloopexercise2 {
    public static void main(String[] args) {
        int i, n=0, s=0;
        System.out.println("Input the 5 numbers : ");     
//Loop	
		for (i=0;i<5;i++){
		    n = new Scanner(System.in).nextInt();
  		    s += n;
	    }
//Output
	System.out.println("Sum = " + s);
    }  
}
