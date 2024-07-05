import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class test extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JButton logInButton;
    private JButton registerButton;
    private JPasswordField passwordField1;
    private JButton forgotYourPasswordButton;
    public static String userNameRegistered;
    public static String passwordRegisteredConverted;


    public test(String userNameRegistered, String passwordRegisteredConverted ) {
        setContentPane(panel1);
        setTitle("Salary management");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,600);
        setLocationRelativeTo(null);
        setVisible(true);
//        userNameRegistered = new String[1];
//        passwordRegisteredConverted = new String[1];
        test.passwordRegisteredConverted = passwordRegisteredConverted;
        test.userNameRegistered = userNameRegistered;
        registerButton.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                new register ();
            }
        });
        //login enter button
        new JButton ("enter" );
        logInButton.getRootPane ().setDefaultButton (logInButton);
        logInButton.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
//
                try {
                    //Connect to database
                    Connection connection = DriverManager.getConnection ("jdbc:postgresql://localhost:3008/NewDB","postgres","Liverpool3008@");
                    //check similar username and password
                    PreparedStatement preparedStatement = connection.prepareStatement ("SELECT * FROM UserAccount WHERE UserName = ? AND Password = ?");
                    preparedStatement.setString (1, textField1.getText ());
                    preparedStatement.setString (2,passwordField1.getText ());
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if (resultSet.next ()) {

                        JOptionPane.showMessageDialog (test.this,"Username and password existed at out database");
                        JOptionPane.showMessageDialog (test.this,"LogIn successfully");
                        new selectEmployee ();
                    }
                    else {

                        JOptionPane.showMessageDialog (test.this,"Wrong userName or Password");
                        textField1.setText (null);
                        passwordField1.setText (null);
                    }

                }
                catch (SQLException E) {
                    throw new RuntimeException (E);
                }
            }
        });
        forgotYourPasswordButton.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
//
                new tes2 ();
            }
        });

    }

    public static void main(String[] args) {
        new test(test.userNameRegistered,test.passwordRegisteredConverted);

    }
}
