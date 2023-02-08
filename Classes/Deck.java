package Classes;
import java.util.*;

public class Deck {
    public static ArrayList<String> deck = new ArrayList<String>();
    public static ArrayList<Integer> intDeck = new ArrayList<Integer>();
    
    public static int Hit(){
        int cardValue = intDeck.get(0);
        deck.remove(0);
        return cardValue;
    }
    
    public static ArrayList<Integer> DeckToInt(){
        for(int i=0; i<deck.size(); i++){
            int cardInt = CardNameToInt(deck.get(i));
            intDeck.add(cardInt);
        }

        return intDeck;
    }

    public static int CardNameToInt(String cardName){
        int cardIntValue = 0;
        switch(cardName){
            case "King":
            case "Queen":
            case "Jack":
            case "10":
            cardIntValue = 10;
            break;
            case "9":
            cardIntValue = 9;
            break;
            case "8":
            cardIntValue = 8;
            break;
            case "7":
            cardIntValue = 7;
            break;
            case "6":
            cardIntValue = 6;
            break;
            case "5":
            cardIntValue = 5;
            break;
            case "4":
            cardIntValue = 4;
            break;
            case "3":
            cardIntValue = 3;
            break;
            case "2":
            cardIntValue = 2;
            break;
            case "Ace":
            cardIntValue = 1;
            break;
        }
        return cardIntValue;
    }
    
    public static void CreateAndShuffleDeck(){
        AddDeck();
        Collections.shuffle(deck);
        System.out.println(deck);
    }
    
    public static void AddDeck(){
        AddKings();
        AddQueens();
        AddJacks();
        Add10s();
        Add9s();
        Add8s();
        Add7s();
        Add6s();
        Add5s();
        Add4s();
        Add3s();
        Add2s();
        AddAces();
    }

    public static void AddKings(){
        deck.add("King");
        deck.add("King");
        deck.add("King");
        deck.add("King");
    }

    public static void AddQueens(){
        deck.add("Queen");
        deck.add("Queen");
        deck.add("Queen");
        deck.add("Queen");
    }

    public static void AddJacks(){
        deck.add("Jack");
        deck.add("Jack");
        deck.add("Jack");
        deck.add("Jack");
    }

    public static void Add10s(){
        deck.add("10");
        deck.add("10");
        deck.add("10");
        deck.add("10");
    }

    public static void Add9s(){
        deck.add("9");
        deck.add("9");
        deck.add("9");
        deck.add("9");
    }

    public static void Add8s(){
        deck.add("8");
        deck.add("8");
        deck.add("8");
        deck.add("8");
    }
    
    public static void Add7s(){
        deck.add("7");
        deck.add("7");
        deck.add("7");
        deck.add("7");
    }

    public static void Add6s(){
        deck.add("6");
        deck.add("6");
        deck.add("6");
        deck.add("6");
    }

    public static void Add5s(){
        deck.add("5");
        deck.add("5");
        deck.add("5");
        deck.add("5");
    }

    public static void Add4s(){
        deck.add("4");
        deck.add("4");
        deck.add("4");
        deck.add("4");
    }

    public static void Add3s(){
        deck.add("3");
        deck.add("3");
        deck.add("3");
        deck.add("3");
    }

    public static void Add2s(){
        deck.add("2");
        deck.add("2");
        deck.add("2");
        deck.add("2");
    }

    public static void AddAces(){
        deck.add("Ace");
        deck.add("Ace");
        deck.add("Ace");
        deck.add("Ace");
    }
}


