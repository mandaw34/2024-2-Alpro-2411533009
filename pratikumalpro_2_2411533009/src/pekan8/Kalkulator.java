package pekan8;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


import javax.swing.JFrame;

public class Kalkulator {
	

	    private JFrame frame;
	    private JTextField display;
	    private double num1, num2, result;		
	    private String operator;

	    public static void main(String[] args) {
	        javax.swing.SwingUtilities.invokeLater(() -> {
	            try {
	                Kalkulator window = new Kalkulator();
	                window.frame.setVisible(true);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        });
	    }

	    public Kalkulator() {
	        initialize();
	    }

	    private void initialize() {
	        frame = new JFrame("Calculator");
	        frame.setBounds(100, 100, 300, 400);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().setLayout(new BorderLayout());

	        // Display
	        display = new JTextField();
	        display.setEditable(false);
	        display.setFont(new Font("Arial", Font.BOLD, 24));
	        frame.getContentPane().add(display, BorderLayout.NORTH);

	        // Button Panel
	        JPanel buttonPanel = new JPanel();
	        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));
	        frame.getContentPane().add(buttonPanel, BorderLayout.CENTER);

	        // Tombol angka dan operator
	        String[] buttons = {
	            "<", "C", "00", "+",
	            "7", "8", "9", "-",
	            "4", "5", "6", "×",
	            "1", "2", "3", "÷",
	            "0", ".", "=", "%" 
	        };

	        for (String text : buttons) {
	            JButton button = new JButton(text);
	            button.setFont(new Font("Arial", Font.BOLD, 18));
	            button.addActionListener(e -> onButtonPress(text));
	            buttonPanel.add(button);
	        }
	    }

	    private void onButtonPress(String text) {
	        try {
	            if (text.matches("\\d|\\.")) {
	                display.setText(display.getText() + text);
	            } else if (text.equals("00")) {
	                display.setText(display.getText() + "00");
	            } else if (text.matches("[+\\-×÷%]")) {
	                num1 = Double.parseDouble(display.getText());
	                operator = text;
	                display.setText("");
	            } else if ("=".equals(text)) {
	                num2 = Double.parseDouble(display.getText());
	                switch (operator) {
	                    case "+" -> result = num1 + num2;
	                    case "-" -> result = num1 - num2;
	                    case "×" -> result = num1 * num2;
	                    case "÷" -> result = num2 != 0 ? num1 / num2 : Double.NaN; 
	                    case "%" -> result = num1 % num2;
	                }
	                
	                if (result== (long) result) {
	                	display.setText(String.valueOf((long) result));
	                }else {
	                	display.setText(String.valueOf(result));
	                } 
	                
	            } else if ("C".equals(text)) {
	                display.setText("");
	                num1 = num2 = result = 0;
	                operator = null;
	            } else if ("<".equals(text)) {
	                String currentText = display.getText();
	                if (!currentText.isEmpty()) {
	                    display.setText(currentText.substring(0, currentText.length() - 1));
	                }
	            }
	        } catch (NumberFormatException e) {
	            display.setText("Error");
	        }
	    }
	}