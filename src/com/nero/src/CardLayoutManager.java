package com.nero.src;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;





public class CardLayoutManager {
	
	public static CardLayout cardLayout;
	private static JPanel cardContainer;
	public static final String GAME = "game";
	static final String MENUE = "menue";
	Game g;


	
	public CardLayoutManager(JFrame j) {
	

		
		
setCardContainer(new JPanel(new CardLayout()));

getCardContainer().add(g = new Game(j),GAME);
getCardContainer().add(new Menue(g),getMenue());



cardLayout = (CardLayout) getCardContainer().getLayout();


		
		
		
	}



	public static JPanel getCardContainer() {
		return cardContainer;
	}



	public static void setCardContainer(JPanel cardContainer) {
		CardLayoutManager.cardContainer = cardContainer;
	}

public Game returnGame(){
	
	return this.g;
}

	public static String getMenue() {
		return MENUE;
	}

}
