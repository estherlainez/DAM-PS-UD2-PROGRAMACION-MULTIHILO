package practica2;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setName("Padre");
		int numero=10;
		System.out.println(Thread.currentThread().toString());
		try {
			ThreadGroup familia=new ThreadGroup("Familia1");
			Clase_Ejercicio1 hiloPrincipal=new Clase_Ejercicio1("Hilo",numero);
			hiloPrincipal.start();
			hiloPrincipal.join();
			Thread hijo=new Thread(familia,hiloPrincipal,"Primogenito");
			hijo.start();
			hijo.join();
			Thread hijo2=new Thread(familia,hijo,"HijoDe_");
			hijo2.start();
			Thread hijo3=new Thread(familia,hijo,"HijoDe_HijoDe");
			hijo3.start();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
