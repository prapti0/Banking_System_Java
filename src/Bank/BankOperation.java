package Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankOperation extends JFrame {
    private double balance = 50000;
    private JLabel balanceLabel;
    private JLabel titleLabel, nameLabel, amountLabel, billerLabel;
    private JTextField nameField, amountField, billerField;
    private JButton payButton, backButton;

    public BankOperation(String title) {
        super(title);
        getContentPane().setBackground(new Color(176, 224, 230));

        JLabel titleLabel = new JLabel("Bank Operation ");
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
        titleLabel.setBounds(150, 10, 400, 50);

        // Set up UI components
        JButton depositButton = new JButton("Deposit");
        depositButton.setBounds(50, 100, 100, 40);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(200, 100, 100, 40);

        JButton balanceButton = new JButton("Check Balance");
        balanceButton.setBounds(350, 100, 150, 40);

        JButton orderChequeBookButton = new JButton("Order Cheque Book");
        orderChequeBookButton.setBounds(50, 200, 150, 40);

        JButton LinkAadhaar = new JButton("LinkAadhaar");
        LinkAadhaar.setBounds(230, 200, 150, 40);

        JButton BillPayment =new JButton("Bill Payment");
        BillPayment.setBounds(400,200,150,40);




        JButton backButton = new JButton("Back");
        backButton.setBounds(250, 300, 100, 40);


        // Add components to frame
        add(titleLabel);
        add(depositButton);
        add(withdrawButton);
        add(balanceButton);
        //add(balanceLabel);
        add(backButton);
        add(orderChequeBookButton);
        add(LinkAadhaar);
        add(BillPayment);


        // Set up event handlers
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double depositAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to deposit:"));
                balance += depositAmount;
                balanceLabel.setText("Current balance: Rs" + balance);
                JOptionPane.showMessageDialog(null, "Rs" + depositAmount + " deposited successfully!");
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double withdrawalAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to withdraw:"));
                if (withdrawalAmount <= balance) {
                    balance -= withdrawalAmount;
                    balanceLabel.setText("Current balance: Rs" + balance);
                    JOptionPane.showMessageDialog(null, "$" + withdrawalAmount + " withdrawn successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient balance!");
                }
            }
        });

        balanceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Your current balance is $" + balance);
            }
        });
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BankLoginPage bankLoginPage = new BankLoginPage();
                setVisible(true);
                dispose();
            }
        });
        LinkAadhaar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LinkAadhaarPage ln=new LinkAadhaarPage();
                ln.setVisible(true);
                dispose();
            }
        });
        BillPayment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BillPaymentPage bp=new BillPaymentPage();
                bp.setVisible(true);
                dispose();


            }
        });
        orderChequeBookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create panel with input fields
                JPanel orderPanel = new JPanel();
                orderPanel.setLayout(new GridLayout(4, 5));

                JLabel nameLabel = new JLabel("Name:");
                JTextField nameField = new JTextField();
                nameField.setBounds(50,100,100,200);

                JLabel addressLabel = new JLabel("Address:");

                JTextField addressField = new JTextField();
                addressField.setBounds(50,150,100,200);

                orderPanel.add(nameLabel);
                orderPanel.add(nameField);
                orderPanel.add(addressLabel);
                orderPanel.add(addressField);


                // Create submit button and add event handler
                JButton submitButton = new JButton("Submit");
                submitButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String name = nameField.getText();
                        String address = addressField.getText();
                        if(name.equals("")&&address.equals(""))
                        {
                            JOptionPane.showMessageDialog(null, "Kindly Provide details");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Thank you, " + name + ", your cheque book will be delivered to " + address + ".");
                        }
                    }
                });
                orderPanel.add(submitButton);

                // Show panel in a dialog
                JOptionPane.showOptionDialog(null, orderPanel, "Order Cheque Book", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
            }

        });







    // Set frame properties
        setSize(600, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BankOperation("Ok Bank");
    }
}
