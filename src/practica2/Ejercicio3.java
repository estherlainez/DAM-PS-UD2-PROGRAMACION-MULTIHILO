package practica2;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un numero, debe ser menor o igual que 5");
		int numero=teclado.nextInt();
		Clase_Ejercicio3 h1= new Clase_Ejercicio3("HILO",numero);
		h1.start();
		
			
		
		
		
	
	}

}
