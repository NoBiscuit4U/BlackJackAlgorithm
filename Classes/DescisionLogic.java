package Classes;
import java.util.*;

public class DescisionLogic {
    public static ArrayList<Integer> dealerHand = new ArrayList<Integer>();
    public static ArrayList<Integer> playerHand = new ArrayList<Integer>();
    
    public static int GetError(ArrayList<Integer> hand){
        int error = 21-Sum(hand);
        return error;
    }

    public static int Sum(ArrayList<Integer> sumOfHand){
        int sum = 0;
        for(int i=0; i<sumOfHand.size(); i++){
            sum+=sumOfHand.get(i);
        }

        return sum;
    }

    public static double GetPercentChance(){
        double percent = 0.0;

        return percent;
    }

    public static boolean HitOrStand(ArrayList<Integer> hand){
        boolean returnValue;
        
        return true;
    }
}

