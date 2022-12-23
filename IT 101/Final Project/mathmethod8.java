public class mathmethod8 {

    static int least(int o, int p, int q, int r){
        int smallest = 0;
        if (o < p && o < q && o < r){
            smallest = o;
        }
        else if (p < o && p < q && p < r){
            smallest = p;
        }
        else if (q < o && q < p && q < r){
            smallest = q;
        }
        else if (q < o && q < p && q < r){
            smallest = r;
        }
        return smallest;
    }

    //Main
    public static void main(String[] args) {
        int o = (21);
        int p = (18);
        int q = (6);
        int r = (43);
        
        int smallest = least(o, p, q, r);
        System.out.println("The smallest number is " + smallest);
    }
}

