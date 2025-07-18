package com.datastructure.project;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Singlyll extends JFrame {
	static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
	       

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField values;
	private JTextField display;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_1;
	private Node head; 
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 * 
	 */
	public  void close() {
		WindowEvent  closewindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closewindow);		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Singlyll frame = new Singlyll();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

private void addNode() {
	        try {
	            int value= Integer.parseInt(values.getText());
	            Node newNode = new Node(value);

	            if (head == null) {
	                head = newNode;
	            } else {
	                Node temp = head;
	                while (temp.next != null) {
	                    temp = temp.next;
	                }
	                temp.next = newNode;
	            }

	            JOptionPane.showMessageDialog(null,value + "add in list" );
	            values.setText("");
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(this, "Please enter a valid integer!");
	        }
	    }

	    // Method to delete a node from the list
	    private void deleteNode() {
	        try {
	            int value = Integer.parseInt(values.getText());

	            if (head == null) {
	                JOptionPane.showMessageDialog(this, "The list is empty.");
	                return;
	            }

	            if (head.data == value) {
	                head = head.next;
	                JOptionPane.showMessageDialog(null,value + " deleted from the list.\n");
	                values.setText("");
	                return;
	            }

	            Node temp = head, prev = null;
	            while (temp != null && temp.data != value) {
	                prev = temp;
	                temp = temp.next;
	            }

	            if (temp == null) {
	                JOptionPane.showMessageDialog(this, value + " not found in the list.");
	            } else {
	                prev.next = temp.next;
	                JOptionPane.showMessageDialog(null,value + " deleted from the list.\n");
	            }

	            values.setText("");
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(this, "Please enter a valid integer!");
	        }
	    }

	    // Method to display the list
	    private void displayList() {
	        if (head == null) {
	        	JOptionPane.showMessageDialog(null,"The list is empty.\n");
	            return;
	        }

	        StringBuilder sb = new StringBuilder("Linked List: [");
	        Node temp = head;
	        while (temp != null) {
	            sb.append(temp.data).append(" , ");
	            temp = temp.next;
	        }
	        sb.append(" ]");
display.setText(sb.toString());
	    }

	
	public Singlyll() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 769, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setBounds(257, 21, 251, 32);
		contentPane.add(lblNewLabel);
		
		values = new JTextField();
		values.setBounds(203, 93, 323, 52);
		contentPane.add(values);
		values.setColumns(10);
		
		JButton addnode = new JButton("ADD NODE");
		addnode.setFont(new Font("Times New Roman", Font.BOLD, 13));
		addnode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						addNode();	  
			}	
		});
		addnode.setBounds(214, 167, 101, 46);
		contentPane.add(addnode);
		
		display = new JTextField();
		display.setColumns(10);
		display.setBounds(133, 254, 393, 52);
		contentPane.add(display);
		
		btnNewButton_2 = new JButton("DISPLAY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayList();
						    }
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_2.setBounds(586, 261, 106, 37);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("GO BACK");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				close();
				Datastruture ar = new Datastruture();
				ar.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(308, 329, 101, 46);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_1 = new JButton("DELETE NODE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteNode();
			}	
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1.setBounds(385, 167, 123, 46);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\single.jpg"));
		lblNewLabel_1.setBounds(0, 0, 765, 386);
		contentPane.add(lblNewLabel_1);
	}
}
