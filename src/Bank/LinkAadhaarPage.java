package Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LinkAadhaarPage extends JFrame implements ActionListener {
    // Components
    private JLabel titleLabel;
    private JLabel aadhaarLabel;
    private JTextField aadhaarField;
    private JLabel bankAccLabel;
    private JTextField bankAccField;
    private JButton submitButton;
    private JButton backButton;

    public LinkAadhaarPage() {
        // Set window properties
        setTitle("Link Aadhaar to Bank Account");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        titleLabel = new JLabel("Link Aadhaar to Bank Account");
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
        aadhaarLabel = new JLabel("Aadhaar Number:");
        aadhaarLabel.setFont(new Font("Times New Roman",Font.PLAIN,18));
        aadhaarField = new JTextField(20);
        bankAccLabel = new JLabel("Bank Account Number:");
        bankAccLabel.setFont(new Font("Times New Roman",Font.PLAIN,18));
        bankAccField = new JTextField(20);
        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Times New Roman",Font.BOLD,18));

        submitButton.addActionListener(this);
        backButton = new JButton("Back");
        backButton.setFont(new Font("Times New Roman",Font.BOLD,18));
        backButton.addActionListener(this);

        // Set layout and add components to the window
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        panel.add(titleLabel, c);
        c.gridx = 0;
        c.gridy = 1;
        panel.add(aadhaarLabel, c);
        c.gridx = 1;
        c.gridy = 1;
        panel.add(aadhaarField, c);
        c.gridx = 0;
        c.gridy = 2;
        panel.add(bankAccLabel, c);
        c.gridx = 1;
        c.gridy = 2;
        panel.add(bankAccField, c);
        c.gridx = 0;
        c.gridy = 3;
        panel.add(submitButton, c);
        c.gridx = 1;
        c.gridy = 3;
        panel.add(backButton, c);
        panel.setBackground(new Color(176, 224, 230));

        // Set the panel as the content pane of the window
        setContentPane(panel);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Code to link Aadhaar card with bank account goes here
            JOptionPane.showMessageDialog(this, "Aadhaar card linked successfully!");
            // Clear the input fields
            aadhaarField.setText("");
            bankAccField.setText("");
        } else if (e.getSource() == backButton) {
            // Code to go back to the BankOperation page goes here
            BankOperation bankOpPage = new BankOperation("ok bank");
            bankOpPage.setVisible(true);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        // Create and show the page
        LinkAadhaarPage linkAadhaarPage = new LinkAadhaarPage();
        linkAadhaarPage.setVisible(true);
    }
}
