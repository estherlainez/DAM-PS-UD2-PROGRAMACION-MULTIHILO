package ejemplos;

public class E1_Ejecutor1 {

	public static void main(String[] args) {
		System.out.println("Hilo principal");
		//Creamos y lanzamos el hilo
		new E1_Ejemplo1_Runnable();
		System.out.println("Proceso terminado");
		

	}

}
