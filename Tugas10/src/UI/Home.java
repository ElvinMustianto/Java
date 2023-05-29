package UI;

import javax.swing.*;

public class Home {
    private JPanel panelHome;
    private JButton btnLogout;

    public Home() {
        btnLogout.addActionListener(e -> {
            JFrame frame = new JFrame();

            frame.setContentPane(new Home().panelHome);
            frame.pack();
            frame.setVisible(true);
            frame.dispose();
        });

    }

    public JPanel getPanelHome() {
        return panelHome;
    }
}
