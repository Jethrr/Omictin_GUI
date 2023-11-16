package FOS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FOS extends JFrame {
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JCheckBox cBurger;
    private JRadioButton rb5;
    private JCheckBox cFries;
    private JRadioButton rb10;
    private JCheckBox cSoftDrinks;
    private JRadioButton rb15;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JPanel jpanel;
    private JButton btnOrder;

    public FOS() {
        btnOrder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                display();
            }

            private void display() {
                double finalPrice = 0;
                double discount = 0;

                if(cPizza.isSelected()){
                    finalPrice += 100;
                }
                if(cBurger.isSelected()){
                    finalPrice += 80;
                }
                if(cFries.isSelected()){
                    finalPrice += 65;
                }
                if(cSoftDrinks.isSelected()){
                    finalPrice += 55;
                }
                if(cTea.isSelected()){
                    finalPrice += 50;
                }
                if(cSundae.isSelected()){
                    finalPrice += 40;
                }

                if(rb5.isSelected()){
                    discount = 0.05;
                }
                if (rb10.isSelected()){
                    discount = 0.1;
                }
                if(rb15.isSelected()){
                    discount = 0.15;
                }

                finalPrice *= (1 - discount);




                JOptionPane.showMessageDialog(FOS.this,"The total price is Php " + finalPrice);

            }

        });


    }

    public static void main(String[] args) {
        FOS app = new FOS();
        app.setContentPane(app.jpanel);
        JButton btn = new JButton("HIEFS");
        app.setSize(1000, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }
}
