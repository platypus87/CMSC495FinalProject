package Sorties;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

public class WindowGUI {

	JFrame frmSortiePlanner;
	private JTextField txtDigitLine;
	private JTextField txtAcftTailNumber;
	private JTextField txtSchTakeoff;
	private JTextField txtSchLanding;
	private JTextField txtDestination;
	private JTextField txtCrewSize;
	private JTextField txtActualTakeoff;
	private JTextField txtActualLanding;
	private JTextField txtLineNo_1;
	private JTextField txtTailNo_1;
	private JTextField txtSchTakeoff_1;
	private JTextField txtSchLanding_1;
	private JTextField txtDestination_1;
	private JTextField txtCrewSize_1;
	private JTextField txtActualTakeoff_1;
	private JTextField txtActualLanding_1;
	private JTextField txtSearch;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	private String errorMessage;
	private DataHandler d = new DataHandler();

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

		txtDigitLine = new JTextField();
		txtDigitLine.setToolTipText("A 3-digit number that represents the aircraft line.");
		txtDigitLine.setText("3-Digit Line");
		txtDigitLine.setBounds(151, 44, 130, 26);
		panelAdd.add(txtDigitLine);
		txtDigitLine.setColumns(10);

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

		JLabel lblTabTitle = new JLabel("Add/Plan New Sortie");
		lblTabTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTabTitle.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblTabTitle.setBounds(80, 6, 400, 30);
		panelAdd.add(lblTabTitle);

		JTextArea txtAdditionalInfo = new JTextArea();
		txtAdditionalInfo.setToolTipText("Enter any additional information about sortie here");
		txtAdditionalInfo.setBounds(293, 72, 261, 195);
		panelAdd.add(txtAdditionalInfo);

		JLabel lblInfoBox = new JLabel("Additional Information:");
		lblInfoBox.setBounds(293, 49, 210, 16);
		panelAdd.add(lblInfoBox);

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

		txtLineNo_1 = new JTextField();
		txtLineNo_1.setToolTipText("A 3-digit number that represents the aircraft line.");
		txtLineNo_1.setColumns(10);
		txtLineNo_1.setBounds(151, 182, 130, 26);
		panelView.add(txtLineNo_1);

		txtTailNo_1 = new JTextField();
		txtTailNo_1.setToolTipText("The tail number of the aircraft.");
		txtTailNo_1.setColumns(10);
		txtTailNo_1.setBounds(151, 210, 130, 26);
		panelView.add(txtTailNo_1);

		txtSchTakeoff_1 = new JTextField();
		txtSchTakeoff_1.setToolTipText(
				"The expected takeoff time of the aircraft in the format YYDDD HHMM.\nYY = Last two digits of the year\nDDD = Julian date\nHHMM = Local time, 24-hour format");
		txtSchTakeoff_1.setColumns(10);
		txtSchTakeoff_1.setBounds(151, 238, 130, 26);
		panelView.add(txtSchTakeoff_1);

		txtSchLanding_1 = new JTextField();
		txtSchLanding_1.setToolTipText(
				"The expected landing time of the aircraft in the format YYDDD HHMM.\nYY = Last two digits of the year\nDDD = Julian date\nHHMM = Local time, 24-hour format");
		txtSchLanding_1.setColumns(10);
		txtSchLanding_1.setBounds(151, 266, 130, 26);
		panelView.add(txtSchLanding_1);

		txtDestination_1 = new JTextField();
		txtDestination_1.setToolTipText("Destination airport code e.g. LAX, PDX, LON");
		txtDestination_1.setColumns(10);
		txtDestination_1.setBounds(151, 294, 130, 26);
		panelView.add(txtDestination_1);

		txtCrewSize_1 = new JTextField();
		txtCrewSize_1.setToolTipText("The number of people manning the flight.");
		txtCrewSize_1.setColumns(10);
		txtCrewSize_1.setBounds(151, 322, 130, 26);
		panelView.add(txtCrewSize_1);

		JLabel lblActualLanding_1 = new JLabel("Actual Landing:");
		lblActualLanding_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblActualLanding_1.setBounds(6, 383, 133, 16);
		panelView.add(lblActualLanding_1);

		txtActualTakeoff_1 = new JTextField();
		txtActualTakeoff_1.setToolTipText(
				"The actual takeoff time of the aircraft in the format YYDDD HHMM.\nLeave blank if not yet known - times can be finalized later.\nYY = Last two digits of the year\nDDD = Julian date\nHHMM = Local time, 24-hour format");
		txtActualTakeoff_1.setColumns(10);
		txtActualTakeoff_1.setBounds(151, 350, 130, 26);
		panelView.add(txtActualTakeoff_1);

		txtActualLanding_1 = new JTextField();
		txtActualLanding_1.setToolTipText(
				"The actual landing time of the aircraft in the format YYDDD HHMM.\nLeave blank if not yet known - times can be finalized later.\nYY = Last two digits of the year\nDDD = Julian date\nHHMM = Local time, 24-hour format");
		txtActualLanding_1.setColumns(10);
		txtActualLanding_1.setBounds(151, 378, 130, 26);
		panelView.add(txtActualLanding_1);

