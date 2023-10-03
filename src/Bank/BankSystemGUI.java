package Bank;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankSystemGUI {

    private int balance = 0;

    private JFrame frame;
    private JPanel panel;
    private JLabel balanceLabel;
    private JTextField amountField;
    private JButton depositButton;
    private JButton withdrawButton;

    public BankSystemGUI() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Bank Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        balanceLabel = new JLabel("Balance: $" + balance);
        amountField = new JTextField(10);
        depositButton = new JButton("Deposit");
        depositButton.addActionListener(new DepositButtonListener());
        withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(new WithdrawButtonListener());

        panel = new JPanel();
        panel.add(balanceLabel);
        panel.add(amountField);
        panel.add(depositButton);
        panel.add(withdrawButton);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private void deposit(int amount) {
        balance += amount;
        balanceLabel.setText("Balance: $" + balance);
        amountField.setText("");
    }

    private void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            balanceLabel.setText("Balance: $" + balance);
            amountField.setText("");
        } else {
            JOptionPane.showMessageDialog(frame, "Insufficient balance", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private class DepositButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String amountString = amountField.getText();
            if (!amountString.isEmpty()) {
                int amount = Integer.parseInt(amountString);
                deposit(amount);
            }
        }
    }

    private class WithdrawButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String amountString = amountField.getText();
            if (!amountString.isEmpty()) {
                int amount = Integer.parseInt(amountString);
                withdraw(amount);
            }
        }
    }

    public static void main(String[] args) {
        BankSystemGUI gui = new BankSystemGUI();
    }
}



