package com.datastructure.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Datastruture  {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Datastruture window = new Datastruture();
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
	public Datastruture() {
		initialize();
	
	}
	

	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 937, 777);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATA  STRUCTURE");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel.setBounds(214, 10, 533, 88);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1_1 = new JButton("ARRAYS");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				ArraysFrame ai = new ArraysFrame();
				ai.setVisible(true);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1.setBounds(143, 146, 187, 72);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("STACKS");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				stackss st = new stackss();
				st.setVisible(true);
			frame.dispose();
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1_1.setBounds(605, 146, 187, 72);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("QUEUE");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Queuess que = new Queuess();
				que.setVisible(true);
			}
		});
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1_2.setBounds(143, 296, 187, 72);
		frame.getContentPane().add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_3 = new JButton("CIRCULAR QUEUE");
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				CircularQueue cq = new CircularQueue();
				cq.setVisible(true);
			}
		});
		btnNewButton_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_3.setBounds(605, 296, 187, 72);
		frame.getContentPane().add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_1_4 = new JButton("SINGLY LINKED  LIST");
		btnNewButton_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Singlyll sll = new Singlyll();
				sll.setVisible(true);
			}
		});
		btnNewButton_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_4.setBounds(143, 442, 215, 72);
		frame.getContentPane().add(btnNewButton_1_1_4);
		
		JButton btnNewButton_1_1_5 = new JButton("DOUBLY LINKED LIST");
		btnNewButton_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Doublyll dll = new Doublyll();
				dll.setVisible(true);
			}
		});
		btnNewButton_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1_5.setBounds(605, 442, 224, 72);
		frame.getContentPane().add(btnNewButton_1_1_5);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("W:\\TRACTURE.jpg"));
		lblNewLabel_1.setBounds(0, 10, 923, 730);
		frame.getContentPane().add(lblNewLabel_1);
	}

	  public void setVisible(boolean visible) {
	        frame.setVisible(visible);
	    }

	
}
