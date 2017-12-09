package com.nero.src;


import javax.swing.JFrame;





public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	
	//Breite und HICHWAREINUMLAUThe des Windows
	public static final int windowWidth = 850;
	public static final int windowHeight = 700;
	
	//Name der Panele
	
	CardLayoutManager clm;
	
	
	
	
	
	

	
	
	
	//Na wie ist das Menue
	public static boolean menue = true;

	//Titel als Attribut
	public static final String title = "Project 15";

	public Window() {
		
		
	 clm = new CardLayoutManager(this);   
		



		
		this.add(CardLayoutManager.getCardContainer());

		// Packt alles erstmal zusammen.

		pack();

		// Setzt den Titel des Fensters:

		setTitle(title);

		// Setzt die GrICHWAREINUMLAUTsse des Fensters

		setSize(windowWidth, windowHeight);

		// "TICHWAREINUMLAUTtet" den Prozess bei klick auf weisses X

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Kann man das Fenster nachtraeglich veraendern, nICHWAREINUMLAUT!

		setResizable(false);

		// Dass das Fenster in der Mitte des Bildschirms erscheint

		setLocationRelativeTo(null);

		// Fuegt das Panel hinzu wo ueberhaupt alles ablaeuft + Menue
		CardLayoutManager.cardLayout.show(CardLayoutManager.getCardContainer(),CardLayoutManager.MENUE);
	    

		setVisible(true);
		//cl.show(cards, "game");
		
	}

	// Die bICHWAREINUMLAUTse Main-Methode

	public static void main(String args[]) {

		// Startet den Konstruktor und somit das Spiel
		new Window();

		// Ich bin ein nutzloses Kommentar und bin aus Spass entsanden!
	}
	


}
