package practica2;

public class Tac extends Thread{
	
	public void run() {
		super.run();
		/*bucle infinito otras maneras serian:
		 * while(1==1)
		 * for(; ; )
		*/
		while(true) {
			try {
				Thread.sleep(1001);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("Tac");
		}
		
	
	}

}
