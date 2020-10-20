package com.company;

import java.util.Scanner;

public class Main {
	private static Boolean isRunning;

    public static void main(String[] args) {
	    Deck deck = new Deck();
	    deck.init();
	    deck.initDecks();
	    isRunning = true;

	    do {
	    	try {
	    		int option = showMenu();
	    		if(option<0 || option>4){
	    			throw new Exception("Choose a valid option: ");
				}
	    		switch (option){
					case 1: deck.shuffle(); break;
					case 2: deck.head(); break;
					case 3: deck.pick(); break;
					case 4: deck.hand(); break;
					default:
						isRunning = false; break;
				}
			}
	    	catch (Exception e){
	    		System.out.println(e.getMessage());
				System.out.println("");
			}
		}
	    while (isRunning);
    }
    public static int showMenu(){
		System.out.println("Welcome to your favorite poker game!");
		System.out.println("Choose one of the following options:");
		System.out.println("a). Mix the deck");
		System.out.println("b). Take a card");
		System.out.println("c). Take a random card");
		System.out.println("d). Create a mallet");
		System.out.println("e). Exit game");
		Scanner scn = new Scanner(System.in);
		int option = scn.nextInt();
		return option;
	}
}
