package Classes;
import java.util.*;

public class DescisionLogic {
    public static ArrayList<Integer> dealerHand = new ArrayList<Integer>();
    public static ArrayList<Integer> playerHand = new ArrayList<Integer>();
    public static int sum = 0;
    
    public static int GetError(){
        int error = 21-Sum(playerHand);
        return error;
    }

    public static int Sum(ArrayList<Integer> cards){
        for(int i=0; i<playerHand.size(); i++){
            sum+=cards.get(i);
        }

        return sum;
    }
}

