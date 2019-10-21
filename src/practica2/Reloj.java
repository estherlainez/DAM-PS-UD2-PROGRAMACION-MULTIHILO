package practica2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reloj extends JFrame implements Runnable{

private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reloj frame = new Reloj();
					frame.setVisible(true);
					new Reloj();
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	JLabel lblHoras =null;
	Thread hilo;
	public Reloj() {
		
		super();
		this.hilo=new Thread(this,"Hilo horas");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton boton1 = new JButton("Parar");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(DISPOSE_ON_CLOSE);
			}
		});
		boton1.setBounds(166, 227, 89, 23);
		contentPane.add(boton1);
		
		lblHoras = new JLabel("Horas");
		lblHoras.setBounds(166, 111, 89, 49);
		contentPane.add(lblHoras);
		hilo.start();
		
		
		
	}

		
	@Override
	public void run() {
		while(true) {
			lblHoras.setText(LocalTime.now().toString());
			try {
				Thread.sleep(1000);
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
