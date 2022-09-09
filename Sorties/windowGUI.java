package Sorties;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

public class WindowGUI {

	JFrame frmSortiePlanner;
	private JTextField txtdigitLine;
	private JTextField txtAcftTailNumber;
	private JTextField txtSchTakeoff;
	private JTextField txtSchLanding;
	private JTextField txtDestination;
	private JTextField txtCrewSize;
	private JTextField txtActualTakeoff;
	private JTextField txtActualLanding;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowGUI window = new WindowGUI();
					window.frmSortiePlanner.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSortiePlanner = new JFrame();
		frmSortiePlanner.setTitle("Sortie Planner");
		frmSortiePlanner.setBounds(100, 100, 600, 500);
		frmSortiePlanner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSortiePlanner.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("");
		frmSortiePlanner.getContentPane().add(tabbedPane);

		JPanel panelAdd = new JPanel();
		tabbedPane.addTab("Add Sortie", null, panelAdd, null);
		panelAdd.setLayout(null);

		JLabel lblCreateLine = new JLabel("Create Line:");
		lblCreateLine.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCreateLine.setBounds(6, 49, 133, 16);
		panelAdd.add(lblCreateLine);

		JLabel lblTailNo = new JLabel("Tail Number:");
		lblTailNo.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTailNo.setBounds(6, 77, 133, 16);
		panelAdd.add(lblTailNo);

		JLabel lblSchTakeoff = new JLabel("Scheduled Takeoff:");
		lblSchTakeoff.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSchTakeoff.setBounds(6, 105, 133, 16);
		panelAdd.add(lblSchTakeoff);

		JLabel lblSchLanding = new JLabel("Scheduled Landing:");
		lblSchLanding.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSchLanding.setBounds(6, 133, 133, 16);
		panelAdd.add(lblSchLanding);

		JLabel lblDestination = new JLabel("Destination:");
		lblDestination.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDestination.setBounds(6, 161, 133, 16);
		panelAdd.add(lblDestination);

		JLabel lblCrewSize = new JLabel("Crew Size:");
		lblCrewSize.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCrewSize.setBounds(6, 189, 133, 16);
		panelAdd.add(lblCrewSize);

		JLabel lblActualTakeoff = new JLabel("Actual Takeoff:");
		lblActualTakeoff.setHorizontalAlignment(SwingConstants.TRAILING);
		lblActualTakeoff.setBounds(6, 217, 133, 16);
		panelAdd.add(lblActualTakeoff);

		txtdigitLine = new JTextField();
		txtdigitLine.setToolTipText("A 3-digit number that represents the aircraft line.");
		txtdigitLine.setText("3-Digit Line");
		txtdigitLine.setBounds(151, 44, 130, 26);
		panelAdd.add(txtdigitLine);
		txtdigitLine.setColumns(10);

		txtAcftTailNumber = new JTextField();
		txtAcftTailNumber.setToolTipText("The tail number of the aircraft.");
		txtAcftTailNumber.setText("Acft Tail Number");
		txtAcftTailNumber.setColumns(10);
		txtAcftTailNumber.setBounds(151, 72, 130, 26);
		panelAdd.add(txtAcftTailNumber);

		txtSchTakeoff = new JTextField();
		txtSchTakeoff.setToolTipText(
				"The expected takeoff time of the aircraft in the format YYDDD HHMM.\nYY = Last two digits of the year\nDDD = Julian date\nHHMM = Local time, 24-hour format");
		txtSchTakeoff.setText("YYDDD HHMM");
		txtSchTakeoff.setColumns(10);
		txtSchTakeoff.setBounds(151, 100, 130, 26);
		panelAdd.add(txtSchTakeoff);

		txtSchLanding = new JTextField();
		txtSchLanding.setToolTipText(
				"The expected landing time of the aircraft in the format YYDDD HHMM.\nYY = Last two digits of the year\nDDD = Julian date\nHHMM = Local time, 24-hour format");
		txtSchLanding.setText("YYDDD HHMM");
		txtSchLanding.setColumns(10);
		txtSchLanding.setBounds(151, 128, 130, 26);
		panelAdd.add(txtSchLanding);

		txtDestination = new JTextField();
		txtDestination.setToolTipText("Destination airport code e.g. LAX, PDX, LON");
		txtDestination.setText("Landing Location");
		txtDestination.setColumns(10);
		txtDestination.setBounds(151, 156, 130, 26);
		panelAdd.add(txtDestination);

