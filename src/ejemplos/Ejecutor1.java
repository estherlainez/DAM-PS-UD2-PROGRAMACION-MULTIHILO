package ejemplos;

public class Ejecutor1 {

	public static void main(String[] args) {
		System.out.println("Hilo principal");
		//Creamos y lanzamos el hilo
		new Ejemplo1_Runnable();
		System.out.println("Proceso terminado");
		

	}

}