		JLabel lblTitle = new JLabel("View/Search Existing Sortie");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblTitle.setBounds(80, 6, 400, 30);
		panelView.add(lblTitle);

		JTextArea txtAdditionalInfo_1 = new JTextArea();
		txtAdditionalInfo_1.setBounds(293, 210, 261, 195);
		panelView.add(txtAdditionalInfo_1);

		JLabel lblAdditionalInfo_1 = new JLabel("Cargo Description:");
		lblAdditionalInfo_1.setBounds(293, 187, 138, 16);
		panelView.add(lblAdditionalInfo_1);

		txtSearch = new JTextField();
		txtSearch.setBounds(46, 88, 193, 26);
		panelView.add(txtSearch);
		txtSearch.setColumns(10);

		JLabel lblOR = new JLabel("- OR -");
		lblOR.setBounds(262, 81, 50, 16);
		panelView.add(lblOR);

		JLabel lblSearchPrompt = new JLabel("Enter Text to Search");
		lblSearchPrompt.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearchPrompt.setBounds(46, 70, 193, 16);
		panelView.add(lblSearchPrompt);

		JLabel lblSelectPrompt = new JLabel("Select a Flight From List:");
		lblSelectPrompt.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectPrompt.setBounds(339, 70, 184, 16);
		panelView.add(lblSelectPrompt);

		JComboBox cBoxSelect = new JComboBox();
		cBoxSelect.setBounds(349, 89, 163, 27);
		panelView.add(cBoxSelect);

		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(87, 114, 117, 29);
		panelView.add(btnSearch);

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

		/********************************************************************************************************************
		 * End Window building portion of class Actual functions fall below here
		 ********************************************************************************************************************
		 */

		// First Tab "Save Sortie" button
		btnSaveSortie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				errorMessage = "<html><body width='%1s'><h1>Sortie Saving Error</h1>"; // Will store error
																						// messages
				/*
				 * If statement checks for bad input types Else block creates sortie object if
				 * input types good
				 * 
				 */
				if ((!checkInt(txtDigitLine.getText()) || !checkDate(txtSchTakeoff.getText())
						|| !checkDate(txtSchLanding.getText()) || !checkDate(txtActualTakeoff.getText())
						|| !checkDate(txtActualLanding.getText()) || !checkInt(txtCrewSize.getText()))) {
					infoBox(errorMessage, "Sortie Save Error");
					System.out.println("Invalid Line");

				} else {
					Sortie i = new Sortie();
					try {
						i.setLine(Integer.parseInt(txtDigitLine.getText()));
						i.setTailNo(txtAcftTailNumber.getText());
						i.setDepTime(Integer.parseInt((txtSchTakeoff.getText()).substring(6, 10)));
						i.setDepDate(Integer.parseInt((txtSchTakeoff.getText()).substring(0, 5)));
						i.setArrTime(Integer.parseInt((txtSchLanding.getText()).substring(6, 10)));
						i.setArrDate(Integer.parseInt((txtSchLanding.getText()).substring(0, 5)));
						i.setDepFinTime(Integer.parseInt((txtActualTakeoff.getText()).substring(6, 10)));
						i.setDepFinDate(Integer.parseInt((txtActualTakeoff.getText()).substring(0, 5)));
						i.setArrFinTime(Integer.parseInt((txtActualLanding.getText()).substring(6, 10)));
						i.setArrFinDate(Integer.parseInt((txtActualLanding.getText()).substring(0, 5)));
						i.setDestination(txtDestination.getText());
						i.setCrewSize(Integer.parseInt(txtCrewSize.getText()));
						i.setNotes(txtAdditionalInfo.getText());
						d.addSortie(i);
						d.printSorties();
					} catch (Exception exc) {
						// Caught a type error thrown by Sortie set method
						infoBox("<html><body width='%1s'><h1>Field Format Error</h1>" + exc.getMessage(),
								"Field Format Error");
					}

				}

			}
		});

		// First Tab "Clear Fields" button
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button works");
				txtDigitLine.setText("");
				txtAcftTailNumber.setText("");
				txtSchTakeoff.setText("");
				txtSchLanding.setText("");
				txtDestination.setText("");
				txtCrewSize.setText("");
				txtActualTakeoff.setText("");
				txtActualLanding.setText("");
				txtAdditionalInfo.setText("");

			}
		});
	}

	// MISC METHODS USED IN SORTIE GENERATION

	// Method to test fields for string
	public boolean checkInt(String testInt) {
		try {
			Integer.parseInt(testInt);
			return true;

		} catch (NumberFormatException nfe) {
			errorMessage = errorMessage + "<p>   ERROR:<br>" + nfe.getMessage() + "<br>Field must be integer<p>";
			return false;
		}
	}

	public boolean checkDate(String testDate) {
		if (testDate.matches("\\d{5} \\d{4}")) {
			return true;
		} else {
			errorMessage = errorMessage + "<p>   ERROR:<br>" + testDate + "<br>Field must be date format YYDDD HHMM<p>";
			return false;
		}
	}

	public static void infoBox(String infoMessage, String titleBar) {
		JOptionPane.showMessageDialog(null, infoMessage, "Info: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
	}
}
