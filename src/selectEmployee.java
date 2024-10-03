import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import exercise1_32.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;


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
    private JLabel foundID;
    private JLabel foundName;
    private JButton excelExport;


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
        foundID.setVisible (false);
        foundName.setVisible (false);
        selectButton.getRootPane ().setDefaultButton (selectButton);
        selectButton.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent e) {

                //select here
                if (comboBox1.getSelectedItem ().equals (comboBox1.getItemAt (0))) {
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
                    textField4.setEditable (false);
                    textField5.setVisible (false);
                    textField5.setEditable (false);
                    saveDataButton.setVisible (false);
                    clickToCalculateButton.setVisible (false);

                }
                //1. giao vien co huu
                else if(comboBox1.getSelectedItem ().equals (comboBox1.getItemAt (1))) {
                    //return to zero value
                    maSo.setText (null);
                    hoTen.setText (null);
                    namSinh.setText (null);
                    textField1.setText (null);
                    textField2.setText (null);
                    textField3.setText (null);
                    textField4.setText (null);
                    textField5.setText (null);
                    //Unlock
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
                    label5.setVisible (false);
                    textField5.setVisible (false);
                    textField5.setEditable (false);
                    saveDataButton.setVisible (false);

                    //Tinh luong



                // 2. nhan vien co huu
                }
                else if (comboBox1.getSelectedItem ().equals (comboBox1.getItemAt (2))) {
                    //return to zero value
                    maSo.setText (null);
                    hoTen.setText (null);
                    namSinh.setText (null);
                    textField1.setText (null);
                    textField2.setText (null);
                    textField3.setText (null);
                    textField4.setText (null);
                    textField5.setText (null);
                    //Unlock
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
                    label3.setText ("So gio lam them");
                    textField3.setVisible (true);
                    clickToCalculateButton.setVisible (true);
                    label4.setVisible (true);
                    label4.setText ("Luong cua nhan vien");
                    label5.setVisible (true);
                    label5.setText ("Luong sau thuong");
                    textField4.setVisible (true);
                    textField4.setEditable (false);
                    textField5.setVisible (true);
                    textField5.setEditable (false);
                    saveDataButton.setVisible (false);

                    //Tinh luong

                }
                //3. Giao vien thinh giang
                else if (comboBox1.getSelectedItem ().equals (comboBox1.getItemAt (3))) {
                    //return to zero value
                    maSo.setText (null);
                    hoTen.setText (null);
                    namSinh.setText (null);
                    textField1.setText (null);
                    textField2.setText (null);
                    textField3.setText (null);
                    textField4.setText (null);
                    textField5.setText (null);
                    //Unlock
                    maSoLabel.setVisible (true);
                    maSo.setVisible (true);
                    hoTenLabel.setVisible (true);
                    hoTen.setVisible (true);
                    namSinhLabel.setVisible (true);
                    namSinh.setVisible (true);
                    saveDataButton.setVisible (true);
                    label1.setVisible (true);
                    label1.setText ("Muc luong");
                    textField1.setVisible (true);
                    label2.setVisible (true);
                    label2.setText ("So tiet Giang Day");
                    textField2.setVisible (true);
                    label3.setVisible (true);
                    label3.setText ("Trinh Do");
                    textField3.setVisible (true);
                    clickToCalculateButton.setVisible (true);
                    label4.setVisible (true);
                    label4.setText ("Luong cua giao vien");
                    textField4.setVisible (true);
                    textField4.setEditable (false);
                    textField5.setVisible (false);
                    textField5.setEditable (false);
                    label5.setVisible (false);
                    textField5.setVisible (false);
                    saveDataButton.setVisible (false);

                    //Tinh luong


                }
                //4. nhan vien hop dong
                else if (comboBox1.getSelectedItem ().equals (comboBox1.getItemAt (4))){
                    //return to zero value
                    maSo.setText (null);
                    hoTen.setText (null);
                    namSinh.setText (null);
                    textField1.setText (null);
                    textField2.setText (null);
                    textField3.setText (null);
                    textField4.setText (null);
                    textField5.setText (null);
                    //unlock
                    maSoLabel.setVisible (true);
                    maSo.setVisible (true);
                    hoTenLabel.setVisible (true);
                    hoTen.setVisible (true);
                    namSinhLabel.setVisible (true);
                    namSinh.setVisible (true);
                    saveDataButton.setVisible (true);
                    label1.setVisible (true);
                    label1.setText ("Muc luong");
                    textField1.setVisible (true);
                    label2.setVisible (true);
                    label2.setText ("Ngay Cong");
                    textField2.setVisible (true);
                    label3.setVisible (false);
                    textField3.setVisible (false);
                    label4.setVisible (true);
                    label4.setText ("Luong cua nhan vien");
                    textField4.setVisible (true);
                    label5.setVisible (true);
                    label5.setText ("Luong sau thuong");
                    textField4.setVisible (true);
                    textField4.setEditable (false);
                    textField5.setVisible (true);
                    textField5.setEditable (false);
                    clickToCalculateButton.setVisible (true);
                    saveDataButton.setVisible (false);


                }
            }
        });
        clickToCalculateButton.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                //1. giao vien co huu
                if (comboBox1.getSelectedItem ().equals (comboBox1.getItemAt (1))) {
                    if (maSo.getText ().isEmpty ()||hoTen.getText ().isEmpty ()||namSinh.getText ().isEmpty ()||textField1.getText ().isEmpty ()||textField2.getText ().isEmpty ()||textField3.getText ().isEmpty ()) {
                        JOptionPane.showMessageDialog (selectEmployee.this, "Cannot calculate because of missing information");
                        saveDataButton.setVisible (false);
                    }
                    else {
                        if (!maSo.getText ().matches ("-?\\d+")|!hoTen.getText ().matches ("[a-zA-Z\\s]+")||!namSinh.getText ().matches ("\\d{4}")) {
                            if (!maSo.getText ().matches ("-?\\d+")) {
                                JOptionPane.showMessageDialog (selectEmployee.this,"ma so must be numbering");
                                saveDataButton.setVisible (false);
                            }
                            if (!hoTen.getText ().matches ("[a-zA-Z\\s]+")) {
                                JOptionPane.showMessageDialog (selectEmployee.this,"Ho ten must be wording and spacing");
                                saveDataButton.setVisible (false);
                            }
                            if (!namSinh.getText ().matches ("\\d{4}")) {
                                JOptionPane.showMessageDialog (selectEmployee.this,"Nam sinh must be numbering with 4 digits");
                                saveDataButton.setVisible (false);
                            }
                        }
                        else {
                            GVCoHuu gvCoHuu = new GVCoHuu (maSo.getText (),hoTen.getText (),Integer.parseInt (namSinh.getText ()),Double.parseDouble (textField1.getText ()),Double.parseDouble (textField2.getText ()),Double.parseDouble (textField3.getText ()));
                            textField4.setText (Double.toString (gvCoHuu.tinhLuong ()));
                            saveDataButton.setVisible (true);

                        }
                    }
                }
                //2. nhan vien co huu
                else if (comboBox1.getSelectedItem ().equals (comboBox1.getItemAt (2))) {
                    if (maSo.getText ().isEmpty ()||hoTen.getText ().isEmpty ()||namSinh.getText ().isEmpty ()||textField1.getText ().isEmpty ()||textField2.getText ().isEmpty ()||textField3.getText ().isEmpty ()) {
                        JOptionPane.showMessageDialog (selectEmployee.this, "Cannot calculate because of missing information");
                        saveDataButton.setVisible (false);
                    }
                    else {
                        if (!maSo.getText ().matches ("-?\\d+")|!hoTen.getText ().matches ("[a-zA-Z\\s]+")||!namSinh.getText ().matches ("\\d{4}")) {
                            if (!maSo.getText ().matches ("-?\\d+")) {
                                JOptionPane.showMessageDialog (selectEmployee.this,"ma so must be numbering");
                                saveDataButton.setVisible (false);
                            }
                            if (!hoTen.getText ().matches ("[a-zA-Z\\s]+")) {
                                JOptionPane.showMessageDialog (selectEmployee.this,"Ho ten must be wording and spacing");
                                saveDataButton.setVisible (false);
                            }
                            if (!namSinh.getText ().matches ("\\d{4}")) {
                                JOptionPane.showMessageDialog (selectEmployee.this,"Nam sinh must be numbering with 4 digits");
                                saveDataButton.setVisible (false);
                            }
                        }
                        else {
                            NVCoHuu nvCoHuu = new NVCoHuu (maSo.getText (),hoTen.getText (),Integer.parseInt (namSinh.getText ()),Double.parseDouble (textField1.getText ()),Double.parseDouble (textField2.getText ()),Integer.parseInt (textField3.getText ()));
                            textField4.setText (Double.toString (nvCoHuu.tinhLuong ()));
                            textField5.setText (Double.toString (nvCoHuu.tinhKhenThuong ()));
                            saveDataButton.setVisible (true);

                        }
                    }
                }
                //3. giao vien thinh giang
                else if (comboBox1.getSelectedItem ().equals (comboBox1.getItemAt (3))) {
                    if (maSo.getText ().isEmpty ()||hoTen.getText ().isEmpty ()||namSinh.getText ().isEmpty ()||textField1.getText ().isEmpty ()||textField2.getText ().isEmpty ()||textField3.getText ().isEmpty ()) {
                        JOptionPane.showMessageDialog (selectEmployee.this, "Cannot calculate because of missing information");
                        saveDataButton.setVisible (false);
                    }
                    else {
                        if (!maSo.getText ().matches ("-?\\d+")|!hoTen.getText ().matches ("[a-zA-Z\\s]+")||!namSinh.getText ().matches ("\\d{4}")) {
                            if (!maSo.getText ().matches ("-?\\d+")) {
                                JOptionPane.showMessageDialog (selectEmployee.this,"ma so must be numbering");
                                saveDataButton.setVisible (false);
                            }
                            if (!hoTen.getText ().matches ("[a-zA-Z\\s]+")) {
                                JOptionPane.showMessageDialog (selectEmployee.this,"Ho ten must be wording and spacing");
                                saveDataButton.setVisible (false);
                            }
                            if (!namSinh.getText ().matches ("\\d{4}")) {
                                JOptionPane.showMessageDialog (selectEmployee.this,"Nam sinh must be numbering with 4 digits");
                                saveDataButton.setVisible (false);
                            }
                        }
                        else {
                            GVThinhGiang gvThinhGiang = new GVThinhGiang (maSo.getText (),hoTen.getText (),Integer.parseInt (namSinh.getText ()),Double.parseDouble (textField1.getText ()),Integer.parseInt (textField2.getText ()),textField3.getText ());
                            textField4.setText (Double.toString (gvThinhGiang.tinhLuong ()));
                            saveDataButton.setVisible (true);
                        }
                    }
                }
                //4. nhan vien hop dong
                else if (comboBox1.getSelectedItem ().equals (comboBox1.getItemAt (4))) {
                    if (maSo.getText ().isEmpty ()||hoTen.getText ().isEmpty ()||namSinh.getText ().isEmpty ()||textField1.getText ().isEmpty ()||textField2.getText ().isEmpty ()) {
                        JOptionPane.showMessageDialog (selectEmployee.this, "Cannot calculate because of missing information");
                        saveDataButton.setVisible (false);
                    }
                    else {
                        if (!maSo.getText ().matches ("-?\\d+")|!hoTen.getText ().matches ("[a-zA-Z\\s]+")||!namSinh.getText ().matches ("\\d{4}")) {
                            if (!maSo.getText ().matches ("-?\\d+")) {
                                JOptionPane.showMessageDialog (selectEmployee.this,"ma so must be numbering");
                                saveDataButton.setVisible (false);
                            }
                            if (!hoTen.getText ().matches ("[a-zA-Z\\s]+")) {
                                JOptionPane.showMessageDialog (selectEmployee.this,"Ho ten must be wording and spacing");
                                saveDataButton.setVisible (false);
                            }
                            if (!namSinh.getText ().matches ("\\d{4}")) {
                                JOptionPane.showMessageDialog (selectEmployee.this,"Nam sinh must be numbering with 4 digits");
                                saveDataButton.setVisible (false);
                            }
                        }
                        else {
                            NVHopDong nvHopDong = new NVHopDong (maSo.getText (),hoTen.getText (),Integer.parseInt (namSinh.getText ()),Double.parseDouble (textField1.getText ()),Integer.parseInt (textField2.getText ()));
                            textField4.setText (Double.toString (nvHopDong.tinhLuong ()));
                            textField5.setText (Double.toString (nvHopDong.tinhKhenThuong ()));
                            saveDataButton.setVisible (true);
                        }
                    }
                }
            }
        });
        saveDataButton.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                //1. giao vien co huu
                if (comboBox1.getSelectedItem ().equals (comboBox1.getItemAt (1))) {
                    foundID.setVisible (false);
                    foundName.setVisible (false);
                    try {

                        //Connect to database
                        Connection connection = DriverManager.getConnection ("jdbc:postgresql://localhost:3008/NewDB","postgres","Liverpool3008@");

                        //Check similar maSo, hoTen
                        PreparedStatement preparedStatement = connection.prepareStatement ("SELECT * FROM fullstaff WHERE maso = ? OR hoten = ?");
                        preparedStatement.setString (1,maSo.getText ());
                        preparedStatement.setString (2,hoTen.getText ());
                        ResultSet resultSet = preparedStatement.executeQuery();
                        if (resultSet.next ()) {
                            JOptionPane.showMessageDialog (selectEmployee.this,"Please fix the error");
                            if (maSo.getText ().equals (String.valueOf (resultSet.getInt (1)))) {
//                                        JOptionPane.showMessageDialog (selectEmployee.this,"This ID already existed in our Database");
                                foundID.setVisible (true);
                                foundID.setText ("The ID already existed, please type another");

                            }
                            if (hoTen.getText ().equals (resultSet.getString (2))) {
//                                        JOptionPane.showMessageDialog (selectEmployee.this,"This full name already existed in our Database");
                                foundName.setVisible (true);
                                foundName.setText ("The full name already existed, please type another");
                            }
                        }
                        //Update
                        else {
                            JOptionPane.showMessageDialog (selectEmployee.this,"Updated to database");
                            String insertSQL = "INSERT INTO GVCoHuu (maso, hoten, namsinh, hsl, lcs, hsthamnien, luong, vitri) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement PreparedStatement = connection.prepareStatement(insertSQL);
                            PreparedStatement.setString (1, maSo.getText ());
                            PreparedStatement.setString(2, hoTen.getText ());
                            PreparedStatement.setInt (3, Integer.parseInt (namSinh.getText ()));
                            PreparedStatement.setDouble (4, Double.parseDouble (textField1.getText ()));
                            PreparedStatement.setDouble (5, Double.parseDouble (textField2.getText ()));
                            PreparedStatement.setDouble (6, Double.parseDouble (textField3.getText ()));
                            PreparedStatement.setDouble (7, Double.parseDouble (textField4.getText ()));
                            PreparedStatement.setString (8, comboBox1.getItemAt (1).toString ( ));
                            PreparedStatement.executeUpdate();
                            String joinTableSQL = "INSERT INTO FullStaff (maso, hoten, namsinh, viTri, thuong) VALUES (?, ?, ?, ?, ?)";
                            PreparedStatement PreparedStatement1 = connection.prepareStatement (joinTableSQL);
                            PreparedStatement1.setString (1, maSo.getText ());
                            PreparedStatement1.setString(2, hoTen.getText ());
                            PreparedStatement1.setInt (3, Integer.parseInt (namSinh.getText ()));
                            PreparedStatement1.setString (4, comboBox1.getItemAt (1).toString ( ));
                            PreparedStatement1.setDouble (5, Double.parseDouble (textField4.getText ()));
                            PreparedStatement1.executeUpdate ();
                            //reset to default page
                            comboBox1.setSelectedIndex (0);
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
                            textField4.setEditable (false);
                            textField5.setVisible (false);
                            textField5.setEditable (false);
                            saveDataButton.setVisible (false);
                            clickToCalculateButton.setVisible (false);
                            foundName.setVisible (false);
                            foundID.setVisible (false);
                            //reset all value to zero
                            maSo.setText (null);
                            hoTen.setText (null);
                            namSinh.setText (null);
                            textField1.setText (null);
                            textField2.setText (null);
                            textField3.setText (null);
                            textField4.setText (null);
                            textField5.setText (null);
                        }
                    }
                    catch (SQLException E) {
                        throw new RuntimeException (E);
                    }

                }
                //2. nhan vien co huuu
                else if (comboBox1.getSelectedItem ().equals (comboBox1.getItemAt (2))) {
                    foundID.setVisible (false);
                    foundName.setVisible (false);
                    try {

                        //Connect to database
                        Connection connection = DriverManager.getConnection ("jdbc:postgresql://localhost:3008/NewDB","postgres","Liverpool3008@");

                        //Check similar maSo, hoTen
                        PreparedStatement preparedStatement = connection.prepareStatement ("SELECT * FROM fullstaff WHERE maso = ? OR hoten = ?");
                        preparedStatement.setString (1,maSo.getText ());
                        preparedStatement.setString (2,hoTen.getText ());
                        ResultSet resultSet = preparedStatement.executeQuery();
                        if (resultSet.next ()) {
                            JOptionPane.showMessageDialog (selectEmployee.this,"Please fix the error");
                            if (maSo.getText ().equals (String.valueOf (resultSet.getInt (1)))) {
//                                        JOptionPane.showMessageDialog (selectEmployee.this,"This ID already existed in our Database");
                                foundID.setVisible (true);
                                foundID.setText ("The ID already existed, please type another");

                            }
                            if (hoTen.getText ().equals (resultSet.getString (2))) {
//                                        JOptionPane.showMessageDialog (selectEmployee.this,"This full name already existed in our Database");
                                foundName.setVisible (true);
                                foundName.setText ("The full name already existed, please type another");
                            }
                        }
                        //Update
                        else {
                            JOptionPane.showMessageDialog (selectEmployee.this,"Updated to database");
                            String insertSQL = "INSERT INTO NVCoHuu (maso, hoten, namsinh, hsl, lcs, giolamthem, luong, khenthuong, vitri) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement PreparedStatement = connection.prepareStatement(insertSQL);
                            PreparedStatement.setString (1, maSo.getText ());
                            PreparedStatement.setString(2, hoTen.getText ());
                            PreparedStatement.setInt (3, Integer.parseInt (namSinh.getText ()));
                            PreparedStatement.setDouble (4, Double.parseDouble (textField1.getText ()));
                            PreparedStatement.setDouble (5, Double.parseDouble (textField2.getText ()));
                            PreparedStatement.setDouble (6, Double.parseDouble (textField3.getText ()));
                            PreparedStatement.setDouble (7, Double.parseDouble (textField4.getText ()));
                            PreparedStatement.setDouble (8, Double.parseDouble (textField5.getText ()));
                            PreparedStatement.setString (9,comboBox1.getItemAt (2).toString ());
                            PreparedStatement.executeUpdate();
                            String joinTableSQL = "INSERT INTO FullStaff (maso, hoten, namsinh, viTri, thuong, khenthuong) VALUES (?, ?, ?, ?, ?, ?) ";
                            PreparedStatement PreparedStatement1 = connection.prepareStatement (joinTableSQL);
                            PreparedStatement1.setString (1, maSo.getText ());
                            PreparedStatement1.setString(2, hoTen.getText ());
                            PreparedStatement1.setInt (3, Integer.parseInt (namSinh.getText ()));
                            PreparedStatement1.setString (4,comboBox1.getItemAt (2).toString ());
                            PreparedStatement1.setDouble (5, Double.parseDouble (textField4.getText ()));
                            PreparedStatement1.setDouble (6, Double.parseDouble (textField5.getText ()));
                            PreparedStatement1.executeUpdate ();
                            //reset to default page
                            comboBox1.setSelectedIndex (0);
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
                            textField4.setEditable (false);
                            textField5.setVisible (false);
                            textField5.setEditable (false);
                            saveDataButton.setVisible (false);
                            clickToCalculateButton.setVisible (false);
                            foundName.setVisible (false);
                            foundID.setVisible (false);
                            //reset all value to zero
                            maSo.setText (null);
                            hoTen.setText (null);
                            namSinh.setText (null);
                            textField1.setText (null);
                            textField2.setText (null);
                            textField3.setText (null);
                            textField4.setText (null);
                            textField5.setText (null);
                        }
                    }
                    catch (SQLException E) {
                        throw new RuntimeException (E);
                    }
                }
                //3. giao vien thinh giang
                else if (comboBox1.getSelectedItem ().equals (comboBox1.getItemAt (3))) {
                    foundID.setVisible (false);
                    foundName.setVisible (false);
                    try {

                        //Connect to database
                        Connection connection = DriverManager.getConnection ("jdbc:postgresql://localhost:3008/NewDB","postgres","Liverpool3008@");

                        //Check similar maSo, hoTen
                        PreparedStatement preparedStatement = connection.prepareStatement ("SELECT * FROM fullstaff WHERE maso = ? OR hoten = ?");
                        preparedStatement.setString (1,maSo.getText ());
                        preparedStatement.setString (2,hoTen.getText ());
                        ResultSet resultSet = preparedStatement.executeQuery();
                        if (resultSet.next ()) {
                            JOptionPane.showMessageDialog (selectEmployee.this,"Please fix the error");
                            if (maSo.getText ().equals (String.valueOf (resultSet.getInt (1)))) {
//                                        JOptionPane.showMessageDialog (selectEmployee.this,"This ID already existed in our Database");
                                foundID.setVisible (true);
                                foundID.setText ("The ID already existed, please type another");

                            }
                            if (hoTen.getText ().equals (resultSet.getString (2))) {
//                                        JOptionPane.showMessageDialog (selectEmployee.this,"This full name already existed in our Database");
                                foundName.setVisible (true);
                                foundName.setText ("The full name already existed, please type another");
                            }
                        }
                        //Update
                        else {
                            JOptionPane.showMessageDialog (selectEmployee.this,"Updated to database");
                            String insertSQL = "INSERT INTO GVThinhGiang (maso, hoten, namsinh, mucluong, sotietgd, trinhdo, luong, vitri) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement PreparedStatement = connection.prepareStatement(insertSQL);
                            PreparedStatement.setString (1, maSo.getText ());
                            PreparedStatement.setString(2, hoTen.getText ());
                            PreparedStatement.setInt (3, Integer.parseInt (namSinh.getText ()));
                            PreparedStatement.setDouble (4, Double.parseDouble (textField1.getText ()));
                            PreparedStatement.setInt (5, Integer.parseInt (textField2.getText ()));
                            PreparedStatement.setString (6, textField3.getText ());
                            PreparedStatement.setDouble (7, Double.parseDouble (textField4.getText ()));
                            PreparedStatement.setString (8, comboBox1.getItemAt (3).toString ( ));
                            PreparedStatement.executeUpdate();
                            String joinTableSQL = "INSERT INTO FullStaff (maso, hoten, namsinh, viTri, thuong) VALUES (?, ?, ?, ?, ?) ";
                            PreparedStatement PreparedStatement1 = connection.prepareStatement (joinTableSQL);
                            PreparedStatement1.setString (1, maSo.getText ());
                            PreparedStatement1.setString(2, hoTen.getText ());
                            PreparedStatement1.setInt (3, Integer.parseInt (namSinh.getText ()));
                            PreparedStatement1.setString (4, comboBox1.getItemAt (3).toString ( ));
                            PreparedStatement1.setDouble (5, Double.parseDouble (textField4.getText ()));
                            PreparedStatement1.executeUpdate ();
                            //reset to default page
                            comboBox1.setSelectedIndex (0);
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
                            textField4.setEditable (false);
                            textField5.setVisible (false);
                            textField5.setVisible (false);
                            saveDataButton.setVisible (false);
                            clickToCalculateButton.setVisible (false);
                            foundName.setVisible (false);
                            foundID.setVisible (false);
                            //reset all value to zero
                            maSo.setText (null);
                            hoTen.setText (null);
                            namSinh.setText (null);
                            textField1.setText (null);
                            textField2.setText (null);
                            textField3.setText (null);
                            textField4.setText (null);
                            textField5.setText (null);
                        }
                    }
                    catch (SQLException E) {
                        throw new RuntimeException (E);
                    }
                }
                //4. nhan vien hop dong
                else if (comboBox1.getSelectedItem ().equals (comboBox1.getItemAt (4))) {
                    foundID.setVisible (false);
                    foundName.setVisible (false);
                    try {

                        //Connect to database
                        Connection connection = DriverManager.getConnection ("jdbc:postgresql://localhost:3008/NewDB","postgres","Liverpool3008@");

                        //Check similar maSo, hoTen
                        PreparedStatement preparedStatement = connection.prepareStatement ("SELECT * FROM fullstaff WHERE maso = ? OR hoten = ?");
                        preparedStatement.setString (1,maSo.getText ());
                        preparedStatement.setString (2,hoTen.getText ());
                        ResultSet resultSet = preparedStatement.executeQuery();
                        if (resultSet.next ()) {
                            JOptionPane.showMessageDialog (selectEmployee.this,"Please fix the error");
                            if (maSo.getText ().equals (String.valueOf (resultSet.getInt (1)))) {
//                                        JOptionPane.showMessageDialog (selectEmployee.this,"This ID already existed in our Database");
                                foundID.setVisible (true);
                                foundID.setText ("The ID already existed, please type another");

                            }
                            if (hoTen.getText ().equals (resultSet.getString (2))) {
//                                        JOptionPane.showMessageDialog (selectEmployee.this,"This full name already existed in our Database");
                                foundName.setVisible (true);
                                foundName.setText ("The full name already existed, please type another");
                            }
                        }
                        //Update
                        else {
                            JOptionPane.showMessageDialog (selectEmployee.this,"Updated to database");
                            String insertSQL = "INSERT INTO NVHopDong (maso, hoten, namsinh, mucluong, ngaycong, luong, khenthuong, vitri) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                            PreparedStatement PreparedStatement = connection.prepareStatement(insertSQL);
                            PreparedStatement.setString (1, maSo.getText ());
                            PreparedStatement.setString(2, hoTen.getText ());
                            PreparedStatement.setInt (3, Integer.parseInt (namSinh.getText ()));
                            PreparedStatement.setDouble (4, Double.parseDouble (textField1.getText ()));
                            PreparedStatement.setInt (5, Integer.parseInt (textField2.getText ()));
                            PreparedStatement.setDouble (6, Double.parseDouble (textField4.getText ()));
                            PreparedStatement.setDouble (7, Double.parseDouble (textField5.getText ()));
                            PreparedStatement.setString (8,comboBox1.getItemAt (4).toString ());
                            PreparedStatement.executeUpdate();
                            String joinTableSQL = "INSERT INTO FullStaff (maso, hoten, namsinh, viTri, thuong, khenthuong) VALUES (?, ?, ?, ?, ?, ?) ";
                            PreparedStatement PreparedStatement1 = connection.prepareStatement (joinTableSQL);
                            PreparedStatement1.setString (1, maSo.getText ());
                            PreparedStatement1.setString(2, hoTen.getText ());
                            PreparedStatement1.setInt (3, Integer.parseInt (namSinh.getText ()));
                            PreparedStatement1.setString (4, comboBox1.getItemAt (4).toString ());
                            PreparedStatement1.setDouble (5, Double.parseDouble (textField4.getText ()));
                            PreparedStatement1.setDouble (6, Double.parseDouble (textField5.getText ()));
                            PreparedStatement1.executeUpdate();
                            //reset to default page
                            comboBox1.setSelectedIndex (0);
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
                            foundName.setVisible (false);
                            foundID.setVisible (false);
                            //reset all value to zero
                            maSo.setText (null);
                            hoTen.setText (null);
                            namSinh.setText (null);
                            textField1.setText (null);
                            textField2.setText (null);
                            textField3.setText (null);
                            textField4.setText (null);
                            textField5.setText (null);
                        }
                    }
                    catch (SQLException E) {
                        throw new RuntimeException (E);
                    }
                }
            }
        });
        excelExport.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser (  );
                fileChooser.setFileSelectionMode (JFileChooser.DIRECTORIES_ONLY);
                fileChooser.showDialog (selectEmployee.this,"Save file");
                File selectedDirectory = fileChooser.getSelectedFile ();
                String exelPath = selectedDirectory.getAbsolutePath () + File.separator + "data.xlsx";

                //Connect to database
                try {
                    Connection connection = DriverManager.getConnection ("jdbc:postgresql://localhost:3008/NewDB","postgres","Liverpool3008@");
                    String sql = "select * from fullstaff";
                    Statement statement = connection.createStatement ();

                    ResultSet resultSet = statement.executeQuery (sql);
                    Workbook workbook = new XSSFWorkbook ( );
                    Sheet sheet = workbook.createSheet ("Employees");

                    //write header line
                    Row headerRow = sheet.createRow (0);

                    Cell headerCell = headerRow.createCell (0);
                    headerCell.setCellValue ("Ma So");

                    headerCell = headerRow.createCell (1);
                    headerCell.setCellValue ("Ho Ten");

                    headerCell = headerRow.createCell (2);
                    headerCell.setCellValue ("Nam Sinh");

                    headerCell = headerRow.createCell (3);
                    headerCell.setCellValue ("Vi Tri");

                    headerCell = headerRow.createCell (4);
                    headerCell.setCellValue ("Thuong");

                    //write data line
                    int rowCount = 1;

                    while (resultSet.next ()){
                        Row row = sheet.createRow (rowCount++);
                        int columnCount = 0;

                        Cell cell = row.createCell (columnCount++);
                        cell.setCellValue (resultSet.getString ("maso"));

                        cell = row.createCell (columnCount++);
                        cell.setCellValue (resultSet.getString ("hoten"));

                        cell = row.createCell (columnCount++);
                        cell.setCellValue (resultSet.getString ("namsinh"));

                        cell = row.createCell (columnCount++);
                        cell.setCellValue (resultSet.getString ("vitri"));

                        cell = row.createCell (columnCount++);
                        cell.setCellValue (resultSet.getString ("thuong"));

                    }

                    try (FileOutputStream outputStream = new FileOutputStream (exelPath)) {
                        workbook.write (outputStream);
                        JOptionPane.showMessageDialog (selectEmployee.this,"Excel file exported successfully");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog (selectEmployee.this,"Error exporting");
                        throw new RuntimeException (ex);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException (ex);
                }
            }
        });

    }
}
