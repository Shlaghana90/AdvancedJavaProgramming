/*4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/


package Java;

import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.*;

public class SwingExample {

    // Constructor to set up the GUI
    SwingExample() {
        // Create a new JFrame container
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Set initial size of the frame
        jfrm.setSize(600, 150);

        // Set default close operation
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout for the frame
        jfrm.setLayout(new FlowLayout());

        // Create a label with message
        JLabel jlab = new JLabel(" Hello! VI C, Welcome to Swing Programming!");

        // Set font and color for the label
        jlab.setFont(new Font("Verdana", Font.PLAIN, 24));
        jlab.setForeground(new Color(0, 0, 255)); // Blue text

        // Optional: set background color
        jfrm.getContentPane().setBackground(Color.LIGHT_GRAY);

        // Add the label to the frame
        jfrm.add(jlab);

        // Make the frame visible
        jfrm.setVisible(true);
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Run GUI code on Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingExample();
            }
        });
    }
}
