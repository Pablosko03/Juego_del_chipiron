import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Instrucciones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instrucciones frame = new Instrucciones();
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
	public Instrucciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("INSTRUCCIONES");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 24));
		lblNewLabel_1.setBounds(123, 10, 189, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Los juegos que tendr\u00E1s que superar ser\u00E1n los siguientes:");
		lblNewLabel.setBounds(90, 67, 390, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("1.- Escondite Xtrem");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(145, 90, 132, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2.- Ruleta Ucraniana");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBounds(145, 113, 132, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("3.- Ahorcado el que tengo aqu\u00ED colg...");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(145, 136, 204, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("4.- Operaci\u00F3n Hardcore 360\u00BA Backflip");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBounds(145, 159, 217, 13);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Continuar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prueba1 prueba1 = new Prueba1();
				prueba1.setVisible(true);
			}
		});
		btnNewButton.setBounds(158, 195, 119, 38);
		contentPane.add(btnNewButton);
	}
}
