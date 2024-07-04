import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class register extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton FINISHEDButton;
    private JButton alreadyHaveAccoutButton;
    private JTextField textField4;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    public static String nationalID;

    public register() {
        setContentPane(panel1);
        setTitle("Salary management");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setSize(400,500);
        setLocationRelativeTo(null);
        setVisible(true);
        new JButton ( "Enter" );
        FINISHEDButton.getRootPane ().setDefaultButton (FINISHEDButton);
        FINISHEDButton.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (textField4.getText ().isEmpty () || textField1.getText().isEmpty () || passwordField1.getText().isEmpty () || passwordField2.getText ().isEmpty ()) {

//                    if (passwordField1.getText () != passwordField2.getText ()) {
//                        JOptionPane.showMessageDialog (register.this,"confirmed password do not match with the registered password");
//                    }

                    JOptionPane.showMessageDialog (register.this,"Please fill all");

                }
                else {
                    if (!passwordField1.getText ().equals (passwordField2.getText ())) {
                        JOptionPane.showMessageDialog (register.this,"confirmed password do not match with the registered password");
                    }
                    else {
                        try {
                            //Connect to database
                            Connection connection = DriverManager.getConnection ("jdbc:postgresql://localhost:3008/NewDB","postgres","Liverpool3008@");
                            //check similar username
                            PreparedStatement preparedStatement = connection.prepareStatement ("SELECT * FROM UserAccount WHERE NationalID = ? OR UserName = ?");
                            preparedStatement.setInt (1, Integer.parseInt (textField4.getText ()));
                            preparedStatement.setString (2,textField1.getText ());
                            ResultSet resultSet = preparedStatement.executeQuery();

                            if (resultSet.next ()) {
                                int ID = resultSet.getInt (1);
                                String User = resultSet.getString (2);
                                if (textField4.getText ().equals (String.valueOf (ID))) {
                                    JOptionPane.showMessageDialog (register.this,"The national ID already existed in our Database");
                                }
                                if (textField1.getText ().equals (User)) {
                                    JOptionPane.showMessageDialog (register.this,"The username already existed in our Database");
                                }
                            }
                            else {
                                //Import to database
                                JOptionPane.showMessageDialog (register.this,"Registered successfully");
                                JOptionPane.showMessageDialog (register.this,"Your account has been stored in our database");
                                new test (textField1.getText (),passwordField2.getText ());
                                nationalID = textField4.getText ();

                                String insertSQL = "INSERT INTO UserAccount (NationalID, UserName, Password) VALUES (?, ?, ?)";
                                PreparedStatement PreparedStatement = connection.prepareStatement(insertSQL);
                                PreparedStatement.setInt(1, Integer.parseInt (nationalID));
                                PreparedStatement.setString(2, textField1.getText ());
                                PreparedStatement.setString(3, passwordField2.getText());
                                PreparedStatement.executeUpdate();
                            }

                        } catch (SQLException E) {
                            throw new RuntimeException (E);
                        }
                    }

                }
            }
        });
        alreadyHaveAccoutButton.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                new test (test.userNameRegistered,test.passwordRegisteredConverted);
            }
        });
    }
}
