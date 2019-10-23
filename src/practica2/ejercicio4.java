package practica2;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Hilo principal iniciado");
			Clase_Ejercicio3 hilo=new Clase_Ejercicio3(1,"PRIMOGENITO");
			hilo.start();
		
			hilo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hilo principal finalizado");
		
	}

}
