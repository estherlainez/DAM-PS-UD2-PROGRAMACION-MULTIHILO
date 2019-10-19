package practica2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.time.LocalTime;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Horas extends JFrame implements Runnable{

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Horas frame = new Horas();
					frame.setVisible(true);
					new Horas();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Thread t;
	public Horas() {
		
		super();
		this.t=new Thread(this,"Hilo horas");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(166, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblHoras = new JLabel("Horas");
		lblHoras.setBounds(166, 111, 89, 49);
		contentPane.add(lblHoras);
		lblHoras.setText(LocalTime.now().toString());
		
		t.start();
		
		
	}

	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		LocalTime.now().toString();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
