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

    public static float GetPercentChance(ArrayList<Integer> hand, ArrayList<Integer> oppositeHand){
        int hiddenCard = oppositeHand.get(0);
        ArrayList<Integer> copyDeck = Deck.intDeck;
        copyDeck.add(hiddenCard);
        float cardsLessThanError = 0;
        for(int i=0; i<Deck.intDeck.size(); i++){
            if(Deck.intDeck.get(i) <= GetError(hand)){
                cardsLessThanError +=1;
            }else{

            }
        }
        
        float percent = (cardsLessThanError/Deck.intDeck.size()) * 100;
        return percent;
    }

    public static void DecideAceValue(ArrayList<Integer> hand){
        for(int i=0; i<hand.size(); i++){
            if(hand.get(i) == 1){
                if(Sum(hand) + 10 >= 21){

                }else{
                    hand.add(10); 
                }          
            }else{

            }
        }
    }

    public static boolean HitOrStand(ArrayList<Integer> hand, ArrayList<Integer> oppositeHand){
        boolean returnValue = false;
        DecideAceValue(hand);
        if(GetPercentChance(hand, oppositeHand) >= 50){
            returnValue = true;
        }else{
            returnValue = false;
        }
        return returnValue;
    }
}

