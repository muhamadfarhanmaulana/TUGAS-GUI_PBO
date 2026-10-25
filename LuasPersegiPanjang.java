import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class LuasPersegiPanjang extends JFrame implements ActionListener, FocusListener {
    
    private JLabel labelPanjang, labelLebar, labelHasil;
    private JTextField textPanjang, textLebar;
    private JButton btnHitung;
    private JPanel panelUtama;

    public LuasPersegiPanjang() {
        super("Aplikasi Hitung Luas - Tugas GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 220);
        setLocationRelativeTo(null);

        getContentPane().setLayout(new BorderLayout(10, 10));

        panelUtama = new JPanel();
        panelUtama.setLayout(new GridLayout(4, 2, 5, 10));

        labelPanjang = new JLabel("Panjang:");
        textPanjang = new JTextField();
        
        labelLebar = new JLabel("Lebar:");
        textLebar = new JTextField();
        
        btnHitung = new JButton("Hitung Luas");
        labelHasil = new JLabel("Hasil: 0");

        btnHitung.addActionListener(this);
        textPanjang.addFocusListener(this);

        panelUtama.add(labelPanjang);
        panelUtama.add(textPanjang);
        panelUtama.add(labelLebar);
        panelUtama.add(textLebar);
        panelUtama.add(new JLabel());
        panelUtama.add(btnHitung);

        getContentPane().add(panelUtama, BorderLayout.CENTER);
        getContentPane().add(labelHasil, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double p = Double.parseDouble(textPanjang.getText());
            double l = Double.parseDouble(textLebar.getText());
            double luas = p * l;
            labelHasil.setText("Hasil Luas: " + luas);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        textPanjang.setBackground(new Color(230, 242, 255));
    }

    @Override
    public void focusLost(FocusEvent e) {
        textPanjang.setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LuasPersegiPanjang().setVisible(true);
            }
        });
    }
}