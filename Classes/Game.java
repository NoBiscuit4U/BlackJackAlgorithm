package Classes;

public class Game {
    
    public static void StartGame(){
        Deck.CreateAndShuffleDeck();
        DescisionLogic.playerHand.add(Deck.Deal());
        DescisionLogic.playerHand.add(Deck.Deal());

        DescisionLogic.dealerHand.add(Deck.Deal());
        DescisionLogic.dealerHand.add(Deck.Deal());
        System.out.println(DescisionLogic.dealerHand);
        System.out.println(DescisionLogic.playerHand);
        System.out.println(DescisionLogic.GetError());
    }
}
