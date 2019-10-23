package practica2;

public class Clase_Ejercicio3 extends Thread{
	int numero;
	public Clase_Ejercicio3(int numero,String nombre) {
		this.setName(nombre);
		this.numero=numero;
		
	}
	
	public void run() {
		
		super.run();
		try {
			System.out.println("Hilo"+this.getName()+"creado");
			
			
			System.out.println("Hilo"+this.getName()+"finalizado");
			if(numero<=5) {
				System.out.println(Thread.currentThread().getName()+" Iniciado");
				
				for( int i=1;i<=numero;i++) {
					
					Clase_Ejercicio3 h= new Clase_Ejercicio3(numero+1,"hijoDe_"+numero+this.getName());
					h.start();
					
					h.join();
					
				}
				System.out.println(Thread.currentThread().getName()+" Finalizado");
			}else {
				System.out.println("----FIN EJECUCION------");
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
