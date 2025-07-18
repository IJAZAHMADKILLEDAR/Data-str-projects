package com.datastructure.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Queuess extends JFrame {
	public static int f=-1;
	public static int r=-1;
	public static int size=0;
	public static int[] st = null;

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
					Queuess frame = new Queuess();
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
	public Queuess() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 716, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
          this.size=size;
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(247, 24, 195, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SIZE");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(144, 118, 96, 30);
		contentPane.add(lblNewLabel_1);
		
		sizee = new JTextField();
		sizee.setBounds(250, 115, 162, 33);
		contentPane.add(sizee);
		sizee.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.parseInt(sizee.getText());
				st=new int[size];
				JOptionPane.showMessageDialog(null,"Queue " + size +" Created");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(459, 114, 96, 34);
		contentPane.add(btnNewButton);
		
		insertt = new JTextField();
		insertt.setColumns(10);
		insertt.setBounds(250, 194, 162, 33);
		contentPane.add(insertt);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem =Integer.parseInt(insertt.getText());
				if(r==size-1) {
					JOptionPane.showMessageDialog(null, "Queue is full");
				} else {
					++r;
					st[r]=elem;
					JOptionPane.showMessageDialog(null, "Element inserted. ");
				}
			}
		});
		btnInsert.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnInsert.setBounds(459, 194, 96, 34);
		contentPane.add(btnInsert);
		
		JButton btnClickHereTo = new JButton("CLICK HERE TO DELETE");
		btnClickHereTo.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r==-1|| f==size-1) {
					JOptionPane.showMessageDialog(null,"Queue is Empty");
				} else {
					++f;
					JOptionPane.showMessageDialog(null, "Elements Deleted " + st[f]);
					st[f]=0;
				}
			}
		});
		btnClickHereTo.setBounds(247, 272, 195, 34);
		contentPane.add(btnClickHereTo);
		
		displayy = new JTextField();
		displayy.setBounds(144, 338, 268, 43);
		contentPane.add(displayy);
		displayy.setColumns(10);
		
		JButton btnNewButton_1_1 = new JButton("DISPLAY");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r==-1||f==size-1) {
					JOptionPane.showMessageDialog(null,"Queue is Empty. ");
				} else {
					for(int i=0;i<=r;i++) {
						displayy.setText(Arrays.toString(st));
					}
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1_1.setBounds(459, 342, 96, 34);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Go Back");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
				Datastruture tr = new Datastruture();
				tr.setVisible(true);
			}
		});
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_2_1.setBounds(288, 417, 106, 34);
		contentPane.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lenovo\\Desktop\\imag.jpg"));
		lblNewLabel_2.setBounds(-21, -15, 734, 500);
		contentPane.add(lblNewLabel_2);
	}

}
