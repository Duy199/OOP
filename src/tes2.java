import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class tes2 extends JFrame {

    private JPanel panel1;
    private JTextField textField1;
    private JButton createNewPasswordButton;
    private JPasswordField passwordField1;
    private JButton alreadyHaveAccountButton;
    private JButton registerNewAccountButton;
    private JComboBox comboBox1;
    private JTextField textField2;

    public tes2 () {
        setContentPane(panel1);
        setTitle("Salary management");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setSize(400,500);
        setLocationRelativeTo(null);
        setVisible(true);
        new JButton ( "Enter" );
        createNewPasswordButton.getRootPane ().setDefaultButton (createNewPasswordButton);
        createNewPasswordButton.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (passwordField1.getText ().isEmpty()) {
                    JOptionPane.showMessageDialog (tes2.this,"Please fill all");
                }
                else {
                    if (comboBox1.getSelectedItem ().equals ("Please select data")) {
                        JOptionPane.showMessageDialog (tes2.this,"Please select your data field");
                    }
                    else if (comboBox1.getSelectedItem ().equals ("1. Your User Name:")) {
                        try {
                            //Connect to database
                            Connection connection = DriverManager.getConnection ("jdbc:postgresql://localhost:3008/NewDB","postgres","Liverpool3008@");
                            //check similar username and password
                            PreparedStatement preparedStatement = connection.prepareStatement ("SELECT * FROM UserAccount WHERE username = ?");
                            preparedStatement.setString (1,textField1.getText ());
                            ResultSet resultSet = preparedStatement.executeQuery();
                            if (resultSet.next ()) {
                                //Alter new password in database
                                PreparedStatement preparedStatement1 = connection.prepareStatement ("UPDATE UserAccount SET Password = ? WHERE username = ?");
                                preparedStatement1.setString (1,passwordField1.getText ());
                                preparedStatement1.setString (2,textField1.getText ());
                                preparedStatement1.executeUpdate ();
                                JOptionPane.showMessageDialog (tes2.this,"new password created for username: " + resultSet.getString (2));
                                new test (null,null);
                            }
                            else {

                                JOptionPane.showMessageDialog (tes2.this,"cannot find your username at our database");

                            }

                        }
                        catch (SQLException E) {
                            throw new RuntimeException (E);
                        }
                    }
                    else {
                        try {
                            //Connect to database
                            Connection connection = DriverManager.getConnection ("jdbc:postgresql://localhost:3008/NewDB","postgres","Liverpool3008@");
                            //check similar username and password
                            PreparedStatement preparedStatement = connection.prepareStatement ("SELECT * FROM UserAccount WHERE NationalID = ?");
                            preparedStatement.setInt (1, Integer.parseInt (textField1.getText ()));
                            ResultSet resultSet = preparedStatement.executeQuery();
                            if (resultSet.next ()) {
                                //Alter new password in database
                                PreparedStatement preparedStatement1 = connection.prepareStatement ("UPDATE UserAccount SET Password = ? WHERE NationalID = ?");
                                preparedStatement1.setString (1,passwordField1.getText ());
                                preparedStatement1.setInt (2, Integer.parseInt (textField1.getText ()));
                                preparedStatement1.executeUpdate ();
                                JOptionPane.showMessageDialog (tes2.this,"new password created for username: " + resultSet.getString (2));
                                new test (null,null);
                            }
                            else {

                                JOptionPane.showMessageDialog (tes2.this,"cannot find your nationalID at our database");

                            }

                        }
                        catch (SQLException E) {
                            throw new RuntimeException (E);
                        }
                    }

                }

            }
        });
        registerNewAccountButton.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                new register ();
            }
        });
        alreadyHaveAccountButton.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                new test (test.userNameRegistered,test.passwordRegisteredConverted);
            }
        });
    }
}
