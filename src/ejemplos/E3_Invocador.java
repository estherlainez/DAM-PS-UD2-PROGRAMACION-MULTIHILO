package ejemplos;

public class E3_Invocador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E3_HiloEjemplo h1=new E3_HiloEjemplo("Hilo1");
		E3_HiloEjemplo h2=new E3_HiloEjemplo("Hilo2");
		E3_HiloEjemplo h3=new E3_HiloEjemplo("Hilo3");
		
		h1.start();
		h2.start();
		h3.start();

	}

}
