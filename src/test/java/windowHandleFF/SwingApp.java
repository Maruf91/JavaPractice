package windowHandleFF;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApp extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String> dropdown1;
    private JComboBox<String> dropdown2;
    private JComboBox<String> dropdown3;

    public SwingApp() {
        // Set up the JFrame
        setTitle("Swing App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 200);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create the panel and set layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        // Create dropdown boxes
        JLabel label1 = new JLabel("Dropdown 1:");
        dropdown1 = new JComboBox<String>(new String[]{"Option 1", "Option 2", "Option 3", "Option 4"});
        JLabel label2 = new JLabel("Dropdown 2:");
        dropdown2 = new JComboBox<String>(new String[]{"Option 1", "Option 2", "Option 3", "Option 4"});
        JLabel label3 = new JLabel("Dropdown 3:");
        dropdown3 = new JComboBox<String>(new String[]{"Option 1", "Option 2", "Option 3", "Option 4"});

        // Create buttons
        JButton submitButton = new JButton("Submit");
        JButton alertButton = new JButton("Show Alert");

        // Add components to the panel
        panel.add(label1);
        panel.add(dropdown1);
        panel.add(label2);
        panel.add(dropdown2);
        panel.add(label3);
        panel.add(dropdown3);
        panel.add(submitButton);
        panel.add(alertButton);

        // Add action listener to submit button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedOption1 = (String) dropdown1.getSelectedItem();
                String selectedOption2 = (String) dropdown2.getSelectedItem();
                String selectedOption3 = (String) dropdown3.getSelectedItem();
                System.out.println("Selected Option 1: " + selectedOption1);
                System.out.println("Selected Option 2: " + selectedOption2);
                System.out.println("Selected Option 3: " + selectedOption3);
            }
        });

        // Add action listener to alert button
        alertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(SwingApp.this, "Alert!", "Alert Dialog", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Add the panel to the frame
        add(panel);

        // Set the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingApp();
            }
        });
    }
}
