package Bank;
import javax.swing.*;
import java.awt.*;

public class CreateAccountPage extends JFrame {

    private JLabel nameLabel, passwordLabel, panLabel, aadharLabel, emailLabel, addressLabel, pinLabel, branchLabel,titleLabel;
    private JTextField nameTextField, panTextField, aadharTextField, emailTextField, addressTextField, pinTextField;
    private JPasswordField passwordField;
    private JComboBox<String> branchComboBox;
    private JButton createButton, backButton;

    public CreateAccountPage() {
        // Set up the frame
        setTitle("Create New Account");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        setResizable(false); // Disable resizing of the frame

        // Create the labels




        nameLabel = new JLabel("Name:");
        passwordLabel = new JLabel("Password:");
        panLabel = new JLabel("PAN card number:");
        aadharLabel = new JLabel("Aadhar card number:");
        emailLabel = new JLabel("Email address:");
        addressLabel = new JLabel("Address:");
        pinLabel = new JLabel("Pin code:");
        branchLabel = new JLabel("Branch:");

        // Create the text fields
        nameTextField = new JTextField(20);
        passwordField = new JPasswordField(20);
        panTextField = new JTextField(20);
        aadharTextField = new JTextField(20);
        emailTextField = new JTextField(20);
        addressTextField = new JTextField(20);
        pinTextField = new JTextField(20);

        // Create the combo box for the branch selection
        String[] branches = {"select branch","Jalandhar","Phagwara","Banda","Badausa","Basti","Karwi"};
        branchComboBox = new JComboBox<>(branches);

        // Create the create and back buttons
        createButton = new JButton("Create");
        backButton = new JButton("Back");

        // Create the panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add padding

        // Add the components to the panel

        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(panLabel);
        panel.add(panTextField);
        panel.add(aadharLabel);
        panel.add(aadharTextField);
        panel.add(emailLabel);
        panel.add(emailTextField);
        panel.add(addressLabel);
        panel.add(addressTextField);
        panel.add(pinLabel);
        panel.add(pinTextField);
        panel.add(branchLabel);
        panel.add(branchComboBox);
        panel.add(createButton);
        panel.add(backButton);


        // Set the background color of the panel
        panel.setBackground(new Color(176, 224, 230));

        // Add the panel to the frame
        add(panel);

        // Set the frame to be visible
        setVisible(true);
        backButton.addActionListener(e -> {
            BankLoginPage bp= new BankLoginPage();
            bp.setVisible(true);
            dispose();


        });
        createButton.addActionListener(e ->
        {
            JOptionPane.showMessageDialog(this, "Account created  successfully!");
        });
    }
}
