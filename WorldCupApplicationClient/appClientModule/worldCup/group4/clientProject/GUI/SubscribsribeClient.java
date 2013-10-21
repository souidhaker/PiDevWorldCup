package worldCup.group4.clientProject.GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import tn.edu.esprit.piDevProject.worldCup.domain.SubscribedClient;
import worldCup.group4.clientProject.deligate.SubscribedClientServiceDelegate;

public class SubscribsribeClient extends JFrame {

	private JPanel contentPane;
	private JTextField mail;
	private JTextField name;
	private JTextField lastename;
	private JTextField birthday;
	private JTextField login;
	private JTextField password;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblSexe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubscribsribeClient frame = new SubscribsribeClient();
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
	public SubscribsribeClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		mail = new JTextField();
		mail.setBounds(132, 77, 86, 20);
		contentPane.add(mail);
		mail.setColumns(10);
		
		name = new JTextField();
		name.setBounds(132, 11, 86, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		lastename = new JTextField();
		lastename.setBounds(132, 46, 86, 20);
		contentPane.add(lastename);
		lastename.setColumns(10);
		
		birthday = new JTextField();
		birthday.setBounds(132, 108, 86, 20);
		contentPane.add(birthday);
		birthday.setColumns(10);
		
		login = new JTextField();
		login.setBounds(132, 139, 86, 20);
		contentPane.add(login);
		login.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(132, 170, 86, 20);
		contentPane.add(password);
		password.setColumns(10);
		
		final JComboBox sexe = new JComboBox();
		sexe.setModel(new DefaultComboBoxModel(new String[] {"Homme", "Femme"}));
		sexe.setBounds(132, 201, 62, 20);
		contentPane.add(sexe);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(46, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Laste Name");
		lblNewLabel_1.setBounds(46, 49, 76, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(46, 80, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Birthday");
		lblNewLabel_3.setBounds(46, 111, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("login");
		lblNewLabel_4.setBounds(46, 142, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("password");
		lblNewLabel_5.setBounds(46, 173, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		lblSexe = new JLabel("Sexe");
		lblSexe.setBounds(46, 204, 46, 14);
		contentPane.add(lblSexe);
		
		JButton btnSubscribe = new JButton("Subscribe");
		btnSubscribe.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String mailparm;
				String nameparm;
				String lastNameparm;
				String birthdayparm;
				String loginparm;
				String passwordparm;
				String sexeparm;
				
				mailparm=mail.getText();
				nameparm=name.getText();
				lastNameparm=lastename.getText();
				birthdayparm=birthday.getText();
				loginparm=login.getText();
				passwordparm=password.getText();
				sexeparm=sexe.getSelectedItem().toString();
				SubscribedClient client = new SubscribedClient(nameparm, lastNameparm, mailparm, birthdayparm, sexeparm, loginparm, passwordparm);
				SubscribedClientServiceDelegate delegate = null;
				delegate.createSubscribedClient(client);
				
				

				
			}
		});
		btnSubscribe.setBounds(202, 228, 89, 23);
		contentPane.add(btnSubscribe);
	}
}
