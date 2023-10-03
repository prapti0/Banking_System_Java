package Bank;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankLoginPage extends JFrame implements ActionListener {
    private JTextField userField;
    private JPasswordField passwordField;
    private CreateAccountPage createAccountPage;

    public BankLoginPage() {
        super("Ok Bank - Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);

        // Create UI components
        JLabel titleLabel = new JLabel("Ok Bank-Login ");
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        titleLabel.setBounds(150, 10, 400, 50);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 100, 100, 50);
        userLabel.setFont(new Font("Arial",Font.BOLD,18));
        userField = new JTextField(20);
        userField.setBounds(150, 100, 150, 30);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 160, 100, 50);
        passwordLabel.setFont(new Font("Arial",Font.BOLD,18));
        passwordField = new JPasswordField(20);
        passwordField.setBounds(150, 170, 150, 30);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 230, 80, 30);
        loginButton.setFont(new Font("Arial",Font.BOLD,15));
        loginButton.addActionListener(this);

        JButton createAccountButton = new JButton("Create New Account");
        createAccountButton.setBounds(200, 230, 200, 30);
        createAccountButton.setFont(new Font("Arial",Font.BOLD,15));
        createAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CreateAccountPage create=new CreateAccountPage();
                setVisible(true);
                dispose();

            }
        });

        // Add components to the frame
        JPanel panel = new JPanel();
        panel.add(titleLabel);
        panel.setLayout(null);
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(createAccountButton);


        // Set background color
        panel.setBackground(new Color(176, 224, 230));

        // Display the frame
        setContentPane(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = userField.getText();
        String password = new String(passwordField.getPassword());

        // Perform login verification here
        // ...

        // If login is successful, open the BankOperationPage
        dispose(); // Close the current window
        BankOperation bankOperationPage = new BankOperation("ok bank");
        bankOperationPage.setVisible(true);
    }

    public static void main(String[] args) {
        new BankLoginPage();
    }
}
