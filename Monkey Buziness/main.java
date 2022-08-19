import java.lang.Thread.State;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class main{


    public static String[] shuffling(String[] cards) {
        
        Collections.shuffle(Arrays.asList(cards));
        return cards;
    }

    public static String[][] distribute(String[] shuffled) {
        
        Collections.shuffle(Arrays.asList(shuffled));

        String first[] = {shuffled[0]};

        String playerhands[] = {shuffled[1] , shuffled[2] , shuffled[3] , shuffled[4] , shuffled[5] , shuffled[6] , shuffled[7] , shuffled[8],
                                shuffled[9] , shuffled[10], shuffled[11], shuffled[12], shuffled[13], shuffled[14], shuffled[15], shuffled[16],
                                shuffled[17], shuffled[18], shuffled[19], shuffled[20], shuffled[21], shuffled[22], shuffled[23], shuffled[24],
                                shuffled[25], shuffled[26],};

        String pchands[] = {shuffled[27], shuffled[28], shuffled[29], shuffled[30], shuffled[31], shuffled[32], shuffled[33], shuffled[34],
                            shuffled[35], shuffled[36], shuffled[37], shuffled[38], shuffled[39], shuffled[40], shuffled[41], shuffled[42],
                            shuffled[43], shuffled[44], shuffled[45], shuffled[46], shuffled[47], shuffled[48], shuffled[49], shuffled[50],
                            shuffled[51]};
        
        String[][] handlist = {first, playerhands, pchands};

        return handlist;

    }

    public static void main(String[] args) {

        String deck[][] = {{"A", "2", "3", "4", "5", "6", "7", "8", "9", "X", "J", "Q", "K"},
                           {"♠", "♣", "♥", "♦"}
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
        
        String[] shuffled = shuffling(cards);

        System.out.println(Arrays.toString(shuffled));

        String[][] handlist = distribute(shuffled);

        System.out.println(Arrays.deepToString(handlist[0]));
        System.out.println(Arrays.deepToString(handlist[1]));
        System.out.println(Arrays.deepToString(handlist[2]));

    }
}