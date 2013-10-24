package worldCup.group4.clientProject.GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		setForeground(Color.GREEN);
		setTitle("Subscribe Client");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		mail = new JTextField();
		mail.setBounds(132, 77, 138, 24);
		contentPane.add(mail);
		mail.setColumns(10);
		
		name = new JTextField();
		name.setBounds(132, 11, 138, 24);
		contentPane.add(name);
		name.setColumns(10);
		
		lastename = new JTextField();
		lastename.setBounds(132, 46, 138, 24);
		contentPane.add(lastename);
		lastename.setColumns(10);
		
		birthday = new JTextField();
		birthday.setBounds(132, 108, 138, 24);
		contentPane.add(birthday);
		birthday.setColumns(10);
		
		login = new JTextField();
		login.setBounds(132, 139, 138, 24);
		contentPane.add(login);
		login.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(132, 170, 138, 24);
		contentPane.add(password);
		password.setColumns(10);
		
		final JComboBox sexe = new JComboBox();
		sexe.setModel(new DefaultComboBoxModel(new String[] {"Homme", "Femme"}));
		sexe.setBounds(132, 201, 138, 20);
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
				
				
				//mail 
				final String username = "houssembenali90@gmail.com";
				final String password = "coccinel89";
		 
				Properties props = new Properties();
				props.put("mail.smtp.auth", "true");
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.host", "smtp.gmail.com");
				props.put("mail.smtp.port", "587");
		 
				Session session = Session.getInstance(props,
				  new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				  });
		 
				try {
		 
					Message message = new MimeMessage(session);
					message.setFrom(new InternetAddress("houssembenali90@gmail.com"));
					message.setRecipients(Message.RecipientType.TO,
						InternetAddress.parse("houssem.benali@esprit.tn"));
					message.setSubject("subscribe succsessfull");
					message.setText("Dear "+nameparm+" "+lastNameparm+","
						+ "\n\n Thanks for using our application! "
							+"\n your registration information are below !!"
						+"Login :"+loginparm
						+"\n Password"+passwordparm
						+"\n\n For more information contact us on brazil@worldcup.com");
		 
					Transport.send(message);
					JOptionPane.showMessageDialog(contentPane,
							"Thank you for your subscribing in Live World Cup ! \n a mail has sended to you contain your account information  \n  ");
		 
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(contentPane,
							"Error while sending mail!! \n please verify your internet connection !");
				}
				
				

				
			}
		});
		btnSubscribe.setBounds(44, 232, 109, 47);
		contentPane.add(btnSubscribe);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(163, 232, 107, 47);
		contentPane.add(btnNewButton);
	}
}
