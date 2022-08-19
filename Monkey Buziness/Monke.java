import java.lang.Thread.State;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Monke{

//INTERFACE STUFF

    //CARD DISPLAY
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
    //CARD SHUFFLE
    public static String[] shuffling(String[] cards, int[][] c) {
        
        Collections.shuffle(Arrays.asList(c));
        Collections.shuffle(Arrays.asList(cards));

        int i = 0;
        int s = 0;
                System.out.println("\n=====================================SHUFFLED CARDS=======================================\n");  
            while(i <= 3){ 
                       
                System.out.println("|‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾|");
                System.out.println("| " + cards[c[s][1]] + " | | " + cards[c[s][2]] + " | | " + cards[c[s][3]] + " | | " + cards[c[s][4]] + " | | " + cards[c[s][5]] + " | | " + cards[c[s][6]] + " | | " + cards[c[s][7]] + " | | " + cards[c[s][8]] + " | | " + cards[c[s][9]] + " | | " + cards[c[s][10]] + " | | " + cards[c[s][0]] + " | | " + cards[c[s][11]] + " | | " + cards[c[s][12]] + " |");
                System.out.println("|____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____|");
                i++; 
                s++;
            }     
        return cards;
    }
    //CARD HAND DISTRIBUTION
    public static String[][] distribute(String[] shuffled) {
        
        Collections.shuffle(Arrays.asList(shuffled));
        
        String[] added = {"--", ".."};

        String first[] = {shuffled[0]};

        String playerhands[] = {shuffled[1] , shuffled[2] , shuffled[3] , shuffled[4] , shuffled[5] , shuffled[6] , shuffled[7] , shuffled[8],
                                shuffled[9] , shuffled[10], shuffled[11], shuffled[12], shuffled[13], shuffled[14], shuffled[15], shuffled[16],
                                shuffled[17], shuffled[18], shuffled[19], shuffled[20], shuffled[21], shuffled[22], shuffled[23], shuffled[24],
                                shuffled[25], shuffled[26], added[0]};

        String pchands[] = {shuffled[27], shuffled[28], shuffled[29], shuffled[30], shuffled[31], shuffled[32], shuffled[33], shuffled[34],
                            shuffled[35], shuffled[36], shuffled[37], shuffled[38], shuffled[39], shuffled[40], shuffled[41], shuffled[42],
                            shuffled[43], shuffled[44], shuffled[45], shuffled[46], shuffled[47], shuffled[48], shuffled[49], shuffled[50],
                            shuffled[51], added[1]};


        String[][] handlist = {first, playerhands, pchands};

        return handlist;

    }
    //MAIN GAME
    public static void maingame(String[][] handlist, int playerhand, int pchand) {
        
        System.out.println("");
        System.out.println("");
        System.out.println("=========================================GAME PROPER============================================");
        System.out.println("|                                                                                              |");
        System.out.println("|  |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾|  |");
        System.out.println("|  | "+handlist[2][0]+" | | "+handlist[2][1]+" | | "+handlist[2][2]+" | | "+handlist[2][3]+" | | "+handlist[2][4]+" | | "+handlist[2][5]+" | | "+handlist[2][6]+" | | "+handlist[2][7]+" | | "+handlist[2][8]+" | | "+handlist[2][9]+" | | "+handlist[2][10]+" | | "+handlist[2][11]+" | | "+handlist[2][12]+" |  |");
        System.out.println("|  |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____|  |     |‾‾‾‾|");
        System.out.println("|    00     01     02     03     04     05     06     07     08     09     10     11     12    |     | " + handlist[2][25] + " |");
        System.out.println("|                                                                                              |     |____|");
        System.out.println("|  |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾|         |       25");
        System.out.println("|  | "+handlist[2][13]+" | | "+handlist[2][14]+" | | "+handlist[2][15]+" | | "+handlist[2][16]+" | | "+handlist[2][17]+" | | "+handlist[2][18]+" | | "+handlist[2][19]+" | | "+handlist[2][20]+" | | "+handlist[2][21]+" | | "+handlist[2][22]+" | | "+handlist[2][23]+" | | "+handlist[2][24]+" |         |");
        System.out.println("|  |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____|         |");
        System.out.println("|    13     14     15     16     17     18     19     20     21     22     23     24           |");
        System.out.println("|                                                                                              |");
        System.out.println("===========================================(--PC--)=============================================");
        System.out.println("                                                                               Cards Left: " + pchand + "");
        System.out.println("");
        System.out.println("                                            |‾‾‾‾|                    ");
        System.out.println("                                            | " + handlist[0][0] + " |");
        System.out.println("                                            |____|                    ");
        System.out.println("");
        System.out.println(" Cards Left: " + playerhand  + "");
        System.out.println("===========================================(PLAYER)=============================================");
        System.out.println("|                                                                                              |");
        System.out.println("|  |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾|  |");
        System.out.println("|  | "+handlist[1][0]+" | | "+handlist[1][1]+" | | "+handlist[1][2]+" | | "+handlist[1][3]+" | | "+handlist[1][4]+" | | "+handlist[1][5]+" | | "+handlist[1][6]+" | | "+handlist[1][7]+" | | "+handlist[1][8]+" | | "+handlist[1][9]+" | | "+handlist[1][10]+" | | "+handlist[1][11]+" | | "+handlist[1][12]+" |  |");
        System.out.println("|  |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____|  |     |‾‾‾‾|");
        System.out.println("|    00     01     02     03     04     05     06     07     08     09     10     11     12    |     | " + handlist[1][26] + " |");
        System.out.println("|                                                                                              |     |____|");
        System.out.println("|  |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾| |‾‾‾‾|  |       26");
        System.out.println("|  | "+handlist[1][13]+" | | "+handlist[1][14]+" | | "+handlist[1][15]+" | | "+handlist[1][16]+" | | "+handlist[1][17]+" | | "+handlist[1][18]+" | | "+handlist[1][19]+" | | "+handlist[1][20]+" | | "+handlist[1][21]+" | | "+handlist[1][22]+" | | "+handlist[1][23]+" | | "+handlist[1][24]+" | | "+handlist[1][25]+" |  |");
        System.out.println("|  |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____| |____|  |");
        System.out.println("|    13     14     15     16     17     18     19     20     21     22     23     24     25    |");
        System.out.println("|                                                                                              |");
        System.out.println("================================================================================================\n");
    }
    
//TURNS

    //PLAYER TURN
    public static int[] playerturn(String[][] handlist) {
        System.out.print("\n                                       Draw a Card: ");
        Scanner playerchoice = new Scanner(System.in);
        int handlistxpos = playerchoice.nextInt();
        int handlistypos = 2;
        int checkposition = 1;
        int maxchecks = 25;
        System.out.print("\n                                         You Draw:  " + handlist[handlistypos][handlistxpos]);
        int[] coordinates = {handlistxpos, handlistypos, maxchecks, checkposition};

        return coordinates;
    }

    //COMPUTER TURN
    public static int[] computerturn(String[][] handlist, int[] indexes, int cpturn) {
        
        int [] draw = indexes;
        int id = cpturn;
        int handlistxpos = draw[id];
        int handlistypos = 1;
        int checkposition = 2;
        int maxchecks = 25;
        
        boolean i = true;
        int limit = 0;
        
        
        while(i && limit < 25){

            if (handlist[handlistypos][handlistxpos] == "--"){
                limit++;
                handlistxpos++;
            }
            else{
                System.out.print("\n                                       Computer Draws: " + handlist[handlistypos][handlistxpos]);
                i = false;
            }   
        }
        int[] coordinates = {handlistxpos, handlistypos, maxchecks, checkposition};
        return coordinates;
    }

    //SELF MATCH
    public static boolean SelfCheck(String[][] handlist, int y, int x, int r){
        
        
        int z = 0;
        String replacer = "";
        
        if(r == 1){
            z = 25;
            replacer = "--";
        } 
        else if(r == 2){
            z = 24;
            replacer = "..";
        }

        boolean g = false;
        boolean i = true;

        String firstcard = handlist[r][x];
        char f = firstcard.charAt(0);

        while (i) {

            String secondcard = handlist[r][y];
            if(secondcard.startsWith(Character.toString(f))){
                if(!firstcard.equals(replacer)){
                g = true;
                }
                handlist[r][x] = replacer;
                handlist[r][y] = replacer;
                i = false;
            }
            else if(y < z){
                y++;
            }
            else{
                y = 0;
                i = false;
            }
        }

        return g;
    }
    
    //CHECK MATCH
    public static int[] checker(String[][] handlist, int[] selectedcard) {

        String firstcard = (handlist[selectedcard[1]][selectedcard[0]]);
        char f = firstcard.charAt(0);
        boolean i = true;
        int r = 0;
        int cardcon[] = {0, 0};
        String replacer1 = "";
        String replacer2 = "";

            if(selectedcard[1] == 1){
                replacer1 = "--";
                replacer2 = "..";
            }
            else{
                replacer1 = "..";
                replacer2 = "--";
            }

        while (i) {
            String secondcard = (handlist[selectedcard[3]][r]);

            if(firstcard.equals(replacer1) || firstcard.equals(replacer2)){
                cardcon[0] = 0;
                cardcon[1] = 0;
                System.out.println("\n\nCard invalid");
                i = false;
            }
            else if(secondcard.startsWith(Character.toString(f))){
                System.out.println("\n\n                                        -Match Found-");
                System.out.println("                                        |‾‾‾‾| |‾‾‾‾|");
                System.out.println("                                        | "+ firstcard + " | | " +  handlist[selectedcard[3]][r] + " |");
                System.out.println("                                        |____| |____|\n");
                if(firstcard.equals(replacer1) || firstcard.equals(replacer2)){
                    cardcon[0] = 0;
                    cardcon[1] = 0;
                }
                else{
                    cardcon[0] = 1;
                    cardcon[1] = 1;
                }

                handlist[selectedcard[1]][selectedcard[0]] = replacer1;
                handlist[selectedcard[3]][r] = replacer2;
                i = false;
            }
            else if(r < selectedcard[2]){
                r++;
            }
            else{
                if(selectedcard[1] == 1){
                    handlist[2][25] = firstcard;
                    handlist[selectedcard[1]][selectedcard[0]] = replacer1;
                    System.out.println("\n\nNo Matches");
                    cardcon[0] = 1;
                    cardcon[1] = -1;
                    i = false;
                }
                else{
                    handlist[1][26] = firstcard;
                    handlist[selectedcard[1]][selectedcard[0]] = replacer1;
                    System.out.println("\n\nNo Matches");
                    cardcon[0] = -1;
                    cardcon[1] = 1;
                    i = false;
                }

            }
            
        }
        return cardcon;
        
    }

    //FINAL CHECK
    public static void finalcheck(String[][] handlist, int x, int y) {
        
        boolean i = true;
        int r = 0;

        String finalcard = handlist[0][0];
        String winner = "";
        char f = finalcard.charAt(0);

        if (x == 1) {
            winner = "  Player";
        }
        else{
            winner = "Computer";
        }

        while (i) {
            String secondcard = (handlist[x][r]);
            if(secondcard.startsWith(Character.toString(f))){
                System.out.println("\n\n                                     -Final Match Found-");
                System.out.println("                                        |‾‾‾‾| |‾‾‾‾|");
                System.out.println("                                        | "+ finalcard + " | | " +  handlist[x][r] + " |");
                System.out.println("                                        |____| |____|\n");

                i = false;
            }
            else if(r<y){
                r++;
            }
            else{
                System.out.print("You fucked up");
                i = false;
            }
            
        }
    }

    public static void main(String[] args) {

        String deck[][] = {{"A", "2", "3", "4", "5", "6", "7", "8", "9", "X", "J", "Q", "K"},
                           {"♠", "♣", "♥", "♦",}
                        };

        int c[][] = {{0, 1, 2, 3 ,4 ,5, 6, 7, 8, 9, 10, 11, 12},
                    {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25},
                    {26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38},
                    {39, 40, 41, 42 ,43 ,44, 45, 46, 47, 48, 49, 50, 51},
                    };

         String cards[] = {(deck[0][0]+(deck[1][0])), (deck[0][0]+(deck[1][1])), (deck[0][0]+(deck[1][2])), (deck[0][0]+(deck[1][3])),
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
        int totalcards = playerhand + pchand;
        
        carddisplay(deck);

        System.out.println("\n=====================================(SHUFFLING CARDS...)=======================================\n");

        String[] shuffled = shuffling(cards, c);
        
        String[][] handlist = distribute(shuffled);
        
        int[] indexes = {0, 1, 2, 3, 4, 5, 6 ,7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        Collections.shuffle(Arrays.asList(indexes));

        int cpturn = 0;
        int r = 1;
        int y = 1;
        int x = 0;

        maingame(handlist, playerhand, pchand);
        
        while(x<25){

            boolean g = SelfCheck(handlist, y, x, r);
            x++;
            y = x+1;
            if (g) {
                playerhand = playerhand - 2;
            }
        }

        r = 2;
        x = 0;
        y = 1;

        while(x<24){

            boolean g = SelfCheck(handlist, y, x, r);
            x++;
            y = x+1;
            if (g) {
                pchand = pchand - 2;
            }
        }

        String[] turn = {"Player, Computer"};
        Collections.shuffle(Arrays.asList(turn));
            
            

            if(turn[0].equals("Player")){

                while (totalcards > 1) {

                maingame(handlist, playerhand, pchand);
                
                System.out.println("                                         PLAYER TURN");
                int[] selectedcard = playerturn(handlist);
                int[] cardcon = checker(handlist, selectedcard);
                playerhand = (playerhand - cardcon[0]);
                pchand = (pchand - cardcon[1]);
                totalcards = playerhand + pchand;

                maingame(handlist, playerhand, pchand);

                Collections.shuffle(Arrays.asList(indexes));
                            
                selectedcard = computerturn(handlist, indexes, cpturn);
                cardcon = checker(handlist, selectedcard);
                cpturn++;

                playerhand = (playerhand - cardcon[0]);
                pchand = (pchand - cardcon[1]);
                totalcards = playerhand + pchand;

                }

                
            }

            else{
                while(totalcards > 1) {
                
                maingame(handlist, playerhand, pchand);
                
                Collections.shuffle(Arrays.asList(indexes));

                System.out.println("                                         COMPUTER TURN");
                int[] selectedcard = computerturn(handlist, indexes, cpturn);
                int[] cardcon = checker(handlist, selectedcard);
                cpturn++;

                playerhand = (playerhand - cardcon[0]);
                pchand = (pchand - cardcon[1]);
                totalcards = playerhand + pchand;

                maingame(handlist, playerhand, pchand);
                            
                selectedcard = playerturn(handlist);
                cardcon = checker(handlist, selectedcard);
                
                playerhand = (playerhand - cardcon[0]);
                pchand = (pchand - cardcon[1]);
                totalcards = playerhand + pchand;                    
                }
            }
                        
        if(playerhand == 0){
            maingame(handlist, playerhand, pchand);
            System.out.println("");
            System.out.println("          ⠘⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜");          
            System.out.println("⠀           ⠑⡀⠀⠀⠀    YOU WIN! ⠀⠀⠀⠀⡔⠁");            
            System.out.println("             ⠈⠢⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠴⠊⠀");           
            System.out.println("⠀               ⢸⠀⠀⠀⢀⣀⣀⣀⣀⣀⡀⠤⠄⠒⠈");           
            System.out.println("                 ⠘⣀⠄⠊⠁");          
            System.out.println("");           
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⠛⠛⠋⠉⠈⠉⠉⠉⠉⠛⠻⢿⣿⣿⣿⣿⣿⣿⣿");            
            System.out.println("⣿⣿⣿⣿⣿⡿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⢿⣿⣿⣿⣿");            
            System.out.println("⣿⣿⣿⣿⡏⣀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿");            
            System.out.println("⣿⣿⣿⢏⣴⣿⣷⠀⠀⠀⠀⠀⢾⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿");            
            System.out.println("⣿⣿⣟⣾⣿⡟⠁⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣷⢢⠀⠀⠀⠀⠀⠀⠀⢸⣿");            
            System.out.println("⣿⣿⣿⣿⣟⠀⡴⠄⠀⠀⠀⠀⠀⠀⠙⠻⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⣿");            
            System.out.println("⣿⣿⣿⠟⠻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠶⢴⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⣿");            
            System.out.println("⣿⣁⡀⠀⠀⢰⢠⣦⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⡄⠀⣴⣶⣿⡄⣿");            
            System.out.println("⣿⡋⠀⠀⠀⠎⢸⣿⡆⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⠗⢘⣿⣟⠛⠿⣼");            
            System.out.println("⣿⣿⠋⢀⡌⢰⣿⡿⢿⡀⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⡇⠀⢸⣿⣿⣧⢀⣼");            
            System.out.println("⣿⣿⣷⢻⠄⠘⠛⠋⠛⠃⠀⠀⠀⠀⠀⢿⣧⠈⠉⠙⠛⠋⠀⠀⠀⣿⣿⣿⣿⣿");            
            System.out.println("⣿⣿⣧⠀⠈⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠟⠀⠀⠀⠀⢀⢃⠀⠀⢸⣿⣿⣿⣿");            
            System.out.println("⣿⣿⡿⠀⠴⢗⣠⣤⣴⡶⠶⠖⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡸⠀⣿⣿⣿⣿");           
            System.out.println("⣿⣿⣿⡀⢠⣾⣿⠏⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠉⠀⣿⣿⣿⣿");            
            System.out.println("⣿⣿⣿⣧⠈⢹⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿");            
            System.out.println("⣿⣿⣿⣿⡄⠈⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣿⣿⣿⣿⣿");            
            System.out.println("⣿⣿⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿");            
            System.out.println("⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");            
            System.out.println("⣿⣿⣿⣿⣿⣦⣄⣀⣀⣀⣀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");           
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");         
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠙⣿⣿⡟⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿");          
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠁⠀⠀⠹⣿⠃⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿");          
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⢐⣿⣿⣿⣿⣿⣿⣿⣿⣿");           
            System.out.println("⣿⣿⣿⣿⠿⠛⠉⠉⠁⠀⢻⣿⡇⠀⠀⠀⠀⠀⠀⢀⠈⣿⣿⡿⠉⠛⠛⠛⠉⠉");          
            System.out.println("⣿⡿⠋⠁⠀⠀⢀⣀⣠⡴⣸⣿⣇⡄⠀⠀⠀⠀⢀⡿⠄⠙⠛⠀⣀⣠⣤⣤");          

            x = 2;
            y = 25;
            finalcheck(handlist, x, y);
        }
        
        else if(pchand == 0){
            maingame(handlist, playerhand, pchand);
            System.out.println("Imagine Losing to a number randomizer xD");

            System.out.println("       THIS IS YOU RIGHT NOW");
            System.out.println("⠄⠄⠄⣠⢴⢴⡴⣤⢤⣄⠄⠄⢀⠄⣀⡤⣴⣺⡽⣯⡷⣦⣄⠄⠄⠄");                                
            System.out.println("⠄⣔⢞⢝⢝⠽⡽⣽⣳⢿⡽⣏⣗⢗⢯⢯⣗⡯⡿⣽⢽⣷⣟⣷⣄ ⠄");                                
            System.out.println("⠄⡗⡟⡼⣸⣁⢋⠎⠎⢯⢯⡧⡫⣎⡽⡹⠊⢍⠙⠜⠽⣳⢯⣿⣳ ⠄");                                
            System.out.println("⠄⢕⠕⠁⣁⢬⢬⣌⠆⠅⢯⡻⣜⢷⠁⠌⡼⠲⠺⢮⡆⡉⢹⣺⣽ ⠄");                              
            System.out.println("⠄⠄⡀⢐⠄⠄⠄⠈⠳⠁⡂⢟⣞⡏⠄⡹⠄⠄⠄⠄⠈⣺⡐⣞⣾ ⠄");                               
            System.out.println(" ⠄⢰⡳⡹⢦⣀⣠⡠⠤⠄⡐⢝⣾⣳⣐⣌⠳⠦⠤⠤⣞⢼⢽⣻⡷ ⠄");                              
            System.out.println("⠄⢸⣚⢆⢄⣈⠨⢊⢐⢌⠞⣞⣞⡗⡟⡾⣝⢦⣳⡳⣯⢿⣻⣽⣟ ⠄");                              
            System.out.println("⠄⠘⡢⡫⢒⠒⣘⠰⣨⢴⣸⣺⣳⢥⢷⣳⣽⣳⢮⢝⢽⡯⣿⣺⡽ ⠄");                              
            System.out.println("⠄⠄⠁⠪⠤⢑⢄⢽⡙⢽⣺⢾⢽⢯⡟⡽⣾⣎⡿⣮⡳⣹⣳⣗⠇ ⠄");                              
            System.out.println("⠄⠄⠄⠁⠄⡸⡡⠑⠤⣠⡑⠙⠍⡩⡴⣽⡗⣗⣟⣷⣫⢳⢕⡏ ⠄⠄");                               
            System.out.println(" ⠄⠄⠄⠄⢈⡇⡇⡆⡌⡀⡉⠫⡯⢯⡫⡷⣽⣺⣗⣟⡾⡼⡺ ⠄⠄⠄");                               
            System.out.println("⠄⠄⠄⠄⡮⡎⡎⡎⣞⢲⡹⡵⡕⣇⡿⣽⣳⣟⣾⣳⡯⠉ ⠄⠄⠄⠄");                               
            System.out.println("⠄⠄⠄⠄⢯⡣⡣⡣⡣⡣⣗⡽⣽⣳⢯⢷⣳⣻⣺⣗⡇ ⠄⠄⠄⠄⠄");                               
            System.out.println(" ⠄⠄⠄⠄⠰⡙⠺⢪⢪⡺⡵⣯⣗⡯⡿⣽⢽⢾⣳⠏ ⠄⠄⠄⠄⠄⠄");                               
            System.out.println("⠄⠄⠄⠄⠄⠐⠢⠄⣀⣀⢉⠊⣊⣉⡬⡶⡻⣝⡞ ⠄⠄⠄⠄⠄⠄⠄");                                
            System.out.println("⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠙⢙⢑⢹⣘⠮⠛⠈ ⠄⠄⠄⠄⠄⠄⠄⠄");                               
            System.out.println("⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠂⠁⠑⠁⠄⠄");                                

            x = 1;
            y = 26;
            finalcheck(handlist, x, y);
        }

    }
}