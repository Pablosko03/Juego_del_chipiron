import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prueba1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba1 frame = new Prueba1();
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
	public Prueba1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PRUEBA 1: ESCONDITE XTREM");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 24));
		lblNewLabel.setBounds(279, 10, 349, 39);
		contentPane.add(lblNewLabel);
		
		JButton btnEsc2 = new JButton("\u00A1Esc\u00F3ndete aqu\u00ED!");
		btnEsc2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int esc=2, buscar;
				buscar= encontrar();
				if (esc==buscar) {
					morir();
				}else {
					
				}
			}
		});
		btnEsc2.setBounds(44, 287, 114, 21);
		contentPane.add(btnEsc2);
		
		JButton btnEsc3 = new JButton("\u00A1Esc\u00F3ndete aqu\u00ED!");
		btnEsc3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int esc=3, buscar;
				buscar= encontrar();
				if (esc==buscar) {
					morir();
				}else {
					
				}
			}
		});
		btnEsc3.setBounds(383, 209, 114, 21);
		contentPane.add(btnEsc3);
		
		JButton btnEsc1 = new JButton("\u00A1Esc\u00F3ndete aqu\u00ED!");
		btnEsc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int esc=1, buscar;
				buscar= encontrar();
				if (esc==buscar) {
					morir();
				}else {
					
				}
			}
		});
		btnEsc1.setBounds(738, 342, 114, 21);
		contentPane.add(btnEsc1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\itzul\\git\\Juego_del_chipiron\\Imagenes\\escondite.jpg"));
		lblNewLabel_1.setBounds(-144, 59, 1065, 543);
		contentPane.add(lblNewLabel_1);
	}

	public int encontrar () {
		int escondite= (int)(1+Math.random()*3);
		return escondite;
	}
	
	public void morir () {
		
	}
}
