package com.company;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
import java.util.HashMap;
public class Deck {
    private HashMap<String,String> decks = new HashMap<String,String>();
    private ArrayList<Card> game = new ArrayList<Card>();
    private String strFormat = "%s remaining";

    Deck(){
        initDecks();
    }

    public ArrayList<Card> getGame(){
        return game;
    }

    public void initDecks(){
        decks.put("Diamond","Red");
        decks.put("Spade","Black");
        decks.put("Heart","Red");
        decks.put("clover","Black");
    }

    public void init(){
        for(Map.Entry<String,String> deck:decks.entrySet()){
            String deckCard = deck.getKey();
            String color = deck.getValue();
            for(int i=1;i<=13;i++){
                Card card = new Card(deckCard,color);
                card.setValor(i);
                game.add(card);
            }

        }
    }

    public void shuffle(){
        Collections.shuffle(game);
        System.out.println("The Deck has been mixed");
    }

    public void head(){
        Card card = game.get(game.size()-1);
        game.remove(card);
        System.out.println(card.toString());
        System.out.println(String.format(strFormat,game.size()));
    }

    public void pick(){
        Card card = randomCard();
        game.remove(card);
        System.out.println(card.toString());
        System.out.println(String.format(strFormat,game.size()));
    }

    public void hand() {

        if(game.size()<=5){
            printHand(game);
        }
        else{
            ArrayList cards = new ArrayList<Card>();
            Card card;
            for (int i=1;i<=5;i++){
                card = randomCard();
                game.remove(card);
                printHand(cards);
            }
            System.out.println(String.format(strFormat,game.size()));
        }


    }

    private void printHand(ArrayList<Card> cards){
        for(Card card: cards) System.out.println(card.toString());
    }

    private Card randomCard(){
        int rnd = (int)Math.floor(Math.random()*(1-game.size()+1)+game.size());
        return game.get(rnd);

    }

}
