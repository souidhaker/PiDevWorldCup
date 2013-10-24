package worldCup.group4.clientProject.GUI;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import tn.edu.esprit.piDevProject.worldCup.domain.MicroEvent;
import tn.edu.esprit.piDevProject.worldCup.services.MicroEventsServicesRemote;
import worldCup.group4.clientProject.deligate.MicroEventServiceDeligate;

public class AddMicroEvent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
    private JComboBox comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMicroEvent frame = new AddMicroEvent();
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
	public AddMicroEvent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(168, 64, 178, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Free Kick", "Penalty","Off Side"}));
		comboBox.setBounds(168, 109, 145, 20);
		contentPane.add(comboBox);
		
		 

		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String type = comboBox.getSelectedItem().toString();
				int time=0;
				try {
					time = Integer.parseInt(textField_2.getText());
					
					MicroEvent event = new MicroEvent(0, name, time, type);
					
   MicroEventServiceDeligate.createMicroEvent(event);					
					JOptionPane.showMessageDialog(contentPane,
							"Micro-Event added successfully");
					
				} 
				
				
				catch (Exception ex) {
					JOptionPane.showMessageDialog(contentPane,
							"You must enter a valid time !");

				}
			 
				
			
			}
		});
		btnNewButton.setBounds(168, 228, 89, 45);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(285, 228, 89, 45);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("Event Name :");
		lblNewLabel.setBounds(78, 67, 76, 14);
		contentPane.add(lblNewLabel);

		JLabel lblEventType = new JLabel("Event Type :");
		lblEventType.setBounds(78, 112, 76, 14);
		contentPane.add(lblEventType);

		JLabel lblEventTime = new JLabel("Event Time :");
		lblEventTime.setBounds(82, 155, 76, 14);
		contentPane.add(lblEventTime);

		JLabel lblAddMicroEvent = new JLabel("Add Micro Event");
		lblAddMicroEvent.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddMicroEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddMicroEvent.setBounds(102, 11, 298, 32);
		contentPane.add(lblAddMicroEvent);

		textField_2 = new JTextField();
		textField_2.setBounds(168, 152, 43, 20);	
		textField_2.setColumns(2);

		contentPane.add(textField_2);
		
	
		
	}
}
