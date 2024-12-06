package pekan8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kuis2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi Razia Motor Online");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

       
        JLabel labelNama = new JLabel("Nama");
        labelNama.setBounds(30, 30, 100, 25);
        frame.getContentPane().add(labelNama);

        JTextField fieldNama = new JTextField();
        fieldNama.setBounds(150, 30, 200, 25);
        frame.getContentPane().add(fieldNama);

        JLabel labelUmur = new JLabel("Umur");
        labelUmur.setBounds(30, 70, 100, 25);
        frame.getContentPane().add(labelUmur);
        JTextField fieldUmur = new JTextField();
        fieldUmur.setBounds(150, 70, 200, 25);
        frame.getContentPane().add(fieldUmur);

        JLabel labelSim = new JLabel("SIM C");
        labelSim.setBounds(30, 110, 100, 25);
        frame.getContentPane().add(labelSim);

        String[] pilihanSim = {"Ya", "Tidak"};
        JComboBox<String> comboSim = new JComboBox<>(pilihanSim);
        comboSim.setEditable(true);
        comboSim.setEditable(false);
        comboSim.setBounds(150, 110, 200, 25);
        frame.getContentPane().add(comboSim);

      
        JButton btnProses = new JButton("Proses");
        btnProses.setBounds(80, 160, 100, 30);
        frame.getContentPane().add(btnProses);

      
        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(220, 160, 100, 30);
        frame.getContentPane().add(btnReset);


        JLabel labelOutput = new JLabel("");
        labelOutput.setBounds(30, 210, 340, 25);
        labelOutput.setForeground(Color.RED);
        frame.getContentPane().add(labelOutput);
   
        btnProses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = fieldNama.getText();
                String umurStr = fieldUmur.getText();
                String simC = (String) comboSim.getSelectedItem();

                try {
                    int umur = Integer.parseInt(umurStr);

                    if (umur < 17) { 
                        // Usia kurang dari 17, belum cukup umur
                        labelOutput.setText(nama + ", Anda belum cukup umur untuk bawa motor");
                    } else if ("Tidak".equals(simC)) { 
                        // Usia >= 17 tetapi tidak memiliki SIM
                        labelOutput.setText(nama + ", Anda belum memiliki SIM, tidak boleh membawa motor");
                    } else { 
                        // Usia >= 17 dan memiliki SIM
                        labelOutput.setText(nama + ", Anda sudah memenuhi syarat untuk membawa motor");
                    }
                } catch (NumberFormatException ex) {
                    labelOutput.setText("Umur harus berupa angka!");
                }
            }

        });
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldNama.setText("");
                fieldUmur.setText("");
                comboSim.setSelectedIndex(0);
                labelOutput.setText("");
            }
        });

        
        frame.setVisible(true);
    }
}
