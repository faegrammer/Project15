package com.nero.src.input;



import com.nero.helper.BouncerToDown;
import com.nero.helper.BouncerToLeft;
import com.nero.helper.BouncerToRight;
import com.nero.helper.BouncerToUp;

import com.nero.src.Game;
import com.nero.src.Window;
import com.nero.src.objects.Block;
import com.nero.src.objects.Coin;
import com.nero.src.objects.Enemy;


public class InternerLvLcreator {

	public static String[][] levels;

	public static int maxZeilen = ((Window.windowHeight * 2) / 50);
	public static int maxSpalten = ((Window.windowWidth * 2) / 50);

	public static int oldX;
	public static int oldY;
	

	private static String s;

	public static boolean globaleSichtbarkeit;

	public InternerLvLcreator() {
	
		globaleSichtbarkeit = Game.allessichtbar;
		
		levels = new String[Game.maxLvlAnzahl + 1][maxZeilen];
		for (int i = 1; i < Game.maxLvlAnzahl; i++) {
			for (int k = 0; k < maxZeilen; k++) {

				levels[i][k] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";

			}

		}
		
		/*
		 * Spieler:
		 * 
		 * p = Spieler
		 * 
		 * Exit:
		 * 
		 * a = Ausgang
		 * 
		 * 
		 * Objekt:
		 * 
		 * o = Obstacle
		 * 
		 * Coin:
		 * 
		 * c = Coin
		 * 
		 * Gegner:
		 * 
		 * ? = Enemy
		 * e = Enemy nach links 
		 * + = Enemy nach rechts
		 * - = Enemy nach oben
		 * / = Enemy nach unten
		 * 
		 * 
		 * 
		 * Bouncer:
		 * 
		 * r = Bouncer RECHTS 
		 * l = Bouncer LINKS 
		 * u = Bouncer HOCH 
		 * d = Bouncer RUNTER
		 * 
		 * Doors
		 * 
		 * A = Door blau
		 * B = Door gelb
		 * C = Door gruen
		 * D = Door orange
		 * E = Door pink
		 * F = Door silber
		 * 
		 * Z = Key blau
		 * Y = Key gelb
		 * X = Key gruen
		 * W = Key orange
		 * V = Key pink
		 * U = Key silber
	
		 */
		

		// Level 1
levels[1][0]  = "oooooooooooooooooooooooooooooooooo";
levels[1][1]  = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[1][2]  = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnenno";
levels[1][3]  = "onpnnnnnnnnnnnnoooooonnnnnnnnnnnno";
levels[1][4]  = "oooooonnnnnnnnnonnnnnonnnnnnnnnnno";
levels[1][5]  = "odnnnnnnnnnnnnnonnnnnnonnnnnnnnnno";
levels[1][6]  = "onnnnnncnnnnnnnonnnnnnnnnnnooooooo";
levels[1][7]  = "onnnnnnnnnnnnnnonnnnnnnnooonnnnnno";
levels[1][8]  = "onnnnnncccnnnnnonnnnnnnonnnnnnnnno";
levels[1][9]  = "onnnnnncZcnnnnnoooooonnnnnnnnnnnno";
levels[1][10] = "onnnnnncccnnnnnonnnnnoonnnnnnnnnno";
levels[1][11] = "onnnnnnnnnnnnnnonnnnnnnnnnnnnnnnno";
levels[1][12] = "onnnnnnnnncnnnnonnnnnnnnnnnooooooo";
levels[1][13] = "onnnnnnnnnnnnnnonnnnnnnnnoonnnnnno";
levels[1][14] = "onnnnnnnnnnnnnnonnnnnonnnnnnnnnnno";
levels[1][15] = "onnnnnnnnnooooooooooonnnnnnnnnnnno";
levels[1][16] = "onnnnnnnnndddddonnnnnnnnnnnnnnnnno";
levels[1][17] = "onnnnnnnnn-/-/-nnonnnnnnnnnnnnnnno";
levels[1][18] = "onnnnnnnnnnnnnnonnnnnnnnnnnooooooo";
levels[1][19] = "onnnnncnnnnnnnnonnnnnnnnooonnnnnno";
levels[1][20] = "o-nnnnnnnnnnnnnoccccccnnnnnnnnnnno";
levels[1][21] = "onnnnnnnnnnnnnnooooooonnnnnnnnnnno";
levels[1][22] = "onnnnnnnnnnnnnnonnnnnnoonnnnnnnnno";
levels[1][23] = "onnnnnnnnnnnnnnonnnnnnnnnnnnnnnnno";
levels[1][24] = "onnnnnnnnnnnnnnonnnnnnnnnnoooooooo";
levels[1][25] = "onnnnnnnnnnnnnnonnnnnnnnnnnnnnnnno";
levels[1][26] = "ounnnnnnnnuuuuuAannnnnnnnonnnnnnno";
levels[1][27] = "oooooooooooooooooooooooooooooooooo";


levels[2][0]  = "oooooooooooooooooooooooooooooooooooooooooooo";
levels[2][1]  = "opnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[2][2]  = "oooooooooooooooooooooooooooooooooooooooooono";
levels[2][3]  = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[2][4]  = "onoooooooooooooooooooooooooooooooooooooooooo";
levels[2][5]  = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[2][6]  = "oooooooooooooooooooooooooooooooooooooooooono";
levels[2][7]  = "onnnnnnnnnCnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[2][8]  = "onoooooooooooonnnnnnnnnnnnnnnnnonnnnnnnnnnno";
levels[2][9]  = "onnnnnnnnonnndnnononnnnnno?o?o?ooooooooooooo";
levels[2][10] = "ooooooo?noXonnnno?onnnn??ooooooonnnnnnnnnnno";
levels[2][11] = "onnnnnonnoooonoooooooooooonnnnnnnnnnnnnnnnno";
levels[2][12] = "onnnnnonnnnYo-on?nnnnnn?nnnnnooooooooooooono";
levels[2][13] = "onnnnnonooooouo?nnnn?nnnnn?nnonnnnnnnnnnnnno";
levels[2][14] = "onnnnnonnnnnooo?nooooooooooooonn?ooooooooooo";
levels[2][15] = "onnnnnonnnnnBnnnnoVnnnnnnnnnnnnnnnnnnnnnnnno";
levels[2][16] = "onnnnnoooooooooooooooooonoooooo?nnnnnnnnnnno";
levels[2][17] = "onnnnnnnnnnnnnnnnnnnnnnononnnnnnnnnnnnnnnnno";
levels[2][18] = "onnnnnnnnnnnnnnnnnnnnnnoAonnnnnnnnnnnnnnnnno";
levels[2][19] = "onnnnnnnnnnnnnnnnnnnnnnooonnnnnnnnnnnnnnnnno";
levels[2][20] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[2][21] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[2][22] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[2][23] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[2][24] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[2][25] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[2][26] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[2][27] = "oooooooooooooooooooooooooooooooooooooooooooo";


levels[3][0]  = "oooooooooooooooooooooooooooooooooo";
levels[3][1]  = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[3][2]  = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[3][3]  = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[3][4]  = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[3][5]  = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[3][6]  = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[3][7]  = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[3][8]  = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[3][9]  = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[3][10] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[3][11] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[3][12] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[3][13] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[3][14] = "onnnnnnnnooooooooonnnn/dnnnnnnnnao";
levels[3][15] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[3][16] = "onnnnnnnnnnnnnnnnnnnnnoooooooooooo";
levels[3][17] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[3][18] = "onnoooooocccccccoooooonnnnnnnnnnno";
levels[3][19] = "onnooooooonnnnnooooooooooooonnnnno";
levels[3][20] = "onnnnnnnnnnnoonnnnnelooooooooonnno";
levels[3][21] = "onnnnnEnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[3][22] = "oooooooooonnnnnnnnnnnnnnnnnnnnnnno";
levels[3][23] = "onnnnnnnnnnnnnnnVnnnnnnnnnnnnnnnno";
levels[3][24] = "onnnnnnnnnnnnnnooooooonnnnnnnnnnno";
levels[3][25] = "onnnnnnnnnnnnnnn+rnnnnnnnnooonnnno";
levels[3][26] = "onnpnnnnnnnnnnnnnnccccccccnnnnnnno";
levels[3][27] = "oooooooooooooooooooooooooooooooooo";


levels[4][0]  = "oooooooooooooooooooooooooooooooooo";
levels[4][1]  = "opnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[4][2]  = "ooooooooocnnnnnnnnnnnnnnnnnnnnnnno";
levels[4][3]  = "onnnnnnoooocnnnnnnnnnnnnnnnnnnnnno";
levels[4][4]  = "onnnVnnnnoooocnnnnnnnnnnnnnnnnnnno";
levels[4][5]  = "onnnnnnnnnnoooocnnnnnnnnnnnnnnnnno";
levels[4][6]  = "onnnoonnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[4][7]  = "oooooooooooooooooooooooooooEoooooo";
levels[4][8]  = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[4][9]  = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[4][10] = "ornnnnnnnnnnnnnnnnnnnnnnnnnnnnnelo";
levels[4][11] = "onnoonnoonnoonnoonnoonnoonnoonnooo";
levels[4][12] = "occFccccccccccccccccccccccccccccco";
levels[4][13] = "ooooooooooooooUooooooooooooooooooo";
levels[4][14] = "onnnndnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[4][15] = "onnnnnnnnnnnoooonnnnnnnnnnnnnnnnno";
levels[4][16] = "onnnnnnnnnoooooooonnnnnnnnnnnnnnno";
levels[4][17] = "onnnnnnnooooooooooonnnnnnnnnnnnnno";
levels[4][18] = "onnnnnooocccccccccooonnnnnnnnnnnno";
levels[4][19] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[4][20] = "ooooooooooooooooooooooooonnnnnnnno";
levels[4][21] = "onnnnnnnndnnnnndnnnnnnndnnnnnnnnno";
levels[4][22] = "onnnn-nnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[4][23] = "onnnnnnnn-nnnnn-nnnnnnn-nnnnnnnnno";
levels[4][24] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[4][25] = "onnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnno";
levels[4][26] = "oannnunnnunnnnnunnnnnnnunnnnnnnnno";
levels[4][27] = "oooooooooooooooooooooooooooooooooo";
        
        
        
        
        
		internerLvlControl();

	}

