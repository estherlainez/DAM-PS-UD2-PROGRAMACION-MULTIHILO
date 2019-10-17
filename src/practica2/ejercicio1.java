package practica2;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tic a=new Tic();
		Tac b=new Tac();
		a.start();
		try {
			a.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		b.start();

	}

}
