package de.dviol.control;

public class Main extends Thread {

	private static boolean PAUSED = false;
	private static Controller controller;
	

	public static void main(String[] args) {
		controller = Controller.getInstance();
		(new Main()).start();
		
		
		
	}
	@Override
	public void run() {
		
		try {
			
		while(!PAUSED) {	
		
			
			Controller.update();
			
			
		
		}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
