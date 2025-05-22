/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).*/

package Java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClockButtonDemo extends JFrame implements ActionListener {

    private JLabel messageLabel;
    private JButton digitalClockButton, hourGlassButton;

    public ClockButtonDemo() {
        setTitle("Clock Button UI");
        setSize(500, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Message label
        messageLabel = new JLabel(" ", SwingConstants.CENTER);
        messageLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        add(messageLabel, BorderLayout.NORTH);

        // Load and resize images (use double backslashes \\ or forward slashes /)
        ImageIcon digitalIcon = new ImageIcon("C:/Users/shlag/OneDrive/Pictures/Screenshots/clock digital.png");
        ImageIcon hourGlassIcon = new ImageIcon("C:/Users/shlag/OneDrive/Pictures/Screenshots/Glass.png");

        Image digitalImg = digitalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image hourImg = hourGlassIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        digitalClockButton = new JButton(new ImageIcon(digitalImg));
        hourGlassButton = new JButton(new ImageIcon(hourImg));

        digitalClockButton.setBorderPainted(false);
        hourGlassButton.setBorderPainted(false);

        digitalClockButton.addActionListener(this);
        hourGlassButton.addActionListener(this);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.decode("#f0f0f0"));
        buttonPanel.add(digitalClockButton);
        buttonPanel.add(Box.createHorizontalStrut(30)); // spacing
        buttonPanel.add(hourGlassButton);

        add(buttonPanel, BorderLayout.CENTER);
        getContentPane().setBackground(Color.decode("#f0f0f0")); // Background color

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == digitalClockButton) {
            messageLabel.setText("You have pressed digital clock!");
        } else if (e.getSource() == hourGlassButton) {
            messageLabel.setText("You have pressed hour glass!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ClockButtonDemo::new);
    }
}
