package ejemplos;

//Implementamos la interfaz
public class Ejemplo1_Runnable  implements Runnable{

	Thread t;
	public Ejemplo1_Runnable() {
		super();
		this.t=new Thread(this,"Nuevo hilo");
		System.out.println("Creado hilo "+t);
		t.start();
	}
	
	@Override
	public void run() {
		System.out.println("El hilo esta en ejecucion ");
		System.out.println("Hilo finalizado");
	}

}
