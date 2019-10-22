package practica2;

public class Clase_Ejercicio3 extends Thread{
	int numero;
	public Clase_Ejercicio3(String nombre,int numero) {
		super(nombre);
		this.numero=numero;
		
	}
	
	public void run() {
		super.run();
		if(numero<5) {
			System.out.println(Thread.currentThread().getName()+" Iniciado");
			
			for( int i=1;i<=numero;i++) {
				System.out.println(getName()+",--> hijo de "+Thread.currentThread().getName()+" Nivel "+i);
				Clase_Ejercicio3 h= new Clase_Ejercicio3(getName(),2);
				h.start();
			}
			System.out.println(Thread.currentThread().getName()+" Finalizado");
		}else {
			System.out.println("El numero debe ser igual o menor de 5");
		}
			
	}

}
