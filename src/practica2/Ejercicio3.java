package practica2;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un numero, debe ser menor o igual que 5");
		int numero=teclado.nextInt();
		if(numero<=5) {
			Thread.currentThread().setName("Hilo Padre");
			
			System.out.println(Thread.currentThread().toString());
			
			ThreadGroup familia=new ThreadGroup("Familia1");
			Clase_Ejercicio3 h1=new Clase_Ejercicio3("Hilo Hijo",numero);
			
			Thread hijo=new Thread(familia,h1,"Hilo Padre");
			
			hijo.start();
		
		}else {
			System.out.println("El numero debe ser menor o igual a 5");
		}
	
	}

}
