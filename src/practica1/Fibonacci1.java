package practica1;

public class Fibonacci1 implements Runnable{

	Thread hilo;
	@Override
	public void run() {
		int n = 0;
		fibonacci(n);
		
	}
	
	public int fibonacci(int n)
	{
	    if (n>1){
	       return fibonacci(n-1) + fibonacci(n-2);
	    }
	    else if (n==1) {
	        return 1;
	    }
	    else if (n==0){ 
	        return 0;
	    }
	    else{
	        System.out.println("Debes ingresar un tamaño mayor o igual a 1");
	        return -1; 
	    }
	}

}
