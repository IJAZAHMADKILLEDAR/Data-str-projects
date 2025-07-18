package com.datastructure.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ArraysFrame extends JFrame {
	 private static int[] array; // Array for operations
	    private static int currentSize = 0; // Current size of the array

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField Elementss;
	private JTextField Positionn;
	private JTextField Delete;
	private JTextField Displayy;

	/**
	 * Launch the application.
	 */
	public  void close() {
		WindowEvent  closewindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closewindow);		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArraysFrame frame = new ArraysFrame();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ArraysFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 921, 696);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAYS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(286, 10, 346, 71);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SIZE:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(161, 121, 129, 30);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setBounds(313, 113, 302, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int size = Integer.parseInt(textField.getText());
	                array = new int[size];
	                JOptionPane.showMessageDialog(null,"Arrays " + array.length + " Has Created");
	        
			
			}
		});
		btnNewButton.setBounds(678, 116, 109, 48);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("ELEMENTS:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(10, 252, 129, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("POSITION:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_1_1.setBounds(422, 252, 129, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("POSITION:");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1_1_2.setBounds(204, 377, 129, 30);
		contentPane.add(lblNewLabel_1_1_2);
		
		Elementss = new JTextField();
		Elementss.setBounds(161, 243, 228, 53);
		contentPane.add(Elementss);
		Elementss.setColumns(10);
		
		Positionn = new JTextField();
		Positionn.setColumns(10);
		Positionn.setBounds(550, 243, 224, 53);
		contentPane.add(Positionn);
		
		Delete = new JTextField();
		Delete.setColumns(10);
		Delete.setBounds(343, 368, 228, 53);
		contentPane.add(Delete);
		
		JButton btnNewButton_1 = new JButton("DELETE");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int del = Integer.parseInt(Delete.getText());
				if(del >=0 && del <= array.length) {
					JOptionPane.showMessageDialog(null, "The Element Deleted At Position: " + del +" :Is " + array[del]);
					array[del] = 0;
				} else {
					JOptionPane.showMessageDialog(null, "Check The Position Try Again");
				}
				
			}
		});
		btnNewButton_1.setBounds(616, 368, 102, 49);
		contentPane.add(btnNewButton_1);
		
		Displayy = new JTextField();
		Displayy.setColumns(10);
		Displayy.setBounds(104, 482, 555, 71);
		contentPane.add(Displayy);
		
		JButton btnNewButton_1_1 = new JButton("DISPLAY");
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		Displayy.setText(Arrays.toString(array));
			}
		});
		btnNewButton_1_1.setBounds(732, 482, 117, 71);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Go Back");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
			Datastruture ta = new Datastruture();
		ta.setVisible(true);
				
			}
		});
		
		btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1_1_1.setBounds(386, 594, 129, 55);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2 = new JButton("INSERT");
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(Elementss.getText());
				int b = Integer.parseInt(Positionn.getText());
				if(b >= 0 && b<=array.length-1) {
					array[b]=a;
					JOptionPane.showMessageDialog(null,"Element " +a + " Has Inserted At Position At " +b);
				} else {
					JOptionPane.showMessageDialog(null,"Check The Length Of Array");
				}
			}
		});
		btnNewButton_1_2.setBounds(784, 247, 102, 49);
		contentPane.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\array.jpg"));
		lblNewLabel_2.setBounds(-14, 0, 921, 689);
		contentPane.add(lblNewLabel_2);
	}
}
