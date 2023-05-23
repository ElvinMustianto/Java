import javax.swing.*;


public class latihan1 {
    private JButton btnLatihan;
    private JPanel jPanel;

    public latihan1() {
        btnLatihan.addActionListener(e -> {
            latihan2 next;
            next = new latihan2();
            JFrame jFrame = new JFrame("Latihan 2");

            jFrame.add(next.getjPanel());
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.pack();
            jFrame.setVisible(true);
            jFrame.setLocationRelativeTo(null);
            jFrame.setSize(400,200);

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
