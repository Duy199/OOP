import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class selectEmployee extends JFrame {
    private JComboBox comboBox1;
    private JPanel panel1;
    private JButton selectButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public selectEmployee() {
        setContentPane(panel1);
        setTitle("Salary management");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setSize(500,300);
        setLocationRelativeTo(null);
        setVisible(true);
        new JButton ( "Enter" );
        selectButton.getRootPane ().setDefaultButton (selectButton);
        selectButton.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedItem ().equals ("Select here")) {
                    JOptionPane.showMessageDialog (selectEmployee.this,"Please select employee type");
                }
                else if(comboBox1.getSelectedItem ().equals ("1. Giao vien co huu")) {
                    //write code
                    JOptionPane.showMessageDialog (selectEmployee.this,1);
                }
                else if (comboBox1.getSelectedItem ().equals ("2. Nhan vien co huu")) {
                    //write code
                    JOptionPane.showMessageDialog (selectEmployee.this,2);
                }
                else if (comboBox1.getSelectedItem ().equals ("3. Giao vien thinh giang")) {
                    //write code
                    JOptionPane.showMessageDialog (selectEmployee.this,3);
                }
                else {
                    JOptionPane.showMessageDialog (selectEmployee.this,4);
                }
            }
        });
    }
}
