package com.company;

public class Main {

    public static void main(String[] args) {
	    Deck deck = new Deck();
	    deck.init();

	    deck.shuffle();
	    deck.head();
	    deck.pick();
	    deck.hand();
    }
}
