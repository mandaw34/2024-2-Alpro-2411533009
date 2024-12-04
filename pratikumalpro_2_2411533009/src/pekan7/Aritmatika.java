package pekan7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aritmatika {

	private JFrame frmAritmatika;
	private JTextField A1;
	private JTextField A2;
	private JTextField A3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aritmatika window = new Aritmatika();
					window.frmAritmatika.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aritmatika() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAritmatika = new JFrame();
		frmAritmatika.setResizable(false);
		frmAritmatika.setTitle("Aritmatika");
		frmAritmatika.setBounds(100, 100, 353, 314);
		frmAritmatika.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAritmatika.getContentPane().setLayout(null);
		
		A1 = new JTextField();
		A1.setBounds(108, 11, 96, 20);
		A1.setHorizontalAlignment(SwingConstants.CENTER);
		frmAritmatika.getContentPane().add(A1);
		A1.setColumns(10);
		
		A2 = new JTextField();
		A2.setBounds(108, 115, 96, 20);
		A2.setHorizontalAlignment(SwingConstants.CENTER);
		frmAritmatika.getContentPane().add(A2);
		A2.setColumns(10);
		
		A3 = new JTextField();
		A3.setBounds(108, 170, 96, 20);
		A3.setHorizontalAlignment(SwingConstants.CENTER);
		frmAritmatika.getContentPane().add(A3);
		A3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Hasil");
		lblNewLabel.setBounds(108, 146, 96, 33);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmAritmatika.getContentPane().add(lblNewLabel);
		
		JComboBox OPcb = new JComboBox();
		OPcb.setBounds(138, 58, 30, 22);
		OPcb.setModel(new DefaultComboBoxModel(new String[] {"Pilih", "+", "-", "/", "*", "%"}));
		frmAritmatika.getContentPane().add(OPcb);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.setBounds(108, 209, 96, 28);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int A = Integer.parseInt(A1.getText());
				int B = Integer.parseInt(A2.getText());
				int op = OPcb.getSelectedIndex();
				
				int hasil;
				if(op==1) {
					hasil=A+B;
					A3.setText(String.valueOf(hasil));
				}
				if(op==2) {
					hasil=A-B;
					A3.setText(String.valueOf(hasil));
				}
				if(op==3) {
					hasil=A/B;
					A3.setText(String.valueOf(hasil));
				}
				if(op==4) {
					hasil=A*B;
					A3.setText(String.valueOf(hasil));
				}
				if(op==5) {
					hasil=A%B;
					A3.setText(String.valueOf(hasil));
				}
			}
		});
		frmAritmatika.getContentPane().add(btnNewButton);

	}
}
