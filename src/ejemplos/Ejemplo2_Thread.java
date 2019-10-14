package ejemplos;

public class Ejemplo2_Thread extends Thread{

	@Override
	public void run() {
		super.run();
		System.out.println("Inicio de la ejecucion del hilo");
		System.out.println("Fin de la ejecucion del hilo");
	}
}
