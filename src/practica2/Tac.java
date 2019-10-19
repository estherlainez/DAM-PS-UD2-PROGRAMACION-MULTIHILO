package practica2;

public class Tac extends Thread{
	
	public void run() {
		super.run();
		while(true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Tac");
		}
		
	
	}

}
