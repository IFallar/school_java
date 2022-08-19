import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DSA_HW {
    
    //METHODS

    static int distances(){
        int min = 10;
        int max = 100;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;

    }

      //THREE ROUTES
      
      static int time(int r1, int r2, int r3){

          if(r1<r2 && r1<r3){
              int time = (r1*10)/60; 
              return time; 
          }
          else if(r2<r1 && r2<r3){
              int time = (r2*10)/60;
              return time; 
          }
          else{
              int time = (r3*10)/60;
              return time; 
          }
      }

      static int path(int r1, int r2, int r3){

          if(r1<r2 && r1<r3){
              int Shortest = r1; 
              return Shortest;
          }
          else if(r2<r1 && r2<r3){
              int Shortest = r2;
              return Shortest;
          }
          else{
              int Shortest = r3;
              return Shortest;
          }
      }

      static String route(int r1, int r2, int r3, String PSR[]){
          if(r1<r2 && r1<r3){
            return PSR[0];
        }
        else if(r2<r1 && r2<r3){
            return PSR[1];
        }
        else{
            return PSR[2];
        }
      }

      static void allroutes(int r1, int r2, int r3, String PSR[]){
        int time1 = (r1*10)/60;
        int time2 = (r2*10)/60;
        int time3 = (r3*10)/60;

        System.out.println("All Routes:");
        System.out.println("Route: " + PSR[0] + " | Distance: " + r1 + "m" + " | Travel Time: " + time1 + "hrs");
        System.out.println("Route: " + PSR[1] + " | Distance: " + r2 + "m" + " | Travel Time: " + time2 + "hrs");
        System.out.println("Route: " + PSR[2] + " | Distance: " + r3 + "m" + " | Travel Time: " + time3 + "hrs");
      }
      
      //FOUR ROUTES

      static int fourtime(int r1, int r2, int r3, int r4){

        if(r1<r2 && r1<r3 && r1<r4){
          int time = (r1*10)/60; 
          return time;
        }
        else if(r2<r1 && r2<r3 && r2<r4){
          int time = (r2*10)/60;
          return time;
        }
        else if(r3<r1 && r3<r2 && r3<r4){
          int time = (r3*10)/60;
          return time;
        }
        else{
          int time = (r4*10)/60;
          return time;
        }  
      }

      static int fourpath(int r1, int r2, int r3, int r4){

        if(r1<r2 && r1<r3 && r1<r4){
          int Shortest = r1; 
              return Shortest;
        }
        else if(r2<r1 && r2<r3 && r2<r4){
          int Shortest = r2; 
              return Shortest;
        }
        else if(r3<r1 && r3<r2 && r3<r4){
          int Shortest = r3; 
              return Shortest;
        }
        else{
          int Shortest = r4; 
              return Shortest;
        }  
      }

      static String fourroute(int r1, int r2, int r3, int r4, String PSR[]){
        if(r1<r2 && r1<r3 && r1<r4){
          return PSR[0];
        }
        else if(r2<r1 && r2<r3 && r2<r4){
          return PSR[1];
        }
        else if(r3<r1 && r3<r2 && r3<r4){
          return PSR[2];
        }
        else{
          return PSR[3];
        } 
      }

      static void fourallroutes(int r1, int r2, int r3, int r4, String PSR[]){
        int time1 = (r1*10)/60;
        int time2 = (r2*10)/60;
        int time3 = (r3*10)/60;
        int time4 = (r4*10)/60;

        System.out.println("All Routes:");
        System.out.println("Route: " + PSR[0] + " | Distance: " + r1 + "m" + " | Travel Time: " + time1 + "hrs");
        System.out.println("Route: " + PSR[1] + " | Distance: " + r2 + "m" + " | Travel Time: " + time2 + "hrs");
        System.out.println("Route: " + PSR[2] + " | Distance: " + r3 + "m" + " | Travel Time: " + time3 + "hrs");
        System.out.println("Route: " + PSR[3] + " | Distance: " + r4 + "m" + " | Travel Time: " + time4 + "hrs");
      }

    public static void main(String[] args) {
        
       //DATA
       
       String L[] = {"Daet","Vinzons","Basud","Labo","Mercedes","Talisay"};
       String paths[] = {"Daet<>Vinzons", "Daet<>Labo", "Vinzons<>Basud", "Vinzons<>Mercedes", "Basud<>Talisay", "Labo<>Mercedes", "Mercedes<>Talisay"};

       //LOCATION RANDOMIZER
       Random r=new Random();        
       int randomNumber=r.nextInt(L.length);
       String Location = L[randomNumber];
       System.out.println("\nYou are at location: " + Location);

        //PAIN
        boolean i;
            while (i = true) {

            //Map
            int dis[] = {distances(), distances(), distances(), distances(), distances(), distances(), distances()};

            System.out.println("\nMap:                                            #Distances:");
            System.out.println();
            System.out.println("Daet------------Vinzons-------------Basud" + "       # " + paths[0] +  "     = "   + dis[0] + "m");
            System.out.println(" |                 |                  |" + "         # " + paths[1] +  "        = " + dis[1] + "m");
            System.out.println(" |                 |                  |" + "         # " + paths[2] +  "    = "     + dis[2] + "m");
            System.out.println(" |                 |                  |" + "         # " + paths[3] +  " = "        + dis[3] + "m");
            System.out.println(" |                 |                  |" + "         # " + paths[4] +  "    = "     + dis[4] + "m");
            System.out.println(" |                 |                  |" + "         # " + paths[5] +  "    = "     + dis[5] + "m");
            System.out.println("Labo------------Mercedes-----------Talisay" + "      # " + paths[6] +  " = "        + dis[6] + "m");

               System.out.println("\nWhere are you going?");
                Scanner des = new Scanner(System.in);
                String Destination = des.nextLine();

                boolean result = Arrays.stream(L).anyMatch(Destination::equalsIgnoreCase);
                if (result == true) {
                  System.out.println("\nDestination is: " + Destination + "\n");

                  if(Location.equalsIgnoreCase("Daet")){
                      if(Destination.equalsIgnoreCase("Daet")){
                        System.out.println("That is your current location!");
                      }
                      else if(Destination.equalsIgnoreCase("Vinzons")){
                        String PSR[] = {"Daet>Vinzons", "Daet>Labo>Mercedes>Vinzons", "Daet>Labo>Mercedes>Talisay>Basud>Vinzons"};
                        
                        int r1 = dis[0];
                        int r2 = dis[1] + dis[5] + dis[3];
                        int r3 = dis[1] + dis[5] + dis[4] + dis[2];

                        int shrtime = time(r1, r2, r3);
                        int shrpath = path(r1, r2, r3);
                        String shrroute = route(r1, r2, r3, PSR);
                        allroutes(r1, r2, r3, PSR);

                        System.out.println("=============================================================");
                        System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");
                      }
                      else if(Destination.equalsIgnoreCase("Basud")){
                        String PSR[] = {"Daet>Vinzons>Basud", "Daet>Labo>Mercedes>Vinzons>Basud", "Daet>Vinzons>Mercedes>Talisay>Basud"};

                        int r1 = dis[0] + dis[2];
                        int r2 = dis[1] + dis[5] + dis[3] + dis[2];
                        int r3 = dis[0] + dis[3] + dis[6] + dis[4];

                        int shrtime = time(r1, r2, r3);
                        int shrpath = path(r1, r2, r3);
                        String shrroute = route(r1, r2, r3, PSR);
                        allroutes(r1, r2, r3, PSR);

                        System.out.println("=============================================================");
                        System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");
                      }
                      else if(Destination.equalsIgnoreCase("Labo")){
                        String PSR[] = {"Daet>Labo", "Daet>Vinzons>Mercedes>Labo", "Daet>Vinzons>Basud>Talisay>Mercedes>Labo"};

                        int r1 = dis[1];
                        int r2 = dis[0] + dis[3] + dis[5];
                        int r3 = dis[0] + dis[2] + dis[4] + dis[6] + dis[5];

                        int shrtime = time(r1, r2, r3);
                        int shrpath = path(r1, r2, r3);
                        String shrroute = route(r1, r2, r3, PSR);
                        allroutes(r1, r2, r3, PSR);

                        System.out.println("=============================================================");
                        System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");
                      }
                      else if(Destination.equalsIgnoreCase("Mercedes")){
                        String PSR[] = {"Daet>Vinzons>Mercedes", "Daet>Labo>Mercedes", "Daet>Vinzons>Basud>Talisay>Mercedes"};

                        int r1 = dis[0] + dis[3];
                        int r2 = dis[1] + dis[5];
                        int r3 = dis[0] + dis[2] + dis[4] + dis[6];

                        int shrtime = time(r1, r2, r3);
                        int shrpath = path(r1, r2, r3);
                        String shrroute = route(r1, r2, r3, PSR);
                        allroutes(r1, r2, r3, PSR);

                        System.out.println("=============================================================");
                        System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                      }
                      else if(Destination.equalsIgnoreCase("Talisay")){
                        String PSR[] = {"Daet>Vinzons>Basud>Talisay", "Daet>Labo>Mercedes>Talisay", "Daet>Vinzons>Mercedes>Talisay", "Daet>Labo>Mercedes>Vinzons>Basud>Talisay"};
                        
                        int r1 = dis[0] + dis[2] + dis[4];
                        int r2 = dis[1] + dis[4] + dis[6];
                        int r3 = dis[0] + dis[3] + dis[6];
                        int r4 = dis[1] + dis[5] + dis[3] + dis[2] + dis[4];

                        int shrtime = fourtime(r1, r2, r3, r4);
                        int shrpath = fourpath(r1, r2, r3, r4);
                        String shrroute = fourroute(r1, r2, r3, r4, PSR);
                        fourallroutes(r1, r2, r3, r4, PSR);

                        System.out.println("=============================================================");
                        System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");
                      }
                    } 
                  else if(Location.equalsIgnoreCase("Vinzons")){
                    if(Destination.equalsIgnoreCase("Daet")){
                      String PSR[] = {"Vinzons>Daet", "Vinzons>Mercedes>Labo>Daet", "Vinzons>Basud>Talisay>Mercedes>Labo>Daet"};

                      int r1 = dis[0];
                      int r2 = dis[3] + dis[5] + dis[1];
                      int r3 = dis[2] + dis[4] + dis[5] + dis[1];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Vinzons")){
                      System.out.println("That is your current location!");
                    }
                    else if(Destination.equalsIgnoreCase("Basud")){
                      String PSR[] = {"Vinzons>Basud", "Vinzons>Mercedes>Talisay>Basud", "Vinzons>Daet>Labo>Mercedes>Talisay>Basud"};

                      int r1 = dis[2];
                      int r2 = dis[3] + dis[6] + dis[4];
                      int r3 = dis[0] + dis[1] + dis[5] + dis[4];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Labo")){
                      String PSR[] = {"Vinzons>Daet>Labo", "Vinzons>Mercedes>Labo", "Vinzons>Basud>Talisay>Mercedes>Labo"};

                      int r1 = dis[0] + dis[1];
                      int r2 = dis[3] + dis[5];
                      int r3 = dis[2] + dis[4] + dis[6] + dis[5];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");
                    }
                    else if(Destination.equalsIgnoreCase("Mercedes")){
                      String PSR[] = {"(Vinzons>Mercedes", "Vinzons>Basud>Talisay>Mercedes", "Vinzons>Daet>Labo>Mercedes"};

                      int r1 = dis[3];
                      int r2 = dis[2] + dis[4] + dis[6];
                      int r3 = dis[0] + dis[1] + dis[5];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Talisay")){
                      String PSR[] = {"(Vinzons>Basud>Talisay", "Vinzons>Mercedes>Talisay", "Vinzons>Daet>Labo>Mercedes>Talisay"};

                      int r1 = dis[2] + dis[4];
                      int r2 = dis[3] + dis[6];
                      int r3 = dis[0] + dis[1] + dis[5] + dis[6];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");
                    }
                  }  
                  else if(Location.equalsIgnoreCase("Basud")){
                    if(Destination.equalsIgnoreCase("Daet")){
                      String PSR[] = {"Basud>Vinzons>Daet", "Basud>Vinzons>Mercedes>Labo>Daet", "Basud>Talisay>Mercedes>Labo>Daet"};

                      int r1 = dis[2] + dis[0];
                      int r2 = dis[2] + dis[3] + dis[5] + dis[1];
                      int r3 = dis[4] + dis[6] + dis[5] + dis[1];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Vinzons")){
                      String PSR[] = {"Basud>Vinzons", "Basud>Talisay>Mercedes>Vinzons", "Basud>Talisay>Mercedes>Labo>Daet>Vinzons"};

                      int r1 = dis[2] + dis[0];
                      int r2 = dis[4] + dis[6] + dis[3];
                      int r3 = dis[4] + dis[6] + dis[1] + dis[0];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");
                    }
                    else if(Destination.equalsIgnoreCase("Basud")){
                      System.out.println("That is your current location!");
                    }
                    else if(Destination.equalsIgnoreCase("Labo")){
                      String PSR[] = {"Basud>Talisay>Mercedes>Labo", "Basud>Vinzons>Daet>Labo", "Basud>Vinzons>Mercedes>Labo", "Basud>Talisay>Mercedes>Vinzons>Daet>Labo"};
                    
                      int r1 = dis[4] + dis[6] + dis[5];
                      int r2 = dis[2] + dis[0] + dis[1];
                      int r3 = dis[2] + dis[3] + dis[5];
                      int r4 = dis[4] + dis[6] + dis[3] + dis[0] + dis[1];

                      int shrtime = fourtime(r1, r2, r3, r4);
                        int shrpath = fourpath(r1, r2, r3, r4);
                        String shrroute = fourroute(r1, r2, r3, r4, PSR);
                        fourallroutes(r1, r2, r3, r4, PSR);

                        System.out.println("=============================================================");
                        System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");
                    }
                    else if(Destination.equalsIgnoreCase("Mercedes")){
                      String PSR[] = {"Basud>Vinzons>Mercedes", "Basud>Talisay>Mercedes", "Basud>Vinzons>Daet>Labo>Mercedes"};

                      int r1 = dis[2] + dis[3];
                      int r2 = dis[4] + dis[6];
                      int r3 = dis[2] + dis[0] + dis[1] + dis[5];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Talisay")){
                      String PSR[] = {"C>F", "C>B>E>F", "C>B>A>D>E>"};

                      int r1 = dis[4];
                      int r2 = dis[2] + dis[3] + dis[6];
                      int r3 = dis[2] + dis[0] + dis[1] + dis[5] + dis[6];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                  }
                  else if(Location.equalsIgnoreCase("Labo")){
                    if(Destination.equalsIgnoreCase("Daet")){
                      String PSR[] = {"Labo>Daet", "Labo>Mercedes>Vinzons>Daet", "Labo>Mercedes>Talisay>Basud>Vinzons>Daet"};

                      int r1 = dis[1];
                      int r2 = dis[5] + dis[3] + dis[0];
                      int r3 = dis[5] + dis[6] + dis[4] + dis[2] + dis[0];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Vinzons")){
                      String PSR[] = {"Labo>Daet>Vinzons", "Labo>Mercedes>Vinzons", "Labo>Mercedes>Talisay>Basud>Vinzons"};

                      int r1 = dis[1] + dis[1];
                      int r2 = dis[5] + dis[3];
                      int r3 = dis[5] + dis[6] + dis[4] + dis[2];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Basud")){
                      String PSR[] = {"Labo>Daet>Vinzons>Basud", "Labo>Mercedes>Vinzons>Basud", "Labo>Mercedes>Talisay>Basud", "Labo>Daet>Vinzons>Mercedes>Talisay>Basud"};
                      
                      int r1 = dis[1] + dis[0] + dis[2];
                      int r2 = dis[5] + dis[3] + dis[2];
                      int r3 = dis[5] + dis[6] + dis[4];
                      int r4 = dis[1] + dis[0] + dis[3] + dis[6] + dis[4];

                      int shrtime = fourtime(r1, r2, r3, r4);
                      int shrpath = fourpath(r1, r2, r3, r4);
                      String shrroute = fourroute(r1, r2, r3, r4, PSR);
                      fourallroutes(r1, r2, r3, r4, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Labo")){
                      System.out.println("That is your current location!");

                    }
                    else if(Destination.equalsIgnoreCase("Mercedes")){
                      String PSR[] = {"Labo>Mercedes", "Labo>Daet>Vinzons>Mercedes", "Labo>Daet>Vinzons>Basud>Talisay>Mercedes"};

                      int r1 = dis[5];
                      int r2 = dis[1] + dis[0] + dis[3];
                      int r3 = dis[1] + dis[0] + dis[2] + dis[6];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Talisay")){
                      String PSR[] = {"Labo>Mercedes>Talisay", "Labo>Daet>Vinzons>Mercedes>Talisay", "Labo>Daet>Vinzons>Basud>Talisay"};

                      int r1 = dis[5] + dis[6];
                      int r2 = dis[1] + dis[0] + dis[3] + dis[6];
                      int r3 = dis[1] + dis[0] + dis[2] + dis[4];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                  } 
                  else if(Location.equalsIgnoreCase("Mercedes")){
                    if(Destination.equalsIgnoreCase("Daet")){
                      String PSR[] = {"Mercedes>Labo>Daet", "Mercedes>Vinzons>Daet", "Mercedes>Talisay>Basud>Vinzons>Daet"};

                      int r1 = dis[5] + dis[1];
                      int r2 = dis[3] + dis[0];
                      int r3 = dis[6] + dis[4] + dis[2] + dis[0];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Vinzons")){
                      String PSR[] = {"Mercedes>Vinzons", "Mercedes>Labo>Daet>Vinzons", "Mercedes>Talisay>Basud>Vinzons"};

                      int r1 = dis[3];
                      int r2 = dis[5] + dis[1] + dis[0];
                      int r3 = dis[6] + dis[4] + dis[2];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Basud")){
                      String PSR[] = {"Mercedes>Vinzons>Basud", "Mercedes>Talisay>Basud", "Mercedes>Labo>Daet>Vinzons>Basud"};

                      int r1 = dis[3] + dis[2];
                      int r2 = dis[6] + dis[4];
                      int r3 = dis[5] + dis[1] + dis[0] + dis[2];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Labo")){
                      String PSR[] = {"Mercedes>Labo", "Mercedes>Vinzons>Daet>Labo", "Mercedes>Talisay>Basud>Vinzons>Daet>Labo"};

                      int r1 = dis[5];
                      int r2 = dis[3] + dis[0] + dis[1];
                      int r3 = dis[6] + dis[4] + dis[2] + dis[0] + dis[1];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Mercedes")){
                      System.out.println("That is your current location!");
                    }
                    else if(Destination.equalsIgnoreCase("Talisay")){
                      String PSR[] = {"Mercedes>Talisay", "Mercedes>Vinzons>Basud>Talisay", "Mercedes>Labo>Daet>Vinzons>Basud>Talisay"};

                      int r1 = dis[6];
                      int r2 = dis[3] + dis[2] + dis[4];
                      int r3 = dis[5] + dis[1] + dis[0] + dis[2] + dis[4];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                  } 
                  else if(Location.equalsIgnoreCase("Talisay")){
                    if(Destination.equalsIgnoreCase("Daet")){
                      String PSR[] = {"Talisay>Basud>Vinzons>Daet", "Talisay>Mercedes>Labo>Daet", "Talisay>Mercedes>Vinzons>Daet", "Talisay>Basud>Vinzons>Mercedes>Labo>Daet"};

                      int r1 = dis[4] + dis[2] + dis[0];
                      int r2 = dis[6] + dis[5] + dis[1];
                      int r4 = dis[6] + dis[3] + dis[0];
                      int r3 = dis[4] + dis[2] + dis[3] + dis[5] + dis[1];

                      int shrtime = fourtime(r1, r2, r3, r4);
                        int shrpath = fourpath(r1, r2, r3, r4);
                        String shrroute = fourroute(r1, r2, r3, r4, PSR);
                        fourallroutes(r1, r2, r3, r4, PSR);

                        System.out.println("=============================================================");
                        System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Vinzons")){
                      String PSR[] = {"Talisay>Basud>Vinzons", "Talisay>Mercedes>Vinzons", "Talisay>Mercedes>Labo>Daet>Vinzons"};

                      int r1 = dis[4] + dis[2];
                      int r2 = dis[6] + dis[3];
                      int r3 = dis[6] + dis[5] + dis[1] + dis[0];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Basud")){
                      String PSR[] = {"Talisay>Basud", "Talisay>Mercedes>Vinzons>Basud", "Talisay>Mercedes>Labo>Daet>Vinzons>Basud"};

                      int r1 = dis[4];
                      int r2 = dis[6] + dis[3] + dis[2];
                      int r3 = dis[6] + dis[5] + dis[1] + dis[0] + dis[2];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Labo")){
                      String PSR[] = {"Talisay>Mercedes>Labo", "Talisay>Basud>Vinzons>Mercedes>Labo", "Talisay>Basud>Vinzons>Daet>Labo"};

                      int r1 = dis[6] + dis[5];
                      int r2 = dis[4] + dis[2] + dis[3] + dis[5];
                      int r3 = dis[4] + dis[2] + dis[0] + dis[1];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Mercedes")){
                      String PSR[] = {"Talisay>Mercedes", "Talisay>Basud>Vinzons>Mercedes", "Talisay>Basud>Vinzons>Daet>Labo>Mercedes"};

                      int r1 = dis[6];
                      int r2 = dis[4] + dis[2] + dis[3];
                      int r3 = dis[4] + dis[2] + dis[0] + dis[1] + dis[5];

                      int shrtime = time(r1, r2, r3);
                      int shrpath = path(r1, r2, r3);
                      String shrroute = route(r1, r2, r3, PSR);
                      allroutes(r1, r2, r3, PSR);

                      System.out.println("=============================================================");
                      System.out.println("Shortest Possible Route: " + shrroute + " | Distance: " + shrpath + "m" + " | Travel Time: " + shrtime + "hrs");

                    }
                    else if(Destination.equalsIgnoreCase("Talisay")){
                      System.out.println("That is your current location!");
                    }
                  } 
                  
                  System.out.println("\nWould you like to travel again?");
                  Scanner prp = new Scanner(System.in);
                  String answer = prp.nextLine();
                  
                  if(answer.equalsIgnoreCase("Yes")){
                    System.out.println("\nContinue from where you left off? [0] or Start at with a new location? [1]");
                    Scanner lod = new Scanner(System.in);
                    String reps = lod.nextLine();

                    if(reps.equalsIgnoreCase("0")){
                    Location = Destination;
                    System.out.println("=============================================================");
                    System.out.println("\nYou are at location: " + Location);
                    }
                    else if(reps.equalsIgnoreCase("1")){
                      Random r2=new Random();        
                      int randomNumber2 = r2.nextInt(L.length);
                      Location = L[randomNumber2];
                      System.out.println("=============================================================");
      	              System.out.println("\nYou are at location: " + Location);
                    }
                  }
                  else if(answer.equalsIgnoreCase("No")){
                    break;
                  }

                }
                else if(result == false){
                  System.out.println("\nDestination is Invalid\n");
                }
            }
    }
}
