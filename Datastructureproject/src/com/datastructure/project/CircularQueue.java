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

public class CircularQueue extends JFrame {
	public int r = -1; // Rear
	public int f = -1; // Front
	public int size;
	public int[] q;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sizee;
	private JTextField insertt;
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
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 715, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.size = size;
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(196, 10, 302, 43);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("SIZE");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1.setBounds(112, 131, 85, 28);
		contentPane.add(lblNewLabel_1);

		sizee = new JTextField();
		sizee.setBounds(247, 124, 155, 43);
		contentPane.add(sizee);
		sizee.setColumns(10);

		JButton btnNewButton = new JButton("CREATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size = Integer.parseInt(sizee.getText());
				q = new int[size];
				JOptionPane.showMessageDialog(null, "with size " + size + "Circular QUEUE HAS CREATED.");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(475, 129, 98, 32);
		contentPane.add(btnNewButton);

		insertt = new JTextField();
		insertt.setColumns(10);
		insertt.setBounds(247, 218, 155, 43);
		contentPane.add(insertt);

		JButton btnNewButton_1 = new JButton("INSERT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem = Integer.parseInt(insertt.getText());
				if ((r + 1) % size == f) { // Check if the queue is full
					JOptionPane.showMessageDialog(null, "Insertion not possible as queue is full");
				} else {
					if (f == -1) { // First element being inserted
						f = 0;
					}
					r = (r + 1) % size; // Circular increment
					q[r] = elem;
					JOptionPane.showMessageDialog(null, "Element " + elem + " inserted");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1.setBounds(475, 229, 98, 32);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("CLICK TO DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (f == -1) { // Check if the queue is empty
					JOptionPane.showMessageDialog(null, "Queue is empty, can't delete");
				} else {
					JOptionPane.showMessageDialog(null, "Element deleted is " + q[f]);
					if (f == r) { // Queue becomes empty after deletion
						f = -1;
						r = -1;
					} else {
						f = (f + 1) % size;
					}
				}
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_2.setBounds(247, 298, 166, 32);
		contentPane.add(btnNewButton_2);

		displayy = new JTextField();
		displayy.setColumns(10);
		displayy.setBounds(170, 348, 232, 52);
		contentPane.add(displayy);

		JButton btnNewButton_2_1 = new JButton("DISPLAY");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (f == -1) { // Queue is empty
					JOptionPane.showMessageDialog(null, "Queue is empty, there is nothing to display");
				} else {
					StringBuilder sb = new StringBuilder();
					sb.append("Queue: [");
					int i = f;
					while (true) {
						sb.append(q[i]);
						if (i == r) {
							break;
						}
						sb.append(", ");
						i = (i + 1) % size;
					}
					sb.append("]");
					displayy.setText(sb.toString());
				}
			}
		});
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_2_1.setBounds(475, 363, 98, 32);
		contentPane.add(btnNewButton_2_1);

		JButton btnNewButton_2_2 = new JButton("GO BACK");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				Datastruture tr = new Datastruture();
				tr.setVisible(true);
			}
		});
		btnNewButton_2_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_2_2.setBounds(281, 438, 98, 32);
		contentPane.add(btnNewButton_2_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\imag.jpg"));
		lblNewLabel_2.setBounds(-16, -14, 731, 484);
		contentPane.add(lblNewLabel_2);
	}

}
