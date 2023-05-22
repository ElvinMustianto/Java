import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

public class latihan2 {
    private JButton btnLatihan;
    private JPanel jPanel;

    public latihan2() {
        btnLatihan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                latihan1 back = new latihan1();
                JFrame jFrame = new JFrame("Latihan 1");

                jFrame.add(back.getjPanel());
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.pack();
                jFrame.setVisible(true);
                jFrame.setLocationRelativeTo(null);
                jFrame.setSize(400, 200);
                try {
                    dispose();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
    }

    public JPanel getjPanel() {
        return jPanel;
    }
}
