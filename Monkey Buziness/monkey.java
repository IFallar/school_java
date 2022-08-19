import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class monkey {
    
    public static void carddisplay(String[][] deck){   
        int i = 0;
        int s = 0;
            System.out.println("==================================GENERATED CARDS========================================\n");
            while(i <= 3){
                System.out.println("|‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾|");
                System.out.println("| " + deck[0][0] + deck[1][s] + " | | " + deck[0][1] + deck[1][s] + " | | " + deck[0][2] + deck[1][s] + " | | " + deck[0][3] + deck[1][s] + " | | " + deck[0][4] + deck[1][s] + " | | " + deck[0][5] +deck[1][s] + " | | " + deck[0][6] + deck[1][s] + " | | " + deck[0][7] + deck[1][s] + " | | " + deck[0][8] + deck[1][s] + " | | " + deck[0][9] + deck[1][s] + " | | " + deck[0][10] + deck[1][s] + " | | " + deck[0][11] + deck[1][s] + " | | " + deck[0][12] + deck[1][s] + " | "); 
                System.out.println("|____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____|");
                i++; 
                s++;
            }           
        }

    public static void shuffled(String[] cards, int[][] c){
        
        Collections.shuffle(Arrays.asList(c));
        Collections.shuffle(Arrays.asList(cards));

        int i = 0;
        int s = 0;

            while(i <= 3){          
                System.out.println("|‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾|");
                System.out.println("| " + cards[c[s][1]] + " | | " + cards[c[s][2]] + " | | " + cards[c[s][3]] + " | | " + cards[c[s][4]] + " | | " + cards[c[s][5]] + " | | " + cards[c[s][6]] + " | | " + cards[c[s][7]] + " | | " + cards[c[s][8]] + " | | " + cards[c[s][9]] + " | | " + cards[c[s][10]] + " | | " + cards[c[s][0]] + " | | " + cards[c[s][11]] + " | | " + cards[c[s][12]] + " |");
                System.out.println("|____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____|");
                i++; 
                s++;
            }           
        }
    
    public static String[][] distribute(String[] cards, int[][] c, int[] D){
        
        Collections.shuffle(Arrays.asList(c));
        Collections.shuffle(Arrays.asList(D));
        Collections.shuffle(Arrays.asList(cards));


        String FirstCard[] = {cards[c[0][D[0]]]};
        
        String Hand1[] = {cards[c[0][D[1]]], cards[c[0][D[2]]], cards[c[0][D[3]]], cards[c[0][D[4]]], cards[c[0][D[5]]], cards[c[0][D[6]]], cards[c[0][D[7]]], cards[c[0][D[8]]], cards[c[0][D[9]]], cards[c[0][D[10]]], cards[c[0][D[11]]], cards[c[0][D[12]]], 
                           cards[c[1][D[0]]], cards[c[1][D[1]]], cards[c[1][D[2]]], cards[c[1][D[3]]], cards[c[1][D[4]]], cards[c[1][D[5]]], cards[c[1][D[6]]], cards[c[1][D[7]]], cards[c[1][D[8]]], cards[c[1][D[9]]], cards[c[1][D[10]]], cards[c[1][D[11]]], cards[c[1][D[12]]]};
        
        String Hand2[] = {cards[c[2][D[0]]], cards[c[2][D[1]]], cards[c[2][D[2]]], cards[c[2][D[3]]], cards[c[2][D[4]]], cards[c[2][D[5]]], cards[c[2][D[6]]], cards[c[2][D[7]]], cards[c[2][D[8]]], cards[c[2][D[9]]], cards[c[2][D[10]]], cards[c[2][D[11]]], cards[c[2][D[12]]], 
                           cards[c[3][D[0]]], cards[c[3][D[1]]], cards[c[3][D[2]]], cards[c[3][D[3]]], cards[c[3][D[4]]], cards[c[3][D[5]]], cards[c[3][D[6]]], cards[c[3][D[7]]], cards[c[3][D[8]]], cards[c[3][D[9]]], cards[c[3][D[10]]], cards[c[3][D[11]]], cards[c[3][D[12]]]};
        
        String hands[][] = {FirstCard, Hand1, Hand2};

        return hands;
    
    }
 
    public static void game(String[][] onhand, int playerhand, int pchand) {
        System.out.println("\n===========================================GAME PROPER=========================================="); 
        System.out.println("|                                                                                              |");
        System.out.println("|  |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾|" + "  |");
        System.out.println("|  | " + onhand[1][0]+ " | | " + onhand[1][1]+ " | | " + onhand[1][2]+ " | | " + onhand[1][3]+ " | | " + onhand[1][4]+ " | | " + onhand[1][5]+ " | | " + onhand[1][6]+ " | | " + onhand[1][7]+ " | | " + onhand[1][8]+ " | | " + onhand[1][9]+ " | | " + onhand[1][10]+ " | | " + onhand[1][11]+ " | | " + onhand[1][12]+ " |" + "  |");
        System.out.println("|  |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____|" + "  |  PC Hand Count Begins at [0]");
        System.out.println("|  |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾|" + "         |  --------Left to Right------");
        System.out.println("|  | " + onhand[1][13]+ " | | " + onhand[1][14]+ " | | " + onhand[1][15]+ " | | " + onhand[1][16]+ " | | " + onhand[1][17]+ " | | " + onhand[1][18]+ " | | " + onhand[1][19]+ " | | " + onhand[1][20]+ " | | " + onhand[1][21]+ " | | " + onhand[1][22]+ " | | " + onhand[1][23]+ " | | " + onhand[1][24]+ " |" + "         |");
        System.out.println("|  |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____|" + "         |");
        System.out.println("|                                                                                              |");
        System.out.println("===========================================(--PC--)=============================================");
        System.out.println("                                                                          Cards Left: " + pchand + "");
        System.out.println("                                                                                              ");
        System.out.println("                                            |‾‾‾‾|                                             ");
        System.out.println("                                            | "+ onhand[0][0] + " |                            ");
        System.out.println("                                            |____|                                             ");
        System.out.println("                                                                                              ");
        System.out.println(" Cards Left: " + playerhand                                                                + "");
        System.out.println("===========================================(PLAYER)=============================================");
        System.out.println("|                                                                                              |");
        System.out.println("|  |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾|" + "  |");
        System.out.println("|  | " + onhand[2][0]+ " | | " + onhand[2][1]+ " | | " + onhand[2][2]+ " | | " + onhand[2][3]+ " | | " + onhand[2][5]+ " | | " + onhand[2][6]+ " | | " + onhand[2][7]+ " | | " + onhand[2][8]+ " | | " + onhand[2][9]+ " | | " + onhand[2][10]+ " | | " + onhand[2][11]+ " | | " + onhand[2][12]+ " | | " + onhand[2][13]+ " |" + "  |");
        System.out.println("|  |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____|" + "  |  Player Hand Count Begins at [1]");
        System.out.println("|  |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾|" + "  |  ----------Left to Right--------");
        System.out.println("|  | " + onhand[2][13]+ " | | " + onhand[2][14]+ " | | " + onhand[2][15]+ " | | " + onhand[2][16]+ " | | " + onhand[2][17]+ " | | " + onhand[2][18]+ " | | " + onhand[2][19]+ " | | " + onhand[2][20]+ " | | " + onhand[2][21]+ " | | " + onhand[2][22]+ " | | " + onhand[2][23]+ " | | " + onhand[2][24]+ " | | " + onhand[2][25]+ " |" + "  |");
        System.out.println("|  |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____|" + "  |");
        System.out.println("|                                                                                              |");
        System.out.println("================================================================================================\n");
    }  

    public static int[] playerturn(){
        System.out.print("\n                                       Draw a Card: ");
        Scanner turn1b = new Scanner(System.in);
        int position = turn1b.nextInt();
        int line = 1;

        int[] coordinates = {line, position};
        return coordinates;

    }

    public static int[] matchmaking(String[][] onhand, int[] chosen){

        String a = (onhand[chosen[0]][chosen[1]]);
        int p = 0;
        char m = a.charAt(0);
        boolean i = true;

        int cardcon[] = {0, 0};
        while(i){         
            String s1 = onhand[2][p];
            if(s1.startsWith(Character.toString(m))){
                System.out.println("\n                                        -Match Found-");
                System.out.println("                                        |‾‾‾‾| |‾‾‾‾|");
                System.out.println("                                        | "+ a + " | | " +  onhand[2][p] + " |");
                System.out.println("                                        |____| |____|\n");
                cardcon[0] = 1;
                cardcon[1] = 1;
                i = false;
                onhand[chosen[0]][chosen[1]] = "--";
                onhand[2][p] = "--";
            }
            else if(p <= 24){
                p++;
            }
            else{
                System.out.println("No Matches");
                cardcon[0] = -1;
                cardcon[1] = 1;;
                i = false;
            }
        }
        return cardcon;

        
    }
    public static void main(String[] args) {

        String deck[][] = {{"A", "2", "3", "4", "5", "6", "7", "8", "9", "X", "J", "Q", "K"},
                           {"♠", "♣", "♥", "♦"}
                        };

        int c[][] = {{0, 1, 2, 3 ,4 ,5, 6, 7, 8, 9, 10, 11, 12},
                    {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25},
                    {26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38},
                    {39, 40, 41, 42 ,43 ,44, 45, 46, 47, 48, 49, 50, 51},
                    };

        int D[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        
        String cards[] = { (deck[0][0]+(deck[1][0])), (deck[0][0]+(deck[1][1])), (deck[0][0]+(deck[1][2])), (deck[0][0]+(deck[1][3])),
                           (deck[0][1]+(deck[1][0])), (deck[0][1]+(deck[1][1])), (deck[0][1]+(deck[1][2])), (deck[0][1]+(deck[1][3])),
                           (deck[0][2]+(deck[1][0])), (deck[0][2]+(deck[1][1])), (deck[0][2]+(deck[1][2])), (deck[0][2]+(deck[1][3])),
                           (deck[0][3]+(deck[1][0])), (deck[0][3]+(deck[1][1])), (deck[0][3]+(deck[1][2])), (deck[0][3]+(deck[1][3])),
                           (deck[0][4]+(deck[1][0])), (deck[0][4]+(deck[1][1])), (deck[0][4]+(deck[1][2])), (deck[0][4]+(deck[1][3])),
                           (deck[0][5]+(deck[1][0])), (deck[0][5]+(deck[1][1])), (deck[0][5]+(deck[1][2])), (deck[0][5]+(deck[1][3])),
                           (deck[0][6]+(deck[1][0])), (deck[0][6]+(deck[1][1])), (deck[0][6]+(deck[1][2])), (deck[0][6]+(deck[1][3])),
                           (deck[0][7]+(deck[1][0])), (deck[0][7]+(deck[1][1])), (deck[0][7]+(deck[1][2])), (deck[0][7]+(deck[1][3])),
                           (deck[0][8]+(deck[1][0])), (deck[0][8]+(deck[1][1])), (deck[0][8]+(deck[1][2])), (deck[0][8]+(deck[1][3])),
                           (deck[0][9]+(deck[1][0])), (deck[0][9]+(deck[1][1])), (deck[0][9]+(deck[1][2])), (deck[0][9]+(deck[1][3])),
                           (deck[0][10]+(deck[1][0])), (deck[0][10]+(deck[1][1])), (deck[0][10]+(deck[1][2])), (deck[0][10]+(deck[1][3])),
                           (deck[0][11]+(deck[1][0])), (deck[0][11]+(deck[1][1])), (deck[0][11]+(deck[1][2])), (deck[0][11]+(deck[1][3])),
                           (deck[0][12]+(deck[1][0])), (deck[0][12]+(deck[1][1])), (deck[0][12]+(deck[1][2])), (deck[0][12]+(deck[1][3]))};
                           
        int playerhand = 26;
        int pchand = 25;
        
        carddisplay(deck); 
        
        System.out.println("\n=====================================SHUFFLED CARDS=======================================");

        shuffled(cards, c);

        String onhand[][] = distribute(cards, c, D);

        //FirtsCard = [0] Hand1 = onhand[1] || Hand2 =  onhand[2]
 
        int totalcards = playerhand + pchand;
        while(totalcards >= 1){
            game(onhand, playerhand, pchand);

            int[] Chosen = playerturn();

            int cardcon[] = matchmaking(onhand, Chosen);
            playerhand = playerhand - cardcon[0];
            pchand = pchand - cardcon[1];
            totalcards = playerhand + pchand;
        }
    }
}
