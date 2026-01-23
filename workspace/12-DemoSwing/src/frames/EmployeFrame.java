package frames;

import java.awt.EventQueue;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Employe;
import repositories.EmployeRepository;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeFrame extends JFrame {
	
  private EmployeRepository employeRepository = new EmployeRepository();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTextField txtSalaire;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnAjouter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeFrame frame = new EmployeFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void remplir() {
		String[] colonnes = {"Id", "Nom", "Prénom", "Salaire"};
		
		try {
			
			List<Employe> employes = employeRepository.getAll();
			
			Object[][] lignes = new Object[employes.size()][4];
			for (int i = 0; i < employes.size(); i++) {
				lignes[i][0] = employes.get(i).getId();
				lignes[i][1] = employes.get(i).getNom();
				lignes[i][2] = employes.get(i).getPrenom();
				lignes[i][3] = employes.get(i).getSalaire();
			}
			
			table = new JTable(lignes, colonnes);
			
			scrollPane.setViewportView(table);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void reset() {
		txtId.setText("");
		txtNom.setText("");
		txtPrenom.setText("");
		txtSalaire.setText("");
		btnAjouter.setText("Ajouter");
		
	}
	
	/**
	 * Create the frame.
	 */
	public EmployeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 553);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(77, 61, 372, 313);
		contentPane.add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 22, 320, 223);
		panel.add(scrollPane);
		
		JButton btnSuppimer = new JButton("Supprimer");
		btnSuppimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ligne = table.getSelectedRow();
				int id = Integer.parseInt(table.getModel().getValueAt(ligne, 0).toString());
				try {
					employeRepository.delete(id);
					remplir();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnSuppimer.setBounds(45, 266, 106, 23);
		panel.add(btnSuppimer);
		
		JButton btnEditer = new JButton("Editer");
		btnEditer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ligne = table.getSelectedRow();
				int id = Integer.parseInt(table.getModel().getValueAt(ligne, 0).toString());
				String nom = table.getModel().getValueAt(ligne, 1).toString();
				String prenom = table.getModel().getValueAt(ligne, 2).toString();
				double salaire = Double.parseDouble(table.getModel().getValueAt(ligne, 3).toString());
				
				txtId.setText(String.valueOf(id));
				txtNom.setText(nom);
				txtPrenom.setText(prenom);
				txtSalaire.setText(String.valueOf(salaire));
				
				btnAjouter.setText("Modifier");
			
			
			}
		});
		btnEditer.setBounds(224, 266, 89, 23);
		panel.add(btnEditer);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(498, 61, 372, 313);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtId = new JTextField();
		txtId.setEnabled(false);
		txtId.setBounds(218, 53, 86, 20);
		panel_1.add(txtId);
		txtId.setColumns(10);
		
		txtNom = new JTextField();
		txtNom.setColumns(10);
		txtNom.setBounds(218, 98, 86, 20);
		panel_1.add(txtNom);
		
		txtPrenom = new JTextField();
		txtPrenom.setColumns(10);
		txtPrenom.setBounds(218, 145, 86, 20);
		panel_1.add(txtPrenom);
		
		txtSalaire = new JTextField();
		txtSalaire.setColumns(10);
		txtSalaire.setBounds(218, 192, 86, 20);
		panel_1.add(txtSalaire);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(134, 56, 46, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNom = new JLabel("Nom:");
		lblNom.setBounds(134, 101, 46, 14);
		panel_1.add(lblNom);
		
		JLabel lblPrnom = new JLabel("Prénom:");
		lblPrnom.setBounds(134, 148, 58, 14);
		panel_1.add(lblPrnom);
		
		JLabel lblSalaire = new JLabel("Salaire:");
		lblSalaire.setBounds(134, 195, 58, 14);
		panel_1.add(lblSalaire);
		
		btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employe emp = new Employe(0, txtNom.getText(), txtPrenom.getText(), Double.parseDouble(txtSalaire.getText()));
				
				try {
					if(btnAjouter.getText().equals("Ajouter")) {
						employeRepository.insert(emp);
					}else {
						emp.setId(Integer.parseInt(txtId.getText()));
						employeRepository.update(emp);
					}
					
					reset();
					remplir(); //actualiser la table
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAjouter.setBounds(218, 255, 89, 23);
		panel_1.add(btnAjouter);
		
		remplir();

	}
}
