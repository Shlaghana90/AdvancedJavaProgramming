/*5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display them on console whenever the countries are selected on the list.*/


package Java;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Country JList Demo");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Array of countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        // Create JList
        JList<String> countryList = new JList<>(countries);
        countryList.setVisibleRowCount(8); // limit visible rows
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add list to scroll pane
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add listener for selection
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    java.util.List<String> selected = countryList.getSelectedValuesList();
                    System.out.println("Selected Countries: " + selected);
                }
            }
        });

        // Add components
        frame.add(new JLabel("Select Countries:"));
        frame.add(scrollPane);

        // Show frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
