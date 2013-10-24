package worldCup.group4.clientProject.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;

import tn.edu.esprit.piDevProject.worldCup.domain.MicroEvent;
import worldCup.group4.clientProject.deligate.MicroEventServiceDeligate;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditEvent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	static MicroEvent event;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditEvent frame = new EditEvent(event);
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
	public EditEvent(final MicroEvent event) {
		
		this.event = event;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(110, 64, 178, 20);
		contentPane.add(textField);
		
		JLabel lblEditMicroEvent = new JLabel("Edit Micro Event");
		lblEditMicroEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditMicroEvent.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEditMicroEvent.setBounds(44, 11, 298, 32);
		contentPane.add(lblEditMicroEvent);
		
		JLabel label_1 = new JLabel("Event Name :");
		label_1.setBounds(20, 67, 76, 14);
		contentPane.add(label_1);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Free Kick", "Penalty", "Off Side"}));
		comboBox.setBounds(110, 109, 145, 20);
		contentPane.add(comboBox);
		
		JLabel label_2 = new JLabel("Event Type :");
		label_2.setBounds(20, 112, 76, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Event Time :");
		label_3.setBounds(24, 155, 76, 14);
		contentPane.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(2);
		textField_1.setBounds(110, 152, 43, 20);
		contentPane.add(textField_1);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MicroEvent event1 = new MicroEvent();
				event1.setIdEvent(event.getIdEvent());
			    event1.setNameEvent(textField.getText());
			    event1.setTypeEvent(comboBox.getSelectedItem().toString());
			    event1.setTimeEvent(Integer.parseInt(textField_1.getText()));
			    
			    MicroEventServiceDeligate.upDateEvent(event1);
			    
			    JOptionPane.showMessageDialog(null, "Micro-Event Updated Succefully");
			}
		});
		btnEdit.setBounds(110, 228, 89, 45);
		contentPane.add(btnEdit);
		
		JButton button_1 = new JButton("Cancel");
		button_1.setBounds(227, 228, 89, 45);
		contentPane.add(button_1);
		
		textField.setText(event.getNameEvent());
		textField_1.setText(event.getTimeEvent()+"");
		comboBox.setSelectedItem(event.getTimeEvent());
	}

}
