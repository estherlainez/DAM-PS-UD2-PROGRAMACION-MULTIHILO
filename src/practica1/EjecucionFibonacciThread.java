package practica1;
import java.util.*;
public class EjecucionFibonacciThread {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Inicio");
		System.out.println("Introduce numero");
		int numero=teclado.nextInt();
		FibonacciThread fibo=new FibonacciThread(numero);
		fibo.start();
		/*
		System.out.println("Introduce numero");
		int numero2=teclado.nextInt();
		FibonacciThread fibo2=new FibonacciThread(numero2);
		fibo2.start();
		System.out.println("Fin");
		*/
	}

}
