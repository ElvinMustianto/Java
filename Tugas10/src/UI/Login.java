package UI;

import javax.swing.*;

public class Login {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton btnLogin;
    private JButton btnSignin;
    private JPanel panelLogin;
    private JLabel image;
    private JPanel panelImage;

    public Login() {
        btnLogin.addActionListener(e -> {
            Home home;
            home = new Home();

            JFrame frame = new JFrame("Home");
            frame.add(home.getPanelHome());
            frame.setVisible(true);
            frame.setEnabled(true);
            frame.pack();
        });
        btnSignin.addActionListener(e -> {
            SignIn signIn;
            signIn = new SignIn();

            JFrame frame = new JFrame("Sign In");
            frame.add(signIn.getPanelRegis());
            frame.setVisible(true);
            frame.setEnabled(true);
            frame.pack();
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().panelLogin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public JPanel getPanelLogin() {
        return panelLogin;
    }
}
