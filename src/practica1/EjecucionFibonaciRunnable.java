package practica1;
import java.util.*;

public class EjecucionFibonaciRunnable {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un numero");
		int numero1=teclado.nextInt();
		System.out.println("Introduce otro numero");
		int numero2=teclado.nextInt();
		System.out.println("Introduce otro numero");
		int numero3=teclado.nextInt();
		FibonacciRunnable f= new FibonacciRunnable(numero1);
		FibonacciRunnable g= new FibonacciRunnable(numero2);
		FibonacciRunnable k= new FibonacciRunnable(numero3);
		
		System.out.println("Su serie de numeros...");

	}

}
