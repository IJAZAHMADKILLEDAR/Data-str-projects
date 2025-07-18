package org.eclipse.wb.swing;


import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

public class ArrayOperationsJFrame {
    private static int[] array; // Array for operations
    private static int currentSize = 0; // Current size of the array

    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Arrays");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLayout(null);

        // Title Label
        JLabel titleLabel = new JLabel("ARRAYS");
        titleLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
        titleLabel.setBounds(250, 10, 100, 30);
        frame.add(titleLabel);

        // Size Section
        JLabel sizeLabel = new JLabel("SIZE:");
        sizeLabel.setBounds(50, 60, 100, 30);
        frame.add(sizeLabel);

        JTextField sizeField = new JTextField();
        sizeField.setBounds(150, 60, 150, 30);
        frame.add(sizeField);

        JButton createButton = new JButton("CREATE");
        createButton.setBounds(350, 60, 120, 30);
        frame.add(createButton);

        // Elements and Position Section
        JLabel elementsLabel = new JLabel("ELEMENTS:");
        elementsLabel.setBounds(50, 120, 100, 30);
        frame.add(elementsLabel);

        JTextField elementsField = new JTextField();
        elementsField.setBounds(150, 120, 150, 30);
        frame.add(elementsField);

        JLabel positionLabel = new JLabel("POSITION:");
        positionLabel.setBounds(50, 180, 100, 30);
        frame.add(positionLabel);

        JTextField positionField = new JTextField();
        positionField.setBounds(150, 180, 150, 30);
        frame.add(positionField);

        JButton insertButton = new JButton("INSERT");
        insertButton.setBounds(350, 180, 120, 30);
        frame.add(insertButton);

        // Delete Section
        JLabel deletePositionLabel = new JLabel("POSITION:");
        deletePositionLabel.setBounds(50, 240, 100, 30);
        frame.add(deletePositionLabel);

        JTextField deletePositionField = new JTextField();
        deletePositionField.setBounds(150, 240, 150, 30);
        frame.add(deletePositionField);

        JButton deleteButton = new JButton("DELETE");
        deleteButton.setBounds(350, 240, 120, 30);
        frame.add(deleteButton);

        // Display Array Section
        JTextField displayArrayField = new JTextField();
        displayArrayField.setBounds(50, 300, 420, 30);
        displayArrayField.setEditable(false); // Make it non-editable
        frame.add(displayArrayField);

        JButton displayButton = new JButton("DISPLAY ARRAY");
        displayButton.setBounds(350, 340, 150, 30);
        frame.add(displayButton);

        // Go Back Button
        JButton goBackButton = new JButton("GO BACK");
        goBackButton.setBounds(230, 400, 120, 30);
        frame.add(goBackButton);

        // CREATE Button ActionListener
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int size = Integer.parseInt(sizeField.getText());
                    array = new int[size];
                    currentSize = 0;
                    displayArrayField.setText("Array created with size: " + size);
                } catch (NumberFormatException ex) {
                    displayArrayField.setText("Invalid size input!");
                }
            }
        });

        // INSERT Button ActionListener
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int element = Integer.parseInt(elementsField.getText());
                    int position = Integer.parseInt(positionField.getText());

                    if (array == null) {
                        displayArrayField.setText("Array not created yet!");
                        return;
                    }
                    if (position < 0 || position > currentSize || currentSize >= array.length) {
                        displayArrayField.setText("Invalid position!");
                        return;
                    }

                    // Shift elements to the right to insert
                    for (int i = currentSize; i > position; i--) {
                        array[i] = array[i - 1];
                    }
                    array[position] = element;
                    currentSize++;
                    displayArrayField.setText("Element inserted at position: " + position);
                } catch (NumberFormatException ex) {
                    displayArrayField.setText("Invalid input for insert!");
                }
            }
        });

        // DELETE Button ActionListener
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int position = Integer.parseInt(deletePositionField.getText());

                    if (array == null) {
                        displayArrayField.setText("Array not created yet!");
                        return;
                    }
                    if (position < 0 || position >= currentSize) {
                        displayArrayField.setText("Invalid position!");
                        return;
                    }

                    // Shift elements to the left to delete
                    for (int i = position; i < currentSize - 1; i++) {
                        array[i] = array[i + 1];
                    }
                    currentSize--;
                    array[currentSize] = 0; // Clear the last element
                    displayArrayField.setText("Element deleted at position: " + position);
                } catch (NumberFormatException ex) {
                    displayArrayField.setText("Invalid input for delete!");
                }
            }
        });

        // DISPLAY ARRAY Button ActionListener
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (array == null) {
                    displayArrayField.setText("Array not created yet!");
                } else {
                    displayArrayField.setText("Array: " + Arrays.toString(Arrays.copyOf(array, currentSize)));
                }
            }
        });

        // GO BACK Button ActionListener
        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the frame
                System.out.println("Go Back button clicked. Exiting...");
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
