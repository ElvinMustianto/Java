import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktikumOop9 {
    private JTextField txtNama;
    private JButton btnCek;
    private JButton btnKeluar;
    private JLabel lblTampilan;
    private JPanel isiNamaPanel;

    public praktikumOop9() {
        btnCek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblTampilan.setText("Nama Saya " + txtNama.getText()+ " ,Selamat datang di belajar OOP Java.");
            }
        });
        btnKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Isi nama ");
        frame.setContentPane(new praktikumOop9().isiNamaPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
