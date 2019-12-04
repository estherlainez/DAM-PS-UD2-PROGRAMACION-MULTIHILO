package practica3_filosofos;

import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args) {
		Semaphore sem=new Semaphore(5);
		Filosofo[] filosofos=new Filosofo[5];
		for(int i=0;i<5;i++) {
			filosofos[i]=new Filosofo("Filo_"+i,sem);
			filosofos[i].start();
		}

	}

}
