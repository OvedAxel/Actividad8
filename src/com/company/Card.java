package com.company;

public class Card {
    private String deck;
    private String color;
    private String value;

    Card(String deck,String color, String value){
        this.deck = deck;
        this.color = color;
        this.value = value;
    }
    Card(String deck,String color){
        this.deck = deck;
        this.color = color;

    }
    public String getDeck() {
        return deck;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getValue(){
        return value;
    }
    public void setValor(Integer value) {
        if(value<=10){
            if(value == 1) this.value = "A";
            this.value = value.toString();
        }
        else {
            if(value == 11) this.value = "J";
            else if(value == 12) this.value = "Q";
            else this.value = "K";
        }
    }
    @Override
    public String toString(){
        String message = "%s, %s, %s";
        return String.format(message,deck,color,value);
    }

}
