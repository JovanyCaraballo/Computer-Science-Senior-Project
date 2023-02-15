import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class Game {
    // The 52 cards used for reference 11 = Ace, the other noble cards are 10 in value
    static ArrayList<Integer> Cards = new ArrayList<>(Arrays.asList(2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,11,11,11,11 ));

    static int playerScore = 0;
    static ArrayList<Integer> playerCards = new ArrayList<>();
    static int dealerScore = 0;
    static ArrayList<Integer> dealerCards = new ArrayList<>();

    public static void main(String args[]) throws IOException {
        // Begin the game loop
        System.out.println("Welcome to Blackjack");
/*
        // Give the initial random cards to the player and dealer
        playerCards.add(drawCard());
        dealerCards.add(drawCard());
        playerCards.add(drawCard());
        dealerCards.add(drawCard());

        // Calculate Total Scores
        for(int card: playerCards){
            playerScore += card;
        }
        for(int card: dealerCards){
            dealerScore += card;
        }

        // summary of the board
        System.out.println("Here are the player cards: ");
        System.out.println(playerCards.get(0) + " " + playerCards.get(1));
        System.out.println("Player Total: " + playerScore);


        System.out.println("The dealer has this card revealed: ");
        System.out.println(dealerCards.get(0));
*/
        // Player decides to hit or stand

       // String fileFrom = "C:\\Users\\trent\\Desktop\\Memories\\light-backup_1\\Saves\\Multiplayer\\pzserver\\map_";
       // copyFile(fii,gii);

        for(int x = 862; x <= 895; x++) {
           for (int y = 973; y <= 1155; y++ ) {

               String fileTo = "C:\\Users\\trent\\Desktop\\Memories\\pzChunks\\Shop\\map_";
               String fileFrom = "C:\\Users\\trent\\Desktop\\Memories\\light-backup_1\\Saves\\Multiplayer\\pzserver\\map_";
               fileFrom = fileFrom + x + "_" + y + ".bin";
               fileTo = fileTo + x + "_" + y + ".bin";

               if(Files.exists(Paths.get(fileFrom))){
                   copyFile(fileFrom,fileTo);
               }


           }

        }

    }

    public static void copyFile(String from, String to) throws IOException{
        Path src = Paths.get(from);
        Path dest = Paths.get(to);
        Files.copy(src,dest);
    }


  //  Read more: https://www.java67.com/2016/09/how-to-copy-file-from-one-location-to-another-in-java.html#ixzz7pbsITo1i

    public static int drawCard(){

        // Initiate random generator
        Random rand = new Random();
        Integer randCardIndex = rand.nextInt(Cards.size());
        int card = Cards.get(randCardIndex);
        Cards.remove(randCardIndex);
        return card;
    }
}