		txtCrewSize = new JTextField();
		txtCrewSize.setToolTipText("The number of people manning the flight.");
		txtCrewSize.setText("# People on Flight");
		txtCrewSize.setColumns(10);
		txtCrewSize.setBounds(151, 184, 130, 26);
		panelAdd.add(txtCrewSize);

		JLabel lblActualLanding = new JLabel("Actual Landing:");
		lblActualLanding.setHorizontalAlignment(SwingConstants.TRAILING);
		lblActualLanding.setBounds(6, 245, 133, 16);
		panelAdd.add(lblActualLanding);

		txtActualTakeoff = new JTextField();
		txtActualTakeoff.setToolTipText(
				"The actual takeoff time of the aircraft in the format YYDDD HHMM.\nLeave blank if not yet known - times can be finalized later.\nYY = Last two digits of the year\nDDD = Julian date\nHHMM = Local time, 24-hour format");
		txtActualTakeoff.setText("Blank if unknown");
		txtActualTakeoff.setColumns(10);
		txtActualTakeoff.setBounds(151, 212, 130, 26);
		panelAdd.add(txtActualTakeoff);

		txtActualLanding = new JTextField();
		txtActualLanding.setToolTipText(
				"The actual landing time of the aircraft in the format YYDDD HHMM.\nLeave blank if not yet known - times can be finalized later.\nYY = Last two digits of the year\nDDD = Julian date\nHHMM = Local time, 24-hour format");
		txtActualLanding.setText("Blank if unknown");
		txtActualLanding.setColumns(10);
		txtActualLanding.setBounds(151, 240, 130, 26);
		panelAdd.add(txtActualLanding);

		JButton btnClear = new JButton("Clear All Fields");
		btnClear.setBounds(293, 391, 138, 29);
		panelAdd.add(btnClear);

		JButton btnSaveSortie = new JButton("Save Sortie");
		btnSaveSortie.setBounds(143, 391, 138, 29);
		panelAdd.add(btnSaveSortie);

		JLabel lblNewLabel = new JLabel("Add/Plan New Sortie");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel.setBounds(80, 6, 400, 30);
		panelAdd.add(lblNewLabel);

		JTextArea txtrEnterDescriptionOf = new JTextArea();
		txtrEnterDescriptionOf.setText("Enter description of aircraft cargo");
		txtrEnterDescriptionOf.setBounds(293, 72, 261, 195);
		panelAdd.add(txtrEnterDescriptionOf);

		JLabel lblNewLabel_1 = new JLabel("Cargo Description:");
		lblNewLabel_1.setBounds(293, 49, 138, 16);
		panelAdd.add(lblNewLabel_1);

		JPanel panelView = new JPanel();
		panelView.setLayout(null);
		tabbedPane.addTab("View Sortie", null, panelView, null);

		JLabel lblCreateLine_1 = new JLabel("Line Number:");
		lblCreateLine_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCreateLine_1.setBounds(6, 187, 133, 16);
		panelView.add(lblCreateLine_1);

		JLabel lblTailNo_1 = new JLabel("Tail Number:");
		lblTailNo_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTailNo_1.setBounds(6, 215, 133, 16);
		panelView.add(lblTailNo_1);

		JLabel lblSchTakeoff_1 = new JLabel("Scheduled Takeoff:");
		lblSchTakeoff_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSchTakeoff_1.setBounds(6, 243, 133, 16);
		panelView.add(lblSchTakeoff_1);

		JLabel lblSchLanding_1 = new JLabel("Scheduled Landing:");
		lblSchLanding_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSchLanding_1.setBounds(6, 271, 133, 16);
		panelView.add(lblSchLanding_1);

		JLabel lblDestination_1 = new JLabel("Destination:");
		lblDestination_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDestination_1.setBounds(6, 299, 133, 16);
		panelView.add(lblDestination_1);

		JLabel lblCrewSize_1 = new JLabel("Crew Size:");
		lblCrewSize_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCrewSize_1.setBounds(6, 327, 133, 16);
		panelView.add(lblCrewSize_1);

		JLabel lblActualTakeoff_1 = new JLabel("Actual Takeoff:");
		lblActualTakeoff_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblActualTakeoff_1.setBounds(6, 355, 133, 16);
		panelView.add(lblActualTakeoff_1);

		textField = new JTextField();
		textField.setToolTipText("A 3-digit number that represents the aircraft line.");
		textField.setColumns(10);
		textField.setBounds(151, 182, 130, 26);
		panelView.add(textField);

