package Classes;
import java.util.*;

public class Deck {
    public static ArrayList<String> deck = new ArrayList<String>();
    
    public static int Hit(){
        String cardName = deck.get(0);
        int drawnCard = 0;
        switch(cardName){
            case "King":
            case "Queen":
            case "Jack":
            case "10":
            drawnCard = 10;
            break;
            case "9":
            drawnCard = 9;
            break;
            case "8":
            drawnCard = 8;
            break;
            case "7":
            drawnCard = 7;
            break;
            case "6":
            drawnCard = 6;
            break;
            case "5":
            drawnCard = 5;
            break;
            case "4":
            drawnCard = 4;
            break;
            case "3":
            drawnCard = 3;
            break;
            case "2":
            drawnCard = 2;
            break;
            case "Ace":
            drawnCard = 1;
            break;
        }
        deck.remove(0);
        return drawnCard;
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


