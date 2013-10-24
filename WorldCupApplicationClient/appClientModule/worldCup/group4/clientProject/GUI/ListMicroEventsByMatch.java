package worldCup.group4.clientProject.GUI;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import tn.edu.esprit.piDevProject.worldCup.domain.MicroEvent;
import worldCup.group4.clientProject.deligate.MicroEventServiceDeligate;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListMicroEventsByMatch extends JFrame {

	private JPanel contentPane;
	List<MicroEvent> listEvents = new ArrayList<MicroEvent>();
	private JTable table;
	DefaultTableModel dtm = null;

	private JButton btnDeleteEvent;
	private JButton btnEditEvent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListMicroEventsByMatch frame = new ListMicroEventsByMatch();
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
	public ListMicroEventsByMatch() {
		listEvents = MicroEventServiceDeligate.findAllEvents();
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 66, 320, 178);
		contentPane.add(scrollPane);
		
		table = new JTable();
		 dtm = new DefaultTableModel(
				null,
					new String[] {
						"ID", "Event Name", "Event Type", "Event Time"
					}
				);
		 
		 for (int l = 0; l < listEvents.size(); l++) {
				MicroEvent c = listEvents.get(l);
				String[] nc = new String[] { String.valueOf(c.getIdEvent()),
						c.getNameEvent(), c.getTypeEvent(), c.getTimeEvent()+"",
						 };

				dtm.addRow(nc);
			}
		table.setModel(dtm);
		scrollPane.setViewportView(table);
		
		btnDeleteEvent = new JButton("Delete Event");
		btnDeleteEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int idToDelete = Integer.valueOf((String) table.getModel()
						.getValueAt(table.getSelectedRow(), 0));
				
				if(idToDelete>0)
				{
				MicroEventServiceDeligate.deleteEvent(idToDelete);
				
				listEvents.clear();
				
				listEvents = MicroEventServiceDeligate.findAllEvents();

				dtm = new DefaultTableModel(
						null,
							new String[] {
								"ID", "Event Name", "Event Type", "Event Time"
							}
						);
				 
				 for (int l = 0; l < listEvents.size(); l++) {
						MicroEvent c = listEvents.get(l);
						String[] nc = new String[] { String.valueOf(c.getIdEvent()),
								c.getNameEvent(), c.getTypeEvent(), c.getTimeEvent()+"",
								 };

						dtm.addRow(nc);
					}
				table.setModel(dtm);
				
				JOptionPane.showMessageDialog(null,"Event Deleted Succefully");


				}
				else
				{
					JOptionPane.showMessageDialog(null,"You must select an event to delete");
				}
				
			}
		});
		btnDeleteEvent.setBounds(43, 267, 130, 23);
		contentPane.add(btnDeleteEvent);
		
		btnEditEvent = new JButton("Edit Event");
		btnEditEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int idToEdit = Integer.valueOf((String) table.getModel()
						.getValueAt(table.getSelectedRow(), 0));
				
				if(idToEdit>0)
				{
					EditEvent eventToEdit = new EditEvent(MicroEventServiceDeligate.findEventById(idToEdit));
				    eventToEdit.setVisible(true);
				    
				}
				
			}
		});
		btnEditEvent.setBounds(207, 267, 130, 23);
		contentPane.add(btnEditEvent);
		
		
		

		
	}
}
