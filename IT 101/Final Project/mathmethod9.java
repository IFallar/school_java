public class mathmethod9 {
    
    static int greatest(int s, int t, int u, int v){
        int highest = 0;
        if (s > t && s > u && s > v){
            highest = s;
        }
        else if (t > s && t > u && t > v){
            highest = t;
        }
        else if (u > s && u > t && u > v){
            highest = u;
        }
        else if (v > s && v > t && v > u){
            highest = v;
        }
        return highest;
    }

    //Main
    public static void main(String[] args) {
        int s = (493);
        int t = (212);
        int u = (62);
        int v = (429);
        
        int highest = greatest(s, t, u, v);
        System.out.println("The highest number is " + highest);
    }
}

