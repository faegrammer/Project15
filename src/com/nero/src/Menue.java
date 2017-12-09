package com.nero.src;

import java.awt.Frame;
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
	public final static int ButtonX = 50;

	// So ne lustige Formel um die Breite und HICHWAREINUMLAUThe der Buttons
	// festzulegen
	public final static int widthButtons = Window.windowWidth - 2 * ButtonX;
	public final static int heightButtons = Window.windowHeight * 1 / 5 - 20;

	// Y-Koordinate fuer alle BlICHWAREINUMLAUTcke.. auch wieder mit Formel
	public int exitButtonY = Window.windowHeight - heightButtons - 50;
	public int highscoreButtonY = exitButtonY - heightButtons - 10;
	public int levelcreatorButtonY = highscoreButtonY - heightButtons - 10;
	public int optionsButtonY = levelcreatorButtonY - heightButtons - 10;
	public int startButtonY = optionsButtonY - heightButtons - 10;
	private String musicPath = "/Sound/backgroundmusic.wav";

	public boolean running;


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


		btstart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btStartActionPerformed(e);

			}
		});

		bthighscore.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				btHighscoreActionPerformed(e);

			}
		});

		btoptions.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				btOptionsActionPerformed(e);

			}
		});

		btlevelcreator.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				btLevelcreatorActionPerformed(e);

			}
		});

		btexit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				btExitActionPerformed(e);

			}
		});

		start();

	}




	// Hier sind die Methoden zu den ActionListenern

	private void btStartActionPerformed(ActionEvent evt) {

		CardLayoutManager.cardLayout.show(CardLayoutManager.getCardContainer(), CardLayoutManagerI.GAME);
		g.addKeyListener();
		g.j.setState(Frame.ICONIFIED);
		g.j.setState(Frame.NORMAL);
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

	public void start() {

		new Thread(this).start();
		running = true;

	}


	public void stop() {

		running = false;

	}

	@Override
	public void run() {

		while (running) {

			try {
				// Alle Objekte werden in ihre grICHWAREINUMLAUTsse und an ihren Posten gebracht
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
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
