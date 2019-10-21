package practica2;

public class Clase_Ejercicio1 extends Thread {
	
	int numero;
	public Clase_Ejercicio1(String nombre, int numero) {
		super(nombre);
		this.numero=numero;
		
	}
	
	public void run() {
		super.run();
		System.out.println(Thread.currentThread().getName()+" Iniciado");
		
		for(int i=0;i<100;i++) {
			
		}
		System.out.println(Thread.currentThread().getName()+" Finalizado");
		for( int i=1;i<=numero;i++) {
			System.out.println(getName()+"_hijoDe "+Thread.currentThread().getName());
		}
		System.out.println(Thread.currentThread().getName()+" Finalizado");
	
	}
}
