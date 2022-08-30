import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class DeviationGUI {
    JFrame frame;
    String deviationReason;

    public String DeviationGUI(){
        frame = new JFrame("ERROR: TIME MISMATCH");
        frame.setBounds(10,10,500,350);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lbldeviation = new JLabel("Please enter reason for time deviation: ");
        lbldeviation.setBounds(15,15,350,25);
        lbldeviation.setFont((new Font("Tahoma", Font.BOLD, 15)));
        frame.getContentPane().add(lbldeviation);

        JTextField txtDeviation = new JTextField("Enter Deviation Reason Here:");
        txtDeviation.setBounds(15,45,350,100);
        txtDeviation.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtDeviation.setText("");

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
        frame.getContentPane().add(txtDeviation);

        JButton btnSubmit = new JButton("SUBMIT");
        btnSubmit.setBounds(125,150,100,45);
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        frame.getContentPane().add(btnSubmit);

        frame.setVisible(true);

        return txtDeviation.getText();
    }
}
