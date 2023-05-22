import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tugas9 {
    private JButton button1;
    private JButton button2;
    private JLabel txtBatuk;
    private JLabel txtCuci;
    private JPanel jPanel;
    private JTextArea textArea1;
    private JTextArea textArea2;


    public tugas9() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtBatuk();
                praktikumOop9 praktikumOop9 = new praktikumOop9();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCuci();
            }
        });
    }

    private void txtBatuk() {
        textArea1.setText("Etika Batuk\n" +
                "1. Jangan batuk sembarangan\n" +
                "2. Tutup hidung dan mulut\n" +
                "3. Gunakan tisu saat batuk dan buang\n" +
                "4. Pakai masker ketika sedang batuk agar tidak menyebar terus ke orang lain");
    }
    private void txtCuci() {
        textArea2.setText("cuci Tangan\n" +
                "1. Telapak tangan\n" +
                "2. Punggung tangan\n" +
                "3. Sela-sela jari\n" +
                "4. Kunci jari tangan\n" +
                "5. Putar ibu jari dalam genggaman\n" +
                "6. Putar-putar ujung jari pada telapak tangan");
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new tugas9().jPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
