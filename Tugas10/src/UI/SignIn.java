package UI;

import javax.swing.*;

public class SignIn {
    private JTextField textField1;
    private JTextField textField2;
    private JButton btnCreate;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JPanel panelRegis;
    private JPanel panelImageRegis;


    public SignIn() {
         btnCreate.addActionListener(e -> {
             Login login;
             login = new Login();

             JFrame frame = new JFrame("Login");
             frame.add(login.getPanelLogin());
             frame.setVisible(true);
             frame.pack();
         });
     }
    public JPanel getPanelRegis() {
        return panelRegis;
    }
}
