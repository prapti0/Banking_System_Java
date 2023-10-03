
package Bank;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BillPaymentPage extends JFrame {
    private JLabel titleLabel, accountLabel, amountLabel;
    private JTextField accountField, amountField;
    private JButton payButton, backButton;

    public BillPaymentPage() {
        super("Bill Payment");

        // Create and set layout manager
        JPanel contentPane = new JPanel(new GridBagLayout());
        setContentPane(contentPane);

        // Create and add components to the content pane
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);
        c.gridx = 0;
        c.gridy = 0;

        titleLabel = new JLabel("Bill Payment");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        contentPane.add(titleLabel, c);

        c.gridy++;

        accountLabel = new JLabel("Account Number:");
        contentPane.add(accountLabel, c);

        accountField = new JTextField(20);
        contentPane.add(accountField, c);

        c.gridy++;

        amountLabel = new JLabel("Amount:");
        contentPane.add(amountLabel, c);

        amountField = new JTextField(20);
        contentPane.add(amountField, c);

        c.gridy++;

        payButton = new JButton("Pay");
        backButton=new JButton("Back");
        payButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add payment logic here
                JOptionPane.showMessageDialog(BillPaymentPage.this, "Payment successful!");
            }
        });
        contentPane.add(payButton, c);



        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BankOperation bp=new BankOperation("Ok Bank");
                bp.setVisible(true);
                dispose();
            }
        });
        contentPane.add(backButton, c);

        // Set frame properties
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300); // Set frame size to 400x300 pixels
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color(255, 255, 204)); // Set background color to a light yellow color
        setVisible(true);
    }

    public static void main(String[] args) {
        BillPaymentPage page = new BillPaymentPage();
    }
}
