package Swings;
import javax.swing.*;
import java.awt.*;

public class ColorTabbedPane {
    public static void main(String[] args) {
        // Create the main JFrame
        JFrame frame = new JFrame("Color Tabbed Pane");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // RED tab
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        tabbedPane.addTab("RED", redPanel);

        // BLUE tab
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        tabbedPane.addTab("BLUE", bluePanel);

        // GREEN tab
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add the tabbed pane to the frame
        frame.add(tabbedPane);

        // Center and display the frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

