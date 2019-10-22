package practica2;

public class Tic extends Thread{
	
	public void run() {
		super.run();
		while(true) {
			System.out.println("Tic");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
		}
		
	
	}
	
	

}
