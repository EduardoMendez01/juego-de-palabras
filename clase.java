import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.Timer;
import javax.swing.JButton;

public class clase {

	private JFrame frame;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_26;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_1_1;
	private JLabel lblNewLabel_27;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_29;

	private JFrame Frame;
	private JOptionPane optionPane;
	Random rand = new Random();
	ArrayList<JLabel> labels = new ArrayList<JLabel>(); 
	
	private final String[] palabrasPosibles = {"JAVA", "SWING", "TECLADO", "COLOR", "LETRA", "FONDO","MOUSEPAD","COMPUTADORA","MOUSE","MONITOR"};
	private JLabel lblNewLabel_30;
	private JTextField textField;
	private JButton btnNewButton_2;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clase window = new clase();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public clase() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 726, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 textField = new JTextField();
		 textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		 textField.setForeground(new Color(255, 255, 255));
		 textField.setBackground(new Color(0, 128, 64));
		 frame.add(textField, BorderLayout.CENTER);
		 textField.setColumns(10);
		    
		frame.addKeyListener(new KeyListener() {

			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
				
				char ch3 = Character.toUpperCase(e.getKeyChar());
				textField.setText(textField.getText() + ch3);
				
				String  s=String.valueOf(ch3);
				
				System.out.println(s);
				
				for (Iterator iterator = labels.iterator(); iterator.hasNext();) {
					JLabel jLabel = (JLabel) iterator.next();
					
					if(jLabel.getText().equals(s)) {
						float r = rand.nextFloat();
						float g = rand.nextFloat();
						float b = rand.nextFloat();
						
						Color randomColor = new Color(r, g, b);
						jLabel.setBackground(randomColor);
					}else {
						jLabel.setBackground(Color.gray);
					}
					
					
				}
				
			
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		frame.setFocusable(true);
		frame.requestFocus();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 64));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_27 = new JLabel("Palabra a escribir");
		lblNewLabel_27.setForeground(new Color(0, 0, 0));
		lblNewLabel_27.setBackground(new Color(0, 128, 64));
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblNewLabel_27, BorderLayout.SOUTH);
		
		lblNewLabel_28 = new JLabel(palabrasPosibles[rand.nextInt(palabrasPosibles.length)]);
		lblNewLabel_28.setForeground(new Color(255, 255, 255));
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel.add(lblNewLabel_28, BorderLayout.WEST);
		
		lblNewLabel_29 = new JLabel("0");
		lblNewLabel_29.setForeground(new Color(255, 255, 255));
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel_29, BorderLayout.EAST);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(0, 128, 64));
		panel.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		
		//
		

		
		int[] contador = {0}; 
		Timer timer = new Timer(1000, new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        contador[0]++;
		        lblNewLabel_29.setText(Integer.toString(contador[0]));
		    }
		});
		timer.start();


		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 64));
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		btnNewButton = new JButton("ESPACIO");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		
		btnNewButton_1 = new JButton("BORRANDO");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_1);
		//
		
		btnNewButton_2 = new JButton("ENVIAR");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String palabraAEscribir = lblNewLabel_28.getText();
				String palabraEscrita = textField.getText().trim().toUpperCase();
			    String contadorletra = lblNewLabel_29.getText();
				if (palabraAEscribir.equalsIgnoreCase(palabraEscrita)) {
			        JOptionPane.showMessageDialog(frame, "¡Felicidades! Has escrito la palabra correctamente en: "+contadorletra+" segundos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			    }else {
			    	JOptionPane.showMessageDialog(frame, "no escribiste bien la frase", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			    }
				contador[0] = 0;
		        lblNewLabel_29.setText("0");
		        lblNewLabel_28.setText(palabrasPosibles[rand.nextInt(palabrasPosibles.length)]);
		        //
		        timer.start();
			}
			
		});
		
		
		//
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 128, 128));
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(3, 9, 0, 0));
		
		lblNewLabel_1 = new JLabel("Q");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBackground(new Color(128, 128, 128));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setOpaque(true);
		panel_2.add(lblNewLabel_1);
		labels.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("W");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBackground(new Color(128, 128, 128));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setOpaque(true);
		panel_2.add(lblNewLabel_2);
		labels.add(lblNewLabel_2);
		
		lblNewLabel_6 = new JLabel("E");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBackground(new Color(128, 128, 128));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setOpaque(true);
		panel_2.add(lblNewLabel_6);
		labels.add(lblNewLabel_6);
		
		lblNewLabel_4 = new JLabel("R");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBackground(new Color(128, 128, 128));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setOpaque(true);
		panel_2.add(lblNewLabel_4);
		labels.add(lblNewLabel_4);
		
		lblNewLabel_12 = new JLabel("T");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_12.setBackground(new Color(128, 128, 128));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setOpaque(true);
		panel_2.add(lblNewLabel_12);
		labels.add(lblNewLabel_12);
		
		lblNewLabel_15 = new JLabel("Y");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_15.setBackground(new Color(128, 128, 128));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setOpaque(true);
		panel_2.add(lblNewLabel_15);
		labels.add(lblNewLabel_15);
		
		lblNewLabel_18 = new JLabel("U");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_18.setBackground(new Color(128, 128, 128));
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setOpaque(true);
		panel_2.add(lblNewLabel_18);
		labels.add(lblNewLabel_18);
		
		lblNewLabel_21 = new JLabel("I");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_21.setBackground(new Color(128, 128, 128));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setOpaque(true);
		panel_2.add(lblNewLabel_21);
		labels.add(lblNewLabel_21);
		
		lblNewLabel_24 = new JLabel("O");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_24.setBackground(new Color(128, 128, 128));
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_24.setOpaque(true);
		panel_2.add(lblNewLabel_24);
		labels.add(lblNewLabel_24);
		
		lblNewLabel_22 = new JLabel("P");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_22.setBackground(new Color(128, 128, 128));
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setOpaque(true);
		panel_2.add(lblNewLabel_22);
		labels.add(lblNewLabel_22);
		
		lblNewLabel_19 = new JLabel("A");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_19.setBackground(new Color(128, 128, 128));
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setOpaque(true);
		panel_2.add(lblNewLabel_19);
		labels.add(lblNewLabel_19);
		
		lblNewLabel_13 = new JLabel("S");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_13.setBackground(new Color(128, 128, 128));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setOpaque(true);
		panel_2.add(lblNewLabel_13);
		labels.add(lblNewLabel_13);
		
		lblNewLabel_3 = new JLabel("D");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBackground(new Color(128, 128, 128));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setOpaque(true);
		panel_2.add(lblNewLabel_3);
		labels.add(lblNewLabel_3);
		
		lblNewLabel_30 = new JLabel("F");
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_30.setBackground(new Color(128, 128, 128));
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_30.setOpaque(true);
		panel_2.add(lblNewLabel_30);
		labels.add(lblNewLabel_30);
		
		lblNewLabel = new JLabel("G");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		panel_2.add(lblNewLabel);
		labels.add(lblNewLabel);
		
		lblNewLabel_9 = new JLabel("H");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBackground(new Color(128, 128, 128));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setOpaque(true);
		panel_2.add(lblNewLabel_9);
		labels.add(lblNewLabel_9);
		
		lblNewLabel_5 = new JLabel("J");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBackground(new Color(128, 128, 128));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setOpaque(true);
		panel_2.add(lblNewLabel_5);
		labels.add(lblNewLabel_5);
		
		lblNewLabel_7 = new JLabel("K");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBackground(new Color(128, 128, 128));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setOpaque(true);
		panel_2.add(lblNewLabel_7);
		labels.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("L");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBackground(new Color(128, 128, 128));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setOpaque(true);
		panel_2.add(lblNewLabel_8);
		labels.add(lblNewLabel_8);
		
		lblNewLabel_10 = new JLabel("Z");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setBackground(new Color(128, 128, 128));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setOpaque(true);
		panel_2.add(lblNewLabel_10);
		labels.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("X");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_11.setBackground(new Color(128, 128, 128));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setOpaque(true);
		panel_2.add(lblNewLabel_11);
		labels.add(lblNewLabel_11);
		
		lblNewLabel_14 = new JLabel("C");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_14.setBackground(new Color(128, 128, 128));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setOpaque(true);
		panel_2.add(lblNewLabel_14);
		labels.add(lblNewLabel_14);
		
		lblNewLabel_16 = new JLabel("V");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_16.setBackground(new Color(128, 128, 128));
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setOpaque(true);
		panel_2.add(lblNewLabel_16);
		labels.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("B");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_17.setBackground(new Color(128, 128, 128));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setOpaque(true);
		panel_2.add(lblNewLabel_17);
		labels.add(lblNewLabel_17);
		
		lblNewLabel_20 = new JLabel("N");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_20.setBackground(new Color(128, 128, 128));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setOpaque(true);
		panel_2.add(lblNewLabel_20);
		labels.add(lblNewLabel_20);
		
		lblNewLabel_23 = new JLabel("M");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_23.setBackground(new Color(128, 128, 128));
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setOpaque(true);
		panel_2.add(lblNewLabel_23);
		labels.add(lblNewLabel_23);
		
		lblNewLabel_25 = new JLabel(";");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_25.setBackground(new Color(128, 128, 128));
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25.setOpaque(true);
		panel_2.add(lblNewLabel_25);
		labels.add(lblNewLabel_25);
		
		lblNewLabel_26 = new JLabel(".");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_26.setBackground(new Color(128, 128, 128));
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26.setOpaque(true);
		panel_2.add(lblNewLabel_26);
		labels.add(lblNewLabel_26);
	}

}




