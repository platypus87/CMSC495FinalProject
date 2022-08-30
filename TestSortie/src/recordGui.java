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
        txtTailNumber.setBounds(111,10,100,25);
        txtTailNumber.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                txtTailNumber.setText("");
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

        txtLineNumber = new JTextField("Enter 3-digit number");
        txtLineNumber.setBounds(111, 40, 100, 25);
        txtLineNumber.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                txtLineNumber.setText("");
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


        frame.setVisible(true);

        JButton addRecord = new JButton("Add Record");
        addRecord.setBounds(300,200, 75, 25);
        frame.getContentPane().add(addRecord);
        addRecord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //change to write to a file

                File file = new File("/Users/amnwh/source/repos/Sortie.txt");
                Sortie sortie = new Sortie();
                sortie.tailNumber = txtTailNumber.getText();
                sortie.lineNumber = Integer.parseInt(txtLineNumber.getText());
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
