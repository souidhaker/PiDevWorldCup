package worldCup.group4.clientProject.GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import tn.edu.esprit.piDevProject.worldCup.domain.Actuality;
import tn.edu.esprit.piDevProject.worldCup.domain.Interview;
import worldCup.group4.clientProject.deligate.ActualityServiceDeligate;
import worldCup.group4.clientProject.deligate.InterviewServiceDelegate;

public class AddActuality extends JFrame {

	private JPanel contentPane;
	private JTextField ActualityTittle;
	private JTextField ActualityDate;
	private JTextField InterviewdPlayer;
	private JTextField NewsDescription;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddActuality frame = new AddActuality();
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
	public AddActuality() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAddActuality = new JLabel("Add Actuality");
		lblAddActuality
				.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblAddActuality.setBounds(158, 24, 103, 14);
		contentPane.add(lblAddActuality);

		JLabel lblNewLabel = new JLabel("Actuality's tittle");
		lblNewLabel.setBounds(27, 63, 89, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Actuality's date");
		lblNewLabel_1.setBounds(27, 94, 89, 14);
		contentPane.add(lblNewLabel_1);

		ActualityTittle = new JTextField();
		ActualityTittle.setBounds(126, 60, 135, 20);
		contentPane.add(ActualityTittle);
		ActualityTittle.setColumns(10);

		ActualityDate = new JTextField();
		ActualityDate.setBounds(126, 91, 135, 20);
		contentPane.add(ActualityDate);
		ActualityDate.setColumns(10);

		
		

		final JRadioButton rdbtnNewRadioButton = new JRadioButton("Interview");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.out.println("nzelna1");
					InterviewdPlayer.setEditable(true);
					NewsDescription.setEditable(false);
			}
		});
		rdbtnNewRadioButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				if(rdbtnNewRadioButton.isSelected())
				{
					
				}			
				
			}
		});
		rdbtnNewRadioButton.setBounds(41, 146, 109, 23);
		contentPane.add(rdbtnNewRadioButton);

		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("News");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InterviewdPlayer.setEditable(false);
				NewsDescription.setEditable(true);
				
			}
		});
		rdbtnNewRadioButton_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				
			}
		});
		rdbtnNewRadioButton_1.setBounds(41, 192, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected() || rdbtnNewRadioButton_1.isSelected())
				{
					
				String actualityDate;
				String actualityTittle;
				String intereviewedPlayer;
				String newsDescription;
				
				
				actualityTittle = ActualityTittle.getText();
				actualityDate = ActualityDate.getText();

				Actuality actuality = new Actuality(actualityTittle,
						actualityDate);
				ActualityServiceDeligate delegate = null;
				
				delegate.createActuality(actuality);
				
				intereviewedPlayer=InterviewdPlayer.getText();
				Interview interview=new Interview(intereviewedPlayer);
				InterviewServiceDelegate delegate1=null;
				delegate1.createInterview(interview);
				}
				else
				{
				JOptionPane.showMessageDialog(null, "Veuillez se");

				}
				
			}
		});
		
		btnNewButton.setBounds(335, 228, 89, 23);
		contentPane.add(btnNewButton);
		
		InterviewdPlayer = new JTextField();
		InterviewdPlayer.setEditable(false);
		InterviewdPlayer.setBounds(198, 147, 120, 20);
		contentPane.add(InterviewdPlayer);
		InterviewdPlayer.setColumns(10);
		
		NewsDescription = new JTextField();
		NewsDescription.setEditable(false);
		NewsDescription.setBounds(198, 193, 120, 40);
		contentPane.add(NewsDescription);
		NewsDescription.setColumns(10);
		
		JLabel lblInterviewdPlayer = new JLabel("Interviewd Player");
		lblInterviewdPlayer.setBounds(211, 122, 94, 14);
		contentPane.add(lblInterviewdPlayer);
		
		JLabel lblNewsDescription = new JLabel("News Description");
		lblNewsDescription.setBounds(208, 178, 83, 14);
		contentPane.add(lblNewsDescription);
	}

}
