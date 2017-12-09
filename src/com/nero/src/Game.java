package com.nero.src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.nero.helper.Background;
import com.nero.helper.Exit;
import com.nero.helper.ScrollerDown;
import com.nero.helper.ScrollerLeft;
import com.nero.helper.ScrollerRight;
import com.nero.helper.ScrollerUp;
import com.nero.src.input.Controller;
import com.nero.src.input.InternerLvLcreator;
import com.nero.src.input.KeyboardInput;
import com.nero.src.objects.Block;
import com.nero.src.objects.Coin;
import com.nero.src.objects.Ghostly;
import com.nero.src.objects.Player;



public class Game extends JPanel implements Runnable {

	/**
	 * 
	 */
	// Eclipse wollte es so...
	private static final long serialVersionUID = 1L;

	// Ja muss ich ueberhaupt funktionieren?
	public static boolean running = false;

	// Schon vorbei?
	public static boolean gameover = false;

	/*
	 * Ich bin zu Faul jedes mal die Funktion rauszusuchen also lICHWAREINUMLAUTse ich es ueber
	 * Attribute wo der Spieler platziert wird
	 */
	ScrollerRight sr;
	ScrollerDown sd;
	ScrollerUp su;
	ScrollerLeft sl;
	
	InternerLvLcreator ilvlC;

	public static int level = 1;
	public static int maxLvlAnzahl = 7;
	
	public static int Score = 0;
	
	public static boolean soundOn = true;
	

	// Ja wo is denn der Spieler? Ach da isser!
	public int playerPositionX = 20;
	public int playerPositionY = 20;

	// Hmm.. wo muss ich doch gleich hin? Oh.. da stehts
	public int exitPositionX = 500;
	public int exitPositionY = 500;
	public String imagePathBox ="/images/obstacles/Doors/Keys/KeyMini/Box.png";
	public String imagePathBlueKey="/images/obstacles/Doors/Keys/KeyMini/Schluessel_blau_mini.png";
	public String imagePathYellowKey="/images/obstacles/Doors/Keys/KeyMini/Schluessel_gelb_mini.png";
	public String imagePathGreenKey="/images/obstacles/Doors/Keys/KeyMini/Schluessel_gruen_mini.png";
	public String imagePathOrangeKey="/images/obstacles/Doors/Keys/KeyMini/Schluessel_orange_mini.png";
	public String imagePathPinkKey="/images/obstacles/Doors/Keys/KeyMini/Schluessel_pink_mini.png";
	public String imagePathSilverKey="/images/obstacles/Doors/Keys/KeyMini/Schluessel_silber_mini.png";
	/*
	 * Ein haufen von BlICHWAREINUMLAUTcken, dass man nicht in die bodenlose Gruft des Grauens
	 * faellt
	 */
	private LinkedList<Block> b;

	// Hier kommen die allseits (un-)beliebten Gegner her
	private LinkedList<Ghostly> e;
	
	private LinkedList<Coin> co;
	
	public static boolean allessichtbar = false;

	// Und her mit dem Objekt Player
	Player p;

	// Dass du auch immer alles Kontrollieren musst..
	Controller c;

	// Hier wird der Ausgang festgelegt
	Exit ex;
	
	
	Background back;
	
	
	public boolean spielmenue = false;
	
	JFrame j;


	// Le Konstruktor..
	public Game(JFrame j) {

		this.j = j;
		
		// createMenue();

		// Initiiere das Spiel!
	System.out.println("blubb");
	
initGame();
	}

	// Und hier ist die Methode dazu:
	public void initGame() {

		// Panel "hICHWAREINUMLAUTrt" sofort beim starten auf Input


		// Muss ich das ueberhaupt tun, oder schon Spiel vorbei?
		if (!gameover) {
			back = new Background();
			
		    // Hier wird auch der Controller eingefuehrt
			c = new Controller();
			// Die Blockliste wird aus dem Controller geholt
			b = Controller.getBlockBounds();
			// Die Gegnerliste wird aus dem Controller geholt
			e = Controller.getEnemyBounds();

			su = new ScrollerUp(0,0,allessichtbar,Window.windowWidth,50);
			sr = new ScrollerRight(Window.windowWidth-100,0,allessichtbar,500,Window.windowHeight);
			sl = new ScrollerLeft(0,0,allessichtbar,100,Window.windowHeight);
			sd = new ScrollerDown(0,Window.windowHeight-100,allessichtbar,Window.windowWidth,50);
			
			
			// Ach.. die Spielfigur steuern willste auch noch? Hier...
			
			addKeyListener();

			
			ilvlC = new InternerLvLcreator();
			// Started die Methodet "start()"

			start();
			
		}

	}

	// Auch die Klasse hat ein Update... faszinierend
	public void update() {

		
		// Wenn das Spiel vorbei ist.. hau aus dem System ab und wander' nach
		// Amerika aus
		if (gameover) {

			System.exit(0);

		}

		

	}
	
