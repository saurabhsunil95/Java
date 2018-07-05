import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;

public class frmMain extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField type;
	private JTextField distance;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMain frame = new frmMain();
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
	public frmMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(130, 80, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSource = new JLabel("Source");
		lblSource.setBounds(55, 39, 46, 14);
		contentPane.add(lblSource);
		
		JLabel lblJourneyPlan = new JLabel("Journey Plan");
		lblJourneyPlan.setBounds(160, 11, 94, 14);
		contentPane.add(lblJourneyPlan);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setBounds(65, 70, 74, 14);
		contentPane.add(lblDestination);
		
		JLabel lblTypeOfRoad = new JLabel("Type of Road");
		lblTypeOfRoad.setBounds(55, 120, 74, 14);
		contentPane.add(lblTypeOfRoad);
		
		JLabel lblCost = new JLabel("Cost");
		lblCost.setBounds(55, 185, 46, 14);
		contentPane.add(lblCost);
		
		JLabel lblDistance = new JLabel("Distance");
		lblDistance.setBounds(55, 151, 74, 14);
		contentPane.add(lblDistance);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				distance.setText("");
				type.setText("");
				answer.setText("");
			}
		});
		btnReset.setBounds(40, 227, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnCost = new JButton("Cost");
		btnCost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int c,t,d;
					t=Integer.parseInt(type.getText());
					d=Integer.parseInt(distance.getText());
					if(t==1) {
						c=d*5;
						answer.setText(Integer.toString(c));
					}
					else if(t==2) {
						c=d*12;
						answer.setText(Integer.toString(c));
					}
					else if(t==3) {
						c=d*8;
						answer.setText(Integer.toString(c));
					}
					else answer.setText("Invalid Type");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please fill the above field");
				}
				
				
				

				
			}
		});
		btnCost.setBounds(186, 227, 89, 23);
		contentPane.add(btnCost);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(322, 227, 89, 23);
		contentPane.add(btnClose);
		
		textField = new JTextField();
		textField.setBounds(208, 36, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(208, 67, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		type = new JTextField();
		type.setBounds(208, 117, 86, 20);
		contentPane.add(type);
		type.setColumns(10);
		
		distance = new JTextField();
		distance.setBounds(208, 148, 86, 20);
		contentPane.add(distance);
		distance.setColumns(10);
		
		JLabel lblTypseplainRoad = new JLabel("Typse:: 1-Plain Road, 2-Hill Road, 3-Mixed Road");
		lblTypseplainRoad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTypseplainRoad.setBounds(55, 95, 334, 14);
		contentPane.add(lblTypseplainRoad);
		
		answer = new JLabel("");
		answer.setBounds(208, 185, 89, 23);
		contentPane.add(answer);
	}
	private JLabel answer;
}
