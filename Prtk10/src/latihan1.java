import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

public class latihan1 {
    private JButton btnLatihan;
    private JPanel jPanel;

    public latihan1() {
        btnLatihan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                latihan2 next = new latihan2();
                JFrame jFrame = new JFrame("Latihan 2");

                jFrame.add(next.getjPanel());
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.pack();
                jFrame.setVisible(true);
                jFrame.setLocationRelativeTo(null);
                jFrame.setSize(400,200);
                try {
                    dispose();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Latihan 1");
        jFrame.setContentPane(new latihan1().jPanel);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setSize(400,200);
    }

    public JPanel getjPanel() {
        return jPanel;
    }
}
