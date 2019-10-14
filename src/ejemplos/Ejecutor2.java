package ejemplos;

public class Ejecutor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio del proceso padre");
		new Ejemplo2_Thread().start();
		System.out.println("Fin del proceso padre");

	}

}
