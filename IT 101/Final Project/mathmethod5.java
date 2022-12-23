public class mathmethod5 {
    
    static int squaring(int i){
        int square = (i*i);
        return square;
    }

    //Main
    public static void main(String[] args) {
        int i = (8);

        int square = squaring(i);
        System.out.println("The square of " + i + " is " + square);
    }
}
