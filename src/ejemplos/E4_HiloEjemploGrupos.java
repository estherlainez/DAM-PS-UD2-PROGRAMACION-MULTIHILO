package ejemplos;

public class E4_HiloEjemploGrupos extends Thread{
	
	@Override
	public void run() {
		super.run();
		System.out.println("\t Informacion del Hilo "+Thread.currentThread().toString());
		for(int i=0;i<100;i++) {
			
		}
		System.out.println(Thread.currentThread().getName()+" Finalizando ejecucion");
	}

}
