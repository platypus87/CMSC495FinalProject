import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;

public class recordGui {
    JFrame frame;
    JTextField txtTailNumber, txtLineNumber, txtSchedArrival, txtActualArrival, txtSchedDeparture, txtActualDeparture;

    public recordGui(){initialize();}

    private void initialize(){
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblTailNumber = new JLabel("Tail Number: ");
        lblTailNumber.setFont((new Font("Tahoma", Font.BOLD, 13)));
        lblTailNumber.setBounds(10, 10,100,25);
        frame.getContentPane().add(lblTailNumber);

        txtTailNumber = new JTextField("eg A012");
        txtTailNumber.setBounds(175,10,100,25);
        txtTailNumber.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtTailNumber.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        frame.getContentPane().add(txtTailNumber);

        JLabel lblLineNumber = new JLabel("Line No.: ");
        lblLineNumber.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblLineNumber.setBounds(10, 40, 100, 25);
        frame.getContentPane().add(lblLineNumber);

        txtLineNumber = new JTextField("3-digit number");
        txtLineNumber.setBounds(175, 40, 100, 25);
        txtLineNumber.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtLineNumber.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        frame.getContentPane().add(txtLineNumber);

        JLabel lblSchedDepart = new JLabel("Scheduled Departure: ");
        lblSchedDepart.setFont((new Font("Tahoma", Font.BOLD, 13)));
        lblSchedDepart.setBounds(10, 70,165,25);
        frame.getContentPane().add(lblSchedDepart);

        txtSchedDeparture = new JTextField("Julian Date/Time");
        txtSchedDeparture.setBounds(175,70,100,25);
        txtSchedDeparture.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtSchedDeparture.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        frame.getContentPane().add(txtSchedDeparture);

        JLabel lblActualDepart = new JLabel("Actual Departure: ");
        lblActualDepart.setFont((new Font("Tahoma", Font.BOLD, 13)));
        lblActualDepart.setBounds(10, 100,165,25);
        frame.getContentPane().add(lblActualDepart);

        txtActualDeparture = new JTextField("Julian Date/Time");
        txtActualDeparture.setBounds(175,100,100,25);
        txtActualDeparture.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtActualDeparture.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        frame.getContentPane().add(txtActualDeparture);

        JLabel lblSchedArrival = new JLabel("Scheduled Arrival: ");
        lblSchedArrival.setFont((new Font("Tahoma", Font.BOLD, 13)));
        lblSchedArrival.setBounds(10, 130,165,25);
        frame.getContentPane().add(lblSchedArrival);

        txtSchedArrival = new JTextField("Julian Date/Time");
        txtSchedArrival.setBounds(175,130,100,25);
        txtSchedArrival.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtSchedArrival.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        frame.getContentPane().add(txtSchedArrival);

        JLabel lblActualArrival = new JLabel("Actual Arrival: ");
        lblActualArrival.setFont((new Font("Tahoma", Font.BOLD, 13)));
        lblActualArrival.setBounds(10, 160,165,25);
        frame.getContentPane().add(lblActualArrival);

        txtActualArrival = new JTextField("Julian Date/Time");
        txtActualArrival.setBounds(175,160,100,25);
        txtActualArrival.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtActualArrival.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        frame.getContentPane().add(txtActualArrival);

        frame.setVisible(true);

        JButton addRecord = new JButton("Add Record");
        addRecord.setBounds(300,200, 75, 25);
        frame.getContentPane().add(addRecord);
        addRecord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //change to write to a file
                DeviationGUI devGUI = new DeviationGUI();
                File file = new File("/Users/amnwh/source/repos/platypus87/CMSC495FinalProject/Sortie.txt");
                Sortie sortie = new Sortie(txtTailNumber.getText(),Integer.parseInt(txtLineNumber.getText()),Integer.parseInt(txtSchedDeparture.getText()),Integer.parseInt(txtActualDeparture.getText()),Integer.parseInt(txtSchedArrival.getText()),Integer.parseInt(txtActualArrival.getText()));
                if (sortie.isDeviation()){
                    sortie.deviationReason = devGUI.DeviationGUI();
                }

                FileWriter fr = null;
                try{
                    fr = new FileWriter(file);
                    fr.write(sortie.toString());
                }catch (IOException er){
                    er.printStackTrace();
                }finally {
                    try{
                        fr.close();
                    }catch (IOException err){
                        err.printStackTrace();
                    }
                }
                System.out.println(txtTailNumber.getText());
                System.out.println(txtLineNumber.getText());
                System.out.println(sortie.toString());
                txtTailNumber.setText("");
            }
        });
        //return txtTailNumber.getText();
    }
}
