import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prueba extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba frame = new Prueba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Prueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOS JUEGOS DEL CHIPIR\u00D3N");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 24));
		lblNewLabel.setBounds(61, 10, 313, 48);
		contentPane.add(lblNewLabel);
		
		JButton btnInicio = new JButton("Comenzar");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instrucciones f = new Instrucciones();
				f.setVisible(true);
			}
		});
		btnInicio.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnInicio.setBounds(127, 85, 182, 92);
		contentPane.add(btnInicio);
	}
}
