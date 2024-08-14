import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import exercise1_32.*;
public class selectEmployee extends JFrame {
    private JComboBox comboBox1;
    private JPanel panel1;
    private JButton selectButton;
    private JButton clickToCalculateButton;
    private JButton saveDataButton;
    private JTextField maSo;
    private JTextField hoTen;
    private JTextField namSinh;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JLabel namSinhLabel;
    private JLabel maSoLabel;
    private JLabel hoTenLabel;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;


    public selectEmployee() {
        setContentPane(panel1);
        setTitle("Salary management");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        new JButton ( "Enter" );

        namSinhLabel.setVisible (false);
        maSoLabel.setVisible (false);
        hoTenLabel.setVisible (false);
        label1.setVisible (false);
        label2.setVisible (false);
        label3.setVisible (false);
        label4.setVisible (false);
        label5.setVisible (false);
        maSo.setVisible (false);
        hoTen.setVisible (false);
        namSinh.setVisible (false);
        textField1.setVisible (false);
        textField2.setVisible (false);
        textField3.setVisible (false);
        textField4.setVisible (false);
        textField5.setVisible (false);
        saveDataButton.setVisible (false);
        clickToCalculateButton.setVisible (false);

        selectButton.getRootPane ().setDefaultButton (selectButton);
        selectButton.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedItem ().equals ("Select here")) {
                    JOptionPane.showMessageDialog (selectEmployee.this,"Please select employee type");
//                    selectButton.setText ("Confirmed your selection");
                    namSinhLabel.setVisible (false);
                    maSoLabel.setVisible (false);
                    hoTenLabel.setVisible (false);
                    label1.setVisible (false);
                    label2.setVisible (false);
                    label3.setVisible (false);
                    label4.setVisible (false);
                    label5.setVisible (false);
                    maSo.setVisible (false);
                    hoTen.setVisible (false);
                    namSinh.setVisible (false);
                    textField1.setVisible (false);
                    textField2.setVisible (false);
                    textField3.setVisible (false);
                    textField4.setVisible (false);
                    textField5.setVisible (false);
                    saveDataButton.setVisible (false);
                    clickToCalculateButton.setVisible (false);
                }
                else if(comboBox1.getSelectedItem ().equals ("1. Giao vien co huu")) {
                    //write code
//                    JOptionPane.showMessageDialog (selectEmployee.this,1);
//                    selectButton.setText ("please confirm if you wanna change");
                    maSoLabel.setVisible (true);
                    maSo.setVisible (true);
                    hoTenLabel.setVisible (true);
                    hoTen.setVisible (true);
                    namSinhLabel.setVisible (true);
                    namSinh.setVisible (true);
                    saveDataButton.setVisible (true);
                    label1.setVisible (true);
                    label1.setText ("HSL");
                    textField1.setVisible (true);
                    label2.setVisible (true);
                    label2.setText ("LCS");
                    textField2.setVisible (true);
                    label3.setVisible (true);
                    label3.setText ("He so tham nien");
                    textField3.setVisible (true);
                    clickToCalculateButton.setVisible (true);
                    label4.setVisible (true);
                    label4.setText ("Luong cua giao vien");
                    textField4.setVisible (true);
                    textField4.setEditable (false);
                    saveDataButton.setVisible (false);
                    //Tinh luong
                    clickToCalculateButton.addActionListener (new ActionListener ( ) {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (maSo.getText ().isEmpty ()||hoTen.getText ().isEmpty ()||namSinh.getText ().isEmpty ()||textField1.getText ().isEmpty ()||textField2.getText ().isEmpty ()||textField3.getText ().isEmpty ()) {

                                JOptionPane.showMessageDialog (selectEmployee.this, "Cannot calculate because of missing information");
                            }
                            else {
                                if (!maSo.getText ().matches ("-?\\d+")) {
                                    JOptionPane.showMessageDialog (selectEmployee.this,"ma so must be numbering");
                                }
                                else if (hoTen.getText ().matches ("-?\\d+")) {
                                    JOptionPane.showMessageDialog (selectEmployee.this,"Ho ten must be wording");
                                }
                                else if (!namSinh.getText ().matches ("-?\\d+")) {
                                    JOptionPane.showMessageDialog (selectEmployee.this,"Nam sinh must be numbering");
                                }
                                else {
                                    GVCoHuu gvCoHuu = new GVCoHuu (maSo.getText (),hoTen.getText (),Integer.parseInt (namSinh.getText ()),Double.parseDouble (textField1.getText ()),Double.parseDouble (textField2.getText ()),Double.parseDouble (textField3.getText ()));
                                    textField4.setText (Double.toString (gvCoHuu.tinhLuong ()));
                                    saveDataButton.setVisible (true);
                                }
                            }
                        }
                    });

                }
                else if (comboBox1.getSelectedItem ().equals ("2. Nhan vien co huu")) {
                    //write code
//                    JOptionPane.showMessageDialog (selectEmployee.this,2);
//                    selectButton.setText ("please confirm if you wanna change");
                    maSoLabel.setVisible (true);
                    maSo.setVisible (true);
                    hoTenLabel.setVisible (true);
                    hoTen.setVisible (true);
                    namSinhLabel.setVisible (true);
                    namSinh.setVisible (true);
                    saveDataButton.setVisible (true);
                }
                else if (comboBox1.getSelectedItem ().equals ("3. Giao vien thinh giang")) {
                    //write code
//                    JOptionPane.showMessageDialog (selectEmployee.this,3);
//                    selectButton.setText ("Wanna select another?");
                    maSoLabel.setVisible (true);
                    maSo.setVisible (true);
                    hoTenLabel.setVisible (true);
                    hoTen.setVisible (true);
                    namSinhLabel.setVisible (true);
                    namSinh.setVisible (true);
                    saveDataButton.setVisible (true);
                }
                else {
//                    JOptionPane.showMessageDialog (selectEmployee.this,4);
//                    selectButton.setText ("please confirm if you wanna change");
                    maSoLabel.setVisible (true);
                    maSo.setVisible (true);
                    hoTenLabel.setVisible (true);
                    hoTen.setVisible (true);
                    namSinhLabel.setVisible (true);
                    namSinh.setVisible (true);
                    saveDataButton.setVisible (true);
                }
            }
        });
    }
}
