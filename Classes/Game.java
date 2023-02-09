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
    }

    public static boolean PlayGame(){
        boolean returnValue = false;
        while(isGameActive){
            while(isPlayersTurn){
                if(DescisionLogic.Sum(DescisionLogic.playerHand)<=21){
                    if(DescisionLogic.HitOrStand(DescisionLogic.playerHand) == true){
                        System.out.println("Player Hit");
                        DescisionLogic.playerHand.add(Deck.Hit());       
                    }else{
                        System.out.println("Player Stands");
                        isPlayersTurn = false;
                        isDealersTurn = true;
                    }
                }else{
                    System.out.println("Dealer Won");
                    System.out.println(DescisionLogic.playerHand);
                    System.out.println(DescisionLogic.dealerHand);
                    dealerWon = true;
                    returnValue = true;
                    isGameActive = false;
                }
            }
            
            while(isDealersTurn){
                if(DescisionLogic.Sum(DescisionLogic.dealerHand)<=21){
                    if(DescisionLogic.HitOrStand(DescisionLogic.dealerHand) == true){
                        System.out.println("Dealer Hit");
                        DescisionLogic.playerHand.add(Deck.Hit());       
                    }else{
                        System.out.println("Dealer Stands");
                        isDealersTurn = false;
                    }
                    
                }else{
                    System.out.println("Player Won");
                    System.out.println(DescisionLogic.playerHand);
                    System.out.println(DescisionLogic.dealerHand);
                    playerWon = true;
                    returnValue = true;
                    isGameActive = false;  
                }
            }

            if(!isDealersTurn && !isPlayersTurn){
                if(DescisionLogic.Sum(DescisionLogic.dealerHand) >= DescisionLogic.Sum(DescisionLogic.playerHand)){
                    System.out.println("Dealer Won");
                    System.out.println(DescisionLogic.playerHand);
                    System.out.println(DescisionLogic.dealerHand);
                    dealerWon = true;
                    isGameActive = false;
                }else{
                    System.out.println("Player Won");
                    System.out.println(DescisionLogic.playerHand);
                    System.out.println(DescisionLogic.dealerHand);
                    playerWon = true;
                    isGameActive = false;     
                }
            }
        }
        return returnValue;
    }

    public static void StartGame(){
        Deck.CreateAndShuffleDeck();
        Deck.DeckToInt();
        DealOutCards();
        PlayGame();
    }
}
