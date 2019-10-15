package practica1;

public class FibonacciRunnable implements Runnable{
	int num;
	Thread t;
	
	public FibonacciRunnable(int numero) {
		super();
		this.t=new Thread(this,"Nuevo hilo");
		this.num=numero;
		t.start();
	}
	
	@Override
	public void run() {
		 int fibo1,fibo2;   
	     fibo1=1;
	     fibo2=1;
	     System.out.print(fibo1 + " ");
	     
	     for(int i=2;i<=num;i++){
	         System.out.print(fibo2 + " ");
	         fibo2 = fibo1 + fibo2;
	         fibo1 = fibo2 - fibo1;
	     }
	     System.out.println();
	}
		
}
