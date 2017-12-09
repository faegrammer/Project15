package com.nero.src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

import com.nero.helper.Sound;



public class Menue extends JPanel implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Wo ist der Button auf der X-achse?
	public int ButtonX = 50;

	// So ne lustige Formel um die Breite und HICHWAREINUMLAUThe der Buttons festzulegen
	public int widthButtons = Window.windowWidth - 2 * ButtonX;
	public int heightButtons = Window.windowHeight * 1 / 5 - 20;

	// Y-Koordinate fuer alle BlICHWAREINUMLAUTcke.. auch wieder mit Formel
	public int exitButtonY = Window.windowHeight - heightButtons - 50;
	public int highscoreButtonY = exitButtonY - heightButtons - 10;
	public int levelcreatorButtonY = highscoreButtonY - heightButtons - 10;
	public int optionsButtonY = levelcreatorButtonY - heightButtons - 10;
	public int startButtonY = optionsButtonY - heightButtons - 10;
	private String musicPath = "/Sound/backgroundmusic.wav";

	// Run Thread, RUN!!
	public boolean running;

	// Alle Buttons, ohoooo..

	JButton btstart;
	JButton btoptions;
	JButton bthighscore;
	JButton btlevelcreator;
	JButton btexit;
	Sound s;
	
	Game g;
	

	public Menue(Game g) {
		
		this.g = g;
		s = new Sound(musicPath);
		
		// Hier werden sie auch wieder eingefuegt
		btstart = new JButton("Start");
		bthighscore = new JButton("Highscore");
		btlevelcreator = new JButton("Levelersteller");
		btoptions = new JButton("Optionen");
		btexit = new JButton("Exit");

		add(btstart);

		add(bthighscore);

		add(btlevelcreator);

		add(btoptions);

		add(btexit);

		//System.out.println(ButtonX);

		// Und hier bekommen sie auch tatsaechlich einen Nutzen
		btstart.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				btStartActionPerformed(e);

			}
		});

		bthighscore.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				btHighscoreActionPerformed(e);

			}
		});

		btoptions.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				btOptionsActionPerformed(e);

			}
		});

		btlevelcreator.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				btLevelcreatorActionPerformed(e);

			}
		});

		btexit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				btExitActionPerformed(e);

			}
		});

		// Start!
		start();

	}

	// Seltsam.. ich dachte das hatte frueher mal einen Sinn.. naja..
	public void createMenue() {

	}

	// ZerstICHWAREINUMLAUTre das Menue.. auch noch nicht benutzt.. doof

	public void removeMenue() {

		remove(btstart);
		remove(btexit);
		remove(bthighscore);
		remove(btlevelcreator);
		remove(btoptions);

	}

	// Hier sind die Methoden zu den ActionListenern

	private void btStartActionPerformed(ActionEvent evt) {
             
		
	CardLayoutManager.cardLayout.show(CardLayoutManager.getCardContainer(),CardLayoutManager.GAME);
    g.addKeyListener();
    g.j.setState(JFrame.ICONIFIED);
    g.j.setState(JFrame.NORMAL);
    s.playMusic();
	
	}

	private void btExitActionPerformed(ActionEvent evt) {

		System.exit(0);

	}

	private void btOptionsActionPerformed(ActionEvent evt) {

	}

	private void btLevelcreatorActionPerformed(ActionEvent evt) {

	}

	private void btHighscoreActionPerformed(ActionEvent evt) {

	}

	/*
	 * Start the thread.. seltsam.. threat heisst Bedrohung.. das D ist sanft...
	 * sanfte Bedrohung?
	 */

	public void start() {

		new Thread(this).start();
		running = true;

	}
	
	//HALT STOP, jetzt macht der Thread mal pause, wenn ich aufgerufen werde

	public void stop() {

		running = false;

	}

//Hajoo.. auch ich muss mal rennen	
	public void run() {

		while (running) {

			try {
//Alle Objekte werden in ihre grICHWAREINUMLAUTsse und an ihren Posten gebracht
				btexit.setSize(widthButtons, heightButtons);
				btexit.setLocation(ButtonX, exitButtonY);

				btoptions.setSize(widthButtons, heightButtons);
				btoptions.setLocation(ButtonX, optionsButtonY);

				btlevelcreator.setSize(widthButtons, heightButtons);
				btlevelcreator.setLocation(ButtonX, levelcreatorButtonY);

				bthighscore.setSize(widthButtons, heightButtons);
				bthighscore.setLocation(ButtonX, highscoreButtonY);

				btstart.setSize(widthButtons, heightButtons);
				btstart.setLocation(ButtonX, startButtonY);

				Thread.sleep(10);
//Exceptionball! Catch a Exception
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
