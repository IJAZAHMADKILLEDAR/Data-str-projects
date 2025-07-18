package org.eclipse.wb.swing;


	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class LinkedListGUI extends JFrame {
	    // Node class representing each element of the linked list
	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node head; // Head of the linked list
	    private JTextField inputField; // Input field for data
	    private JTextArea displayArea; // Text area to display the list
	    private JButton addButton, deleteButton, displayButton; // Buttons for actions

	    // Constructor to set up the GUI
	    public LinkedListGUI() {
	        setTitle("Singly Linked List");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());

	        // Input panel
	        JPanel inputPanel = new JPanel();
	        inputPanel.setLayout(new FlowLayout());

	        JLabel inputLabel = new JLabel("Enter Value:");
	        inputField = new JTextField(10);

	        addButton = new JButton("Add");
	        deleteButton = new JButton("Delete");
	        displayButton = new JButton("Display");

	        inputPanel.add(inputLabel);
	        inputPanel.add(inputField);
	        inputPanel.add(addButton);
	        inputPanel.add(deleteButton);
	        inputPanel.add(displayButton);
	        add(inputPanel, BorderLayout.NORTH);

	        // Display area
	        displayArea = new JTextArea();
	        displayArea.setEditable(false);
	        displayArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
	        add(new JScrollPane(displayArea), BorderLayout.CENTER);

	        // Add button listeners
	        addButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                addNode();
	            }
	        });

	        deleteButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                deleteNode();
	            }
	        });

	        displayButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                displayList();
	            }
	        });
	    }

	    // Method to add a node to the list
	    private void addNode() {
	        try {
	            int value = Integer.parseInt(inputField.getText());
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

	            displayArea.append(value + " added to the list.\n");
	            inputField.setText("");
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(this, "Please enter a valid integer!");
	        }
	    }

	    // Method to delete a node from the list
	    private void deleteNode() {
	        try {
	            int value = Integer.parseInt(inputField.getText());

	            if (head == null) {
	                JOptionPane.showMessageDialog(this, "The list is empty.");
	                return;
	            }

	            if (head.data == value) {
	                head = head.next;
	                displayArea.append(value + " deleted from the list.\n");
	                inputField.setText("");
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
	                displayArea.append(value + " deleted from the list.\n");
	            }

	            inputField.setText("");
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(this, "Please enter a valid integer!");
	        }
	    }

	    // Method to display the list
	    private void displayList() {
	        if (head == null) {
	            displayArea.append("The list is empty.\n");
	            return;
	        }

	        StringBuilder sb = new StringBuilder("Linked List: ");
	        Node temp = head;
	        while (temp != null) {
	            sb.append(temp.data).append(" -> ");
	            temp = temp.next;
	        }
	        sb.append("null\n");
	        displayArea.append(sb.toString());
	    }

	    // Main method to run the program
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            LinkedListGUI frame = new LinkedListGUI();
	            frame.setVisible(true);
	        });
	    }
	}