		textField_1 = new JTextField();
		textField_1.setToolTipText("The tail number of the aircraft.");
		textField_1.setColumns(10);
		textField_1.setBounds(151, 210, 130, 26);
		panelView.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setToolTipText(
				"The expected takeoff time of the aircraft in the format YYDDD HHMM.\nYY = Last two digits of the year\nDDD = Julian date\nHHMM = Local time, 24-hour format");
		textField_2.setColumns(10);
		textField_2.setBounds(151, 238, 130, 26);
		panelView.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setToolTipText(
				"The expected landing time of the aircraft in the format YYDDD HHMM.\nYY = Last two digits of the year\nDDD = Julian date\nHHMM = Local time, 24-hour format");
		textField_3.setColumns(10);
		textField_3.setBounds(151, 266, 130, 26);
		panelView.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setToolTipText("Destination airport code e.g. LAX, PDX, LON");
		textField_4.setColumns(10);
		textField_4.setBounds(151, 294, 130, 26);
		panelView.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setToolTipText("The number of people manning the flight.");
		textField_5.setColumns(10);
		textField_5.setBounds(151, 322, 130, 26);
		panelView.add(textField_5);

		JLabel lblActualLanding_1 = new JLabel("Actual Landing:");
		lblActualLanding_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblActualLanding_1.setBounds(6, 383, 133, 16);
		panelView.add(lblActualLanding_1);

		textField_6 = new JTextField();
		textField_6.setToolTipText(
				"The actual takeoff time of the aircraft in the format YYDDD HHMM.\nLeave blank if not yet known - times can be finalized later.\nYY = Last two digits of the year\nDDD = Julian date\nHHMM = Local time, 24-hour format");
		textField_6.setColumns(10);
		textField_6.setBounds(151, 350, 130, 26);
		panelView.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setToolTipText(
				"The actual landing time of the aircraft in the format YYDDD HHMM.\nLeave blank if not yet known - times can be finalized later.\nYY = Last two digits of the year\nDDD = Julian date\nHHMM = Local time, 24-hour format");
		textField_7.setColumns(10);
		textField_7.setBounds(151, 378, 130, 26);
		panelView.add(textField_7);

		JLabel lblTitle = new JLabel("View/Search Existing Sortie");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblTitle.setBounds(80, 6, 400, 30);
		panelView.add(lblTitle);

		JTextArea txtrEnterDescriptionOf_1 = new JTextArea();
		txtrEnterDescriptionOf_1.setBounds(293, 210, 261, 195);
		panelView.add(txtrEnterDescriptionOf_1);

		JLabel lblNewLabel_1_1 = new JLabel("Cargo Description:");
		lblNewLabel_1_1.setBounds(293, 187, 138, 16);
		panelView.add(lblNewLabel_1_1);

		textField_8 = new JTextField();
		textField_8.setBounds(46, 88, 193, 26);
		panelView.add(textField_8);
		textField_8.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("- OR -");
		lblNewLabel_2.setBounds(262, 81, 50, 16);
		panelView.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Enter Text to Search");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(46, 70, 193, 16);
		panelView.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Select a Flight From List:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(339, 70, 184, 16);
		panelView.add(lblNewLabel_4);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(349, 89, 163, 27);
		panelView.add(comboBox);

		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(87, 114, 117, 29);
		panelView.add(btnNewButton);

		JPanel panelFinalize = new JPanel();
		tabbedPane.addTab("Finalize Times", null, panelFinalize, null);
		panelFinalize.setLayout(null);

		JLabel lblFinalizeSortieTakeofflanding = new JLabel("Finalize Sortie Takeoff/Landing Times");
		lblFinalizeSortieTakeofflanding.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinalizeSortieTakeofflanding.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblFinalizeSortieTakeofflanding.setBounds(103, 6, 400, 30);
		panelFinalize.add(lblFinalizeSortieTakeofflanding);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(201, 67, 163, 27);
		panelFinalize.add(comboBox_1);

		JLabel lblNewLabel_4_1 = new JLabel("Select a Flight From List:");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(191, 48, 184, 16);
		panelFinalize.add(lblNewLabel_4_1);

		JLabel lblSchTakeoff_1_1 = new JLabel("Scheduled Takeoff:");
		lblSchTakeoff_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSchTakeoff_1_1.setBounds(6, 169, 133, 16);
		panelFinalize.add(lblSchTakeoff_1_1);

