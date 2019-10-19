package ejemplos;

public class E3_HiloEjemplo extends Thread{
	
	public E3_HiloEjemplo(String nombre) {
		super(nombre);
		System.out.println("CREANDO HILO"+this.getName());
	}
	
	@Override
	public void run() {
		super.run();
		for(int i=0;i<5;i++) {
			System.out.println("\t Hilo: "+getName()+" Cont: "+i );
		}
	}

}