	public static void internerLvlControl() {
		
	    Controller.closeTheDoors();
		Controller.returnKeyBlau().makeVisibility();
		Controller.returnKeyGelb().makeVisibility();
		Controller.returnKeyGruen().makeVisibility();
		Controller.returnKeyOrange().makeVisibility();
		Controller.returnKeyPink().makeVisibility();
		Controller.returnKeySilber().makeVisibility();
		Controller.returnPlayer().deleteInventory();
		
		
		/*if (Game.level > Game.maxLvlAnzahl) {

			System.exit(0);
		}*/
try{
		for (int i = 0; i < maxSpalten; i++) {
			for (int k = 0; k < maxZeilen; k++) {

				s = levels[Game.level][k].substring(i, i + 1);

				if (s.equals("p")) {

					Controller.returnPlayer().setPlayerPosition(0,0);
					oldX = i * 50 +5 ;
					oldY = k * 50 +8 ;
				}
			}
		}

		// Controller.returnPlayer().setPlayerPosition(100, 100);
		System.out.println("X Spieler: " + oldX);
		System.out.println("Y Spieler " + oldY);

		for (int i = 0; i < maxSpalten; i++) {
			for (int k = 0; k < maxZeilen; k++) {

				s = levels[Game.level][k].substring(i, i + 1);

				if (s.equals("o")) {

					Controller
							.addBlock(new Block(i * 50 - oldX, k * 50 - oldY));

				} 
				
				else if (s.equals("A")) {

					Controller.returnDoorBlau().setPosition(i * 50 - oldX, k * 50 - oldY);

				}else if (s.equals("B")) {

					Controller.returnDoorGelb().setPosition(i * 50 - oldX, k * 50 - oldY);

				} else if (s.equals("C")) {

					Controller.returnDoorGruen().setPosition(i * 50 - oldX, k * 50 - oldY);

				} else if (s.equals("D")) {

					Controller.returnDoorOrange().setPosition(i * 50 - oldX, k * 50 - oldY);

				} else if (s.equals("E")) {

					Controller.returnDoorPink().setPosition(i * 50 - oldX, k * 50 - oldY);

				} else if (s.equals("F")) {

					Controller.returnDoorSilber().setPosition(i * 50 - oldX, k * 50 - oldY);

				} else if (s.equals("Z")) {

					Controller.returnKeyBlau().setPosition(i * 50 - oldX, k * 50 - oldY);

				} else if (s.equals("Y")) {

					Controller.returnKeyGelb().setPosition(i * 50 - oldX, k * 50 - oldY);

				} else if (s.equals("X")) {

					Controller.returnKeyGruen().setPosition(i * 50 - oldX, k * 50 - oldY);

				} else if (s.equals("W")) {

					Controller.returnKeyOrange().setPosition(i * 50 - oldX, k * 50 - oldY);

				} else if (s.equals("V")) {

					Controller.returnKeyPink().setPosition(i * 50 - oldX, k * 50 - oldY);

				} else if (s.equals("U")) {

					Controller.returnKeySilber().setPosition(i * 50 - oldX, k * 50 - oldY);

				} 
				
				
				
				
				
				else if (s.equals("r")) {

					Controller.addBouncerToRight(new BouncerToRight(i * 50
							- oldX + 40, k * 50 - oldY + 10,
							globaleSichtbarkeit));

				} else if(s.equals("c")){
				
					Controller.addCoin(new Coin(i*50  - oldX, k*50 - oldY));
					
				}else if (s.equals("l")) {

					Controller.addBouncerToLeft(new BouncerToLeft(
							i * 50  - oldX, k * 50 - oldY + 10,
							globaleSichtbarkeit));

				} else if (s.equals("u")) {

					Controller.addBouncerToUp(new BouncerToUp(i * 50 - oldX
							+ 10, k * 50 - oldY, globaleSichtbarkeit));

				} else if (s.equals("d")) {

					Controller.addBouncerToDown(new BouncerToDown(i * 50 - oldX
							+ 10, k * 50 - oldY + 40, globaleSichtbarkeit));

				}	

				

				else if (s.equals("+")) {

					Controller.addEnemy(new Enemy(i * 50 - oldX, k * 50 - oldY,
							true));
					Controller.addBouncerToRight(new BouncerToRight(i * 50
							- oldX + 40, k * 50 - oldY + 10,
							globaleSichtbarkeit));

				} else if (s.equals("e")) {

					Controller.addEnemy(new Enemy(i * 50 - oldX, k * 50 - oldY,
							false));
					Controller.addBouncerToLeft(new BouncerToLeft(
							i * 50 - oldX, k * 50 - oldY + 10,
							globaleSichtbarkeit));

				} else if (s.equals("-")) {

					Controller.addEnemy(new Enemy(i * 50 - oldX, k * 50 - oldY,
							false));
					Controller.addBouncerToUp(new BouncerToUp(i * 50 - oldX
							+ 10, k * 50 - oldY, globaleSichtbarkeit));

				} else if (s.equals("&")) {

					Controller.addEnemy(new Enemy(i * 50 - oldX, k * 50 - oldY,
							false));
					Controller.addBouncerToDown(new BouncerToDown(i * 50 - oldX
							+ 10, k * 50 - oldY + 40, globaleSichtbarkeit));

				}

				else if (s.equals("a")) {

					Controller.ex.setExitPosition(i * 50 - oldX, k * 50 - oldY);

				} else if (s.equals("?")) {

					Controller.addEnemy(new Enemy(i * 50 - oldX, k * 50 - oldY,
							false));
					;
				}

			}

		}

	}
catch(Exception e){
	
	System.exit(0);
	
}
	
	}}
	
	


