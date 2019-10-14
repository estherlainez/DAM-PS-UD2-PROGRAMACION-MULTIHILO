package practica1;
import java.util.*;
public class EjecucionFibonacciThread {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Inicio");
		System.out.println("Introduce numero");
		int numero=teclado.nextInt();
		FibonacciThread fibo=new FibonacciThread();
		fibo.start();
		System.out.println("Fin");
		
	}

}
