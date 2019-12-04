package practica3_filosofos;

import java.util.concurrent.Semaphore;

public class Filosofo extends Thread{

	private Semaphore sem;
	private String name;
	public Filosofo(String name, Semaphore sem) {
		this.sem=sem;
		this.name=name;
		
	}
	
	public void run() {
		super.run();
		for(int i=0;i<4;i++) {
			try {
				sem.acquire(2);
				Tenedor.cogerTenedor(this.name);
				Tenedor.cogerTenedor(this.name);
				System.out.println(this.name+" esta comiendo");
				Thread.sleep(3000);
				Tenedor.soltarTenedor(this.name);
				Tenedor.soltarTenedor(this.name);
				sem.release(2);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		System.out.println(this.name+" ha terminado de comer");
	}
}
