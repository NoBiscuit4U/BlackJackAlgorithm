package Classes;
import java.util.*;

public class DescisionLogic {
    public static ArrayList<Integer> dealerHand = new ArrayList<Integer>();
    public static ArrayList<Integer> playerHand = new ArrayList<Integer>();
    
    public static int GetError(ArrayList<Integer> hand){
        int error = 21-Sum(hand);
        
        return error;
    }

    public static int Sum(ArrayList<Integer> hand){
        int sum = 0;
        for(int i=0; i<hand.size(); i++){
            sum+=hand.get(i);
        }

        return sum;
    }

    public static double GetPercentChance(ArrayList<Integer> hand){
        double percent = 0.0;
        int hiddenCard = hand.get(0);
        ArrayList<Integer> copyDeck = Deck.intDeck;
        copyDeck.add(hiddenCard);


        return percent;
    }

    public static boolean HitOrStand(ArrayList<Integer> hand){
        boolean returnValue = false;

        return returnValue;
    }
}

