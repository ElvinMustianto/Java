import javax.swing.*;


public class latihan2 {
    private JButton btnLatihan;
    private JPanel jPanel;

    public latihan2() {
        btnLatihan.addActionListener(e -> {
            latihan1 back;
            back = new latihan1();
            JFrame jFrame = new JFrame("Latihan 1");

            jFrame.add(back.getjPanel());
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.pack();
            jFrame.setVisible(true);
            jFrame.setLocationRelativeTo(null);
            jFrame.setSize(400, 200);
        });
    }

    public JPanel getjPanel() {
        return jPanel;
    }
}
