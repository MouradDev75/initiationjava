package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fenetre extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNb1;
	private JTextField txtNb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre frame = new Fenetre();
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
	public Fenetre() {
		setTitle("Fenêtre Principale");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNb1 = new JTextField();
		txtNb1.setBounds(110, 63, 86, 20);
		contentPane.add(txtNb1);
		txtNb1.setColumns(10);
		
		txtNb2 = new JTextField();
		txtNb2.setColumns(10);
		txtNb2.setBounds(276, 63, 86, 20);
		contentPane.add(txtNb2);
		
		JLabel lblNewLabel = new JLabel("Nombre1:");
		lblNewLabel.setBounds(39, 66, 61, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre2:");
		lblNewLabel_1.setBounds(206, 66, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnAjouter = new JButton("Additioner");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double nb1 = Double.parseDouble(txtNb1.getText());
				double nb2 = Double.parseDouble(txtNb2.getText());
				double somme = nb1 + nb2;
				JOptionPane.showMessageDialog(null, "Somme = "+somme);
			}
		});
		btnAjouter.setBounds(206, 117, 89, 23);
		contentPane.add(btnAjouter);

	}
}
