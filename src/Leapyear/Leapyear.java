package Leapyear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Leapyear extends JFrame {
    private JTextField tfYear;
    private JPanel jpanel;
    private JButton btnCheckYear;


    public Leapyear(){

        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int num = Integer.parseInt(tfYear.getText());

                if((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0))
                    JOptionPane.showMessageDialog(Leapyear.this, "Leap year");
                else {
                    JOptionPane.showMessageDialog(Leapyear.this, "Not a leap year");
                }


            }
        });
    }

    public static void main(String[] args) {
        Leapyear app = new Leapyear();
        app.setContentPane(app.jpanel);
        JButton btn = new JButton("HIEFS");
        app.setSize(1000, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
