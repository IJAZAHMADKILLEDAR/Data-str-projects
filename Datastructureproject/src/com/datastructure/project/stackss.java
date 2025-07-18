package com.datastructure.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class stackss extends JFrame {
	public static int stacks[]=null;
	public static int size = 0;
	public static int top=-1;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Size;
	private JTextField Push;
	private JTextField Display;

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
					stackss frame = new stackss();
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
	public stackss() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 764, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
this.size=size;
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(278, 24, 188, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SIZE");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(154, 114, 118, 25);
		contentPane.add(lblNewLabel_1);
		
		Size = new JTextField();
		Size.setBounds(296, 108, 170, 40);
		contentPane.add(Size);
		Size.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size = Integer.parseInt(Size.getText());
				stacks=new int[size];
				JOptionPane.showMessageDialog(null, "Stack " +size+ " got created");
			}
		});
		btnNewButton.setBounds(553, 112, 85, 31);
		contentPane.add(btnNewButton);
		
		Push = new JTextField();
		Push.setColumns(10);
		Push.setBounds(296, 192, 170, 40);
		contentPane.add(Push);
		
		JLabel lblNewLabel_1_1 = new JLabel("PUSH");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(154, 198, 118, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int insert = Integer.parseInt(Push.getText());
				if(top == size-1) {
					JOptionPane.showMessageDialog(null,"Stack is full push not possible");	
				} else {
					++top;
					stacks[top] = insert;
					JOptionPane.showMessageDialog(null, "Data is pushed in stack");
				}
			}
		});
		btnInsert.setBounds(553, 196, 85, 31);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("CLICK HERE TO POP");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(top==-1) {
					JOptionPane.showMessageDialog(null, "stack is Empty");
				} else {
					JOptionPane.showMessageDialog(null,stacks[top]);
					stacks[top]=0;
					--top;
				}
			}
		});
		btnDelete.setBounds(296, 267, 159, 31);
		contentPane.add(btnDelete);
		
		Display = new JTextField();
		Display.setBounds(262, 324, 233, 64);
		contentPane.add(Display);
		Display.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("TO DISPLAY");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(top==-1) {
					JOptionPane.showMessageDialog(null, "Stack is Empty");
				} else {
					for(int i= top;i>=0;i--) { 
						
						Display.setText(Arrays.toString(stacks));
					}
				}
			}
		});
		btnNewButton_1.setBounds(553, 337, 105, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("GO BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				Datastruture st = new Datastruture();
				st.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(315, 434, 121, 31);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\imag.jpg"));
		lblNewLabel_2.setBounds(-12, 0, 762, 465);
		contentPane.add(lblNewLabel_2);
	}
}
