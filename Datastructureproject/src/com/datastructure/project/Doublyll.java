package com.datastructure.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Doublyll.Node;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Doublyll extends JFrame {
	static class Node {
		Node pl;
		int data;
		Node nl;
	}

	private Node first = null;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField insertt;
	private JTextField deletee;
	private JTextField displayy;

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
					Doublyll frame = new Doublyll();
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
	public Doublyll() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 869, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("DOUBLLY LINKED LIST");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(289, 10, 316, 42);
		contentPane.add(lblNewLabel);

		insertt = new JTextField();
		insertt.setBounds(85, 95, 279, 49);
		contentPane.add(insertt);
		insertt.setColumns(10);

		JButton btnNewButton = new JButton("INSERT FRONT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ele = Integer.parseInt(insertt.getText());
				Node n = new Node();
				n.pl = null;
				n.data = ele;
				n.nl = null;

				if (first == null) {
					first = n;
				} else {
					n.nl = first;
					first.pl = n;
					first = n;
				}
				JOptionPane.showMessageDialog(null, "Inserted " + ele + " at the front.");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(439, 102, 145, 35);
		contentPane.add(btnNewButton);

		JButton btnInsertRare = new JButton("INSERT RARE");
		btnInsertRare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem = Integer.parseInt(insertt.getText());
				Node n = new Node();
				n.pl = null;
				n.data = elem;
				n.nl = null;

				if (first == null) {
					first = n;
				} else {
					Node temp = first;
					while (temp.nl != null) {
						temp = temp.nl;
					}
					temp.nl = n;
					n.pl = temp;
				}
				JOptionPane.showMessageDialog(null, "Inserted " + elem + " at the rear.");
			}
		});
		btnInsertRare.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnInsertRare.setBounds(627, 102, 145, 35);
		contentPane.add(btnInsertRare);

		deletee = new JTextField();
		deletee.setColumns(10);
		deletee.setBounds(85, 195, 279, 49);
		contentPane.add(deletee);

		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (first == null) {
					JOptionPane.showMessageDialog(null, "display not possible");
				} else if (first.nl == null) {
					JOptionPane.showMessageDialog(null, "Elements deleted is " + first.data);
					first = null;
				} else {
					JOptionPane.showMessageDialog(null, "Elements deleted is " + first.data);
					first = first.nl;
					first.pl.nl = null;
					first.pl = null;
				}
			}
		});
		btnDeleteFront.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDeleteFront.setBounds(439, 201, 145, 35);
		contentPane.add(btnDeleteFront);

		JButton btnDeleteRare = new JButton("DELETE RARE");
		btnDeleteRare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (first == null) {
					JOptionPane.showMessageDialog(null, "display not possible");
				} else if (first.nl == null) {
					JOptionPane.showMessageDialog(null, "Elements deleted is " + first.data);
					first = null;
				} else {
					Node temp = first;
					while (temp.nl.nl != null) {
						temp = temp.nl;
					}
					JOptionPane.showMessageDialog(null, temp.nl.data + " Element deleted");
					temp.nl.pl = null;
					temp.nl = null;
				}
			}
		});
		btnDeleteRare.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDeleteRare.setBounds(627, 201, 145, 35);
		contentPane.add(btnDeleteRare);

		displayy = new JTextField();
		displayy.setColumns(10);
		displayy.setBounds(85, 292, 279, 49);
		contentPane.add(displayy);

		JButton btnDisplayFront = new JButton("DISPLAY FRONT");
		btnDisplayFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (first == null) {
					displayy.setText("List is empty.");
				} else {
					StringBuilder sb = new StringBuilder("[ ");
					Node temp = first;
					while (temp != null) {
						sb.append(temp.data).append(" ");
						temp = temp.nl;
					}
					sb.append("]");
					displayy.setText(sb.toString());
				}
			}
		});
		btnDisplayFront.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDisplayFront.setBounds(418, 298, 166, 35);
		contentPane.add(btnDisplayFront);

		JButton btnDisplayRare = new JButton("DISPLAY RARE");
		btnDisplayRare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (first == null) {
					displayy.setText("List is empty.");
				} else {
					StringBuilder sb = new StringBuilder("[ ");
					Node temp = first;
					while (temp.nl != null) {
						temp = temp.nl;
					}
					while (temp != null) {
						sb.append(temp.data).append(" ");
						temp = temp.pl;
					}
					sb.append("]");
					displayy.setText(sb.toString());
				}
			}
		});
		btnDisplayRare.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDisplayRare.setBounds(627, 298, 166, 35);
		contentPane.add(btnDisplayRare);

		JButton btnNewButton_1 = new JButton("GO BACK");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				Datastruture st = new Datastruture();
				st.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(356, 371, 120, 35);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\doubly.jpg"));
		lblNewLabel_1.setBounds(-16, 0, 882, 416);
		contentPane.add(lblNewLabel_1);
	}
}
