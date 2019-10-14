package practica1;

public class FibonacciThread extends Thread {
	int numero;
	
	@Override
	public void run() {
		super.run();
		System.out.println("Inicio....");
		int fibo1,fibo2;  
        fibo1=1;
        fibo2=1;
        System.out.print(fibo1 + " ");
        
        for(int i=2;i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        System.out.println();
		System.out.println("Fin del hilo");
		
	}
}
