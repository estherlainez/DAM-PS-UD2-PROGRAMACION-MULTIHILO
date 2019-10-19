package ejemplos;

public class E4_Invocador {

	public static void main(String[] args) {
		//Le damos nombre al hilo principal
		Thread.currentThread().setName("Principal");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().toString());
		
		//Creamos el grupo de hilos
		ThreadGroup grupo= new ThreadGroup("Grupo1");
		
		//Creamos un hilo de nuestra clase
		E4_HiloEjemploGrupos h1= new E4_HiloEjemploGrupos();
		//Creamos 3 hilos mas indicando:
			//ThreadGroup al que pertenecen
			//Objeto que deben correr
			//Nombre
		Thread h11=new Thread (grupo, h1,"hilo11");
		Thread h12=new Thread (grupo, h1,"hilo12");
		Thread h13=new Thread (grupo, h1,"hilo13");
		System.out.println("Hilos activos---> "+Thread.activeCount());
		
		h11.start();
		h12.start();
		h13.start();
		
		System.out.println("Hilos activos---> "+Thread.activeCount());

	}

}
