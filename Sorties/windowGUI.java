package Sorties;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class windowGUI {

	JFrame frame;
	private JTextField txtTailNoXxxx;
	private JTextField txtYokotaAb;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowGUI window = new windowGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public windowGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.BLUE);
		comboBox.setBounds(211, 8, 106, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Flight 1", "Flight 2", "Flight 3"}));
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Select Sortie: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(91, 8, 101, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(103, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(211, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Flight Identifier:");
		lblNewLabel_1.setBounds(10, 39, 106, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Destination:");
		lblNewLabel_1_1.setBounds(10, 64, 106, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Departure Time:");
		lblNewLabel_1_2.setBounds(10, 89, 106, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Arrival Time:");
		lblNewLabel_1_3.setBounds(10, 114, 106, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Crew Size:");
		lblNewLabel_1_4.setBounds(10, 139, 106, 14);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Etc.");
		lblNewLabel_1_5.setBounds(10, 164, 106, 14);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Etc.");
		lblNewLabel_1_6.setBounds(10, 189, 106, 14);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		txtTailNoXxxx = new JTextField();
		txtTailNoXxxx.setText("Tail No. xxxx");
		txtTailNoXxxx.setBounds(106, 39, 86, 20);
		frame.getContentPane().add(txtTailNoXxxx);
		txtTailNoXxxx.setColumns(10);
		
		txtYokotaAb = new JTextField();
		txtYokotaAb.setText("Yokota AB");
		txtYokotaAb.setColumns(10);
		txtYokotaAb.setBounds(106, 64, 86, 20);
		frame.getContentPane().add(txtYokotaAb);
		
		textField_2 = new JTextField();
		textField_2.setText("20220823 1950");
		textField_2.setColumns(10);
		textField_2.setBounds(106, 89, 86, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("20220824 0430");
		textField_3.setColumns(10);
		textField_3.setBounds(106, 114, 86, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("6");
		textField_4.setColumns(10);
		textField_4.setBounds(106, 139, 86, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(106, 164, 86, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(106, 189, 86, 20);
		frame.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Detailed Description of Cargo:");
		lblNewLabel_1_1_1.setBounds(202, 45, 222, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JTextArea txtrDieselGeneratorx = new JTextArea();
		txtrDieselGeneratorx.setText("Diesel Generator, 3x\r\n\tWt. 14550 lbs\r\nDry Food Goods\r\n\tWt. 700 lbs\r\nEtc\r\nEtc");
		txtrDieselGeneratorx.setBounds(202, 59, 196, 150);
		frame.getContentPane().add(txtrDieselGeneratorx);
	}
}
