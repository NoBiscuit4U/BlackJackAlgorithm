package Classes;

public class Game {
    public static boolean isGameActive = true;
    public static boolean isPlayersTurn = true;
    public static boolean isDealersTurn = false;
    public static boolean dealerWon = false;
    public static boolean playerWon = false;

    
    public static void DealOutCards(){
        DescisionLogic.playerHand.add(Deck.Hit());
        DescisionLogic.playerHand.add(Deck.Hit());

        DescisionLogic.dealerHand.add(Deck.Hit());
        DescisionLogic.dealerHand.add(Deck.Hit());
        System.out.println(DescisionLogic.dealerHand);
        System.out.println(DescisionLogic.playerHand);
    }

    public static boolean PlayGame(){
        boolean returnValue = false;
        while(isGameActive){
            if(DescisionLogic.Sum(DescisionLogic.playerHand)<=21){
                while(isPlayersTurn){
                    if(DescisionLogic.HitOrStand(DescisionLogic.playerHand) == true){
                        DescisionLogic.playerHand.add(Deck.Hit());       
                    }else{
                        isPlayersTurn = false;
                        isDealersTurn = true;
                    }
                }
            }else{
                dealerWon = true;
                returnValue = true;
                isGameActive = false;
            }
            
            if(DescisionLogic.Sum(DescisionLogic.dealerHand)<=21){
                while(isDealersTurn){
                    if(DescisionLogic.HitOrStand(DescisionLogic.dealerHand) == true){
                        DescisionLogic.playerHand.add(Deck.Hit());       
                    }else{
                        isPlayersTurn = false;
                        isDealersTurn = true;
                    }
                }
    
            }else{
                playerWon = true;
                returnValue = true;
                isGameActive = false;  
            }
        }
        return returnValue;
    }
    public static void StartGame(){
        Deck.CreateAndShuffleDeck();
        DealOutCards();
        PlayGame();
    }
}