		textField_11 = new JTextField();
		textField_11.setToolTipText(
				"The expected takeoff time of the aircraft in the format YYDDD HHMM.\nYY = Last two digits of the year\nDDD = Julian date\nHHMM = Local time, 24-hour format");
		textField_11.setColumns(10);
		textField_11.setBounds(151, 164, 130, 26);
		panelFinalize.add(textField_11);

		JLabel lblSchLanding_1_1 = new JLabel("Scheduled Landing:");
		lblSchLanding_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSchLanding_1_1.setBounds(298, 169, 133, 16);
		panelFinalize.add(lblSchLanding_1_1);

		textField_12 = new JTextField();
		textField_12.setToolTipText(
				"The expected landing time of the aircraft in the format YYDDD HHMM.\nYY = Last two digits of the year\nDDD = Julian date\nHHMM = Local time, 24-hour format");
		textField_12.setColumns(10);
		textField_12.setBounds(443, 164, 130, 26);
		panelFinalize.add(textField_12);

		JLabel lblActualTakeoff_1_1 = new JLabel("Actual Takeoff:");
		lblActualTakeoff_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblActualTakeoff_1_1.setBounds(6, 202, 133, 16);
		panelFinalize.add(lblActualTakeoff_1_1);

		textField_13 = new JTextField();
		textField_13.setToolTipText(
				"The actual takeoff time of the aircraft in the format YYDDD HHMM.\nLeave blank if not yet known - times can be finalized later.\nYY = Last two digits of the year\nDDD = Julian date\nHHMM = Local time, 24-hour format");
		textField_13.setColumns(10);
		textField_13.setBounds(151, 197, 130, 26);
		panelFinalize.add(textField_13);

		JLabel lblActualLanding_1_1 = new JLabel("Actual Landing:");
		lblActualLanding_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblActualLanding_1_1.setBounds(298, 202, 133, 16);
		panelFinalize.add(lblActualLanding_1_1);

		textField_14 = new JTextField();
		textField_14.setToolTipText(
				"The actual landing time of the aircraft in the format YYDDD HHMM.\nLeave blank if not yet known - times can be finalized later.\nYY = Last two digits of the year\nDDD = Julian date\nHHMM = Local time, 24-hour format");
		textField_14.setColumns(10);
		textField_14.setBounds(443, 197, 130, 26);
		panelFinalize.add(textField_14);

		JLabel lblActualTakeoff_1_1_1 = new JLabel("Takeoff Discrepancy:");
		lblActualTakeoff_1_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblActualTakeoff_1_1_1.setBounds(6, 235, 133, 16);
		panelFinalize.add(lblActualTakeoff_1_1_1);

		textField_15 = new JTextField();
		textField_15.setToolTipText("The difference in time between scheduled and actual takeoff.");
		textField_15.setColumns(10);
		textField_15.setBounds(151, 230, 130, 26);
		panelFinalize.add(textField_15);

		JLabel lblActualTakeoff_1_1_1_1 = new JLabel("Landing Discrepancy:");
		lblActualTakeoff_1_1_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblActualTakeoff_1_1_1_1.setBounds(281, 235, 150, 16);
		panelFinalize.add(lblActualTakeoff_1_1_1_1);

		textField_16 = new JTextField();
		textField_16.setToolTipText("The difference in time between scheduled and actual landing.");
		textField_16.setColumns(10);
		textField_16.setBounds(443, 230, 130, 26);
		panelFinalize.add(textField_16);

		JLabel lblActualTakeoff_1_1_1_2 = new JLabel("Reason for takeoff discrepancy:");
		lblActualTakeoff_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblActualTakeoff_1_1_1_2.setBounds(6, 263, 275, 16);
		panelFinalize.add(lblActualTakeoff_1_1_1_2);

		JTextPane textPane = new JTextPane();
		textPane.setToolTipText(
				"If a discrepancy of greater than 30 minutes exists, a short explanation for time discrepancy is required.");
		textPane.setBounds(6, 280, 275, 94);
		panelFinalize.add(textPane);

		JTextPane textPane_1 = new JTextPane();
		textPane_1.setToolTipText(
				"If a discrepancy of greater than 30 minutes exists, a short explanation for time discrepancy is required.");
		textPane_1.setBounds(298, 280, 275, 94);
		panelFinalize.add(textPane_1);

		JLabel lblActualTakeoff_1_1_1_2_1 = new JLabel("Reason for landing discrepancy:");
		lblActualTakeoff_1_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblActualTakeoff_1_1_1_2_1.setBounds(298, 263, 275, 16);
		panelFinalize.add(lblActualTakeoff_1_1_1_2_1);
	}
}
