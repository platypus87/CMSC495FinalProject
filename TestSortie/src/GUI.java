import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    JFrame frame;


    public GUI(){


        frame = new JFrame();
        frame.setBounds(100,100,450,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton addButton = new JButton("Add Record");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new recordGui();
            }
        });
        addButton.setBounds(10,27,110,23);
        frame.getContentPane().add(addButton);

        JButton getButton = new JButton("Coming Soon: Get Record");
        getButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        getButton.setBounds(10,51, 250, 23);
        frame.getContentPane().add(getButton);

        frame.setVisible(true);
    }
}