	public void addKeyListener(){
		
		addKeyListener(new KeyboardInput(Controller.returnPlayer(), this));
	    
		setFocusable(true);
		
	    
		
	}
	
	

	/*
	 * Hier ist das Herzstueck des zeichnens.. hier wird alles zusammen auf das
	 * Fenster geklatscht!
	 */
	public void paint(Graphics g) {
		/*
		 * Das ist so super was du da reingeschrieben hast.. das schicke ich
		 * doch glattmeiner stammklasse
		 */
		super.paint(g);
		// Ich bin aber so gemein und caste es in ein Schaf... aeh in Graphics2D
		Graphics2D g2d = (Graphics2D) g;
		
		// Muss ich das ueberhaupt tun?
		if (!gameover) {
			back.paint(g2d);
			// p.paint(g2d);
            su.paint(g2d);
            sd.paint(g2d);
            sr.paint(g2d);
            sl.paint(g2d);
			
			// Malt alles was im Controller ist
			c.paint(g2d);
			// ex.paint(g2d);
			g2d.setColor(Color.white);
			
			g2d.drawString("Score: " + Score, Window.windowWidth - 100, 20);
			g2d.drawImage(returnBoxImage(), 5, Window.windowHeight-100, null);
			if(Player.SchluesselBlau){
		    g2d.drawImage(returnBlueImage(), 9, Window.windowHeight-95, null);	
			}if(Player.SchluesselGelb){
				 g2d.drawImage(returnYellowImage(), 9, Window.windowHeight-85, null);
			}if(Player.SchluesselGruen){
				 g2d.drawImage(returnGreenImage(), 9, Window.windowHeight-75, null);
			}if(Player.SchluesselOrange){
				 g2d.drawImage(returnOrangeImage(), 9, Window.windowHeight-65, null);
			}if(Player.SchluesselPink){
				 g2d.drawImage(returnPinkImage(), 9, Window.windowHeight-55, null);
			}if(Player.SchluesselSilber){
				 g2d.drawImage(returnSilverImage(), 9, Window.windowHeight-45, null);
			}
			
			
			
			// g2d.drawString("Score = " + Score, 400, 10);
      
		}
	}

	// Hallo, ich bin start()!!

	public void start() {

		// Ich erstelle einen neuen Thread

		new Thread(this).start();

		// Und setze das Attribut "running" auf true

		running = true;

	}

	// Ich bin stop()

	public void stop() {

		// Und setze Running wieder auf false, bei aufruf

		running = false;

	}

	// Ich bin die wichtigste Methode

	public void run() {

		// Waehrend running true ist mache ich das alles:

		while (running) {

			// Jeder braucht ein bisschen schlaf...
			try {
				Thread.sleep(25);
			}

			// Ausser es geht was schief, dann meckere ich
			catch (Exception e) {

				e.printStackTrace();
			}

			// Hier kommen die ganzen Updates rein

			try {
				// .. doch muss ich das ueberhaupt tun?
				if (!gameover) {
					
					
					// Updatemethode ausfuehren!
					update();
					// p.update(b,e,ex);
					// Und auch der Controller wird geupdated
				
					c.update(b, e, co ,sd,sl,sr,su);
					//back.update();
					// Jetzt wird alles wieder neu gezeichnet
					
					
					
					repaint();}
				
				// Und wenn du's versaust meckere ich
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
	
//Die Funktion, dass die Eingabe ueberhaupt funktioniert
	public void keyPressed(KeyEvent e) {

		
		
		
//Krieg doch endlich den Code des Keys her		
		switch (e.getKeyCode()) {
//Wenn escape gedrueckt.. hICHWAREINUMLAUTr mal auf mit dem Thread, ok?
		case KeyEvent.VK_ESCAPE:
			System.exit(0);
		}

	}
	
	public Game returnGame(){
		
		return this;
	}
	
	public Image returnBoxImage(){
		ImageIcon i = new ImageIcon(getClass().getResource(imagePathBox));
		return i.getImage();
			
		
	}
	public Image returnBlueImage(){
		ImageIcon i = new ImageIcon(getClass().getResource(imagePathBlueKey));
		return i.getImage();
			
		
	}
	public Image returnYellowImage(){
		ImageIcon i = new ImageIcon(getClass().getResource(imagePathYellowKey));
		return i.getImage();
			
		
	}
	public Image returnGreenImage(){
		ImageIcon i = new ImageIcon(getClass().getResource(imagePathGreenKey));
		return i.getImage();
			
		
	}	public Image returnPinkImage(){
		ImageIcon i = new ImageIcon(getClass().getResource(imagePathPinkKey));
		return i.getImage();
			
		
	}	public Image returnSilverImage(){
		ImageIcon i = new ImageIcon(getClass().getResource(imagePathSilverKey));
		return i.getImage();
			
		
	}	public Image returnOrangeImage(){
		ImageIcon i = new ImageIcon(getClass().getResource(imagePathOrangeKey));
		return i.getImage();
			
		
	}
	
}
