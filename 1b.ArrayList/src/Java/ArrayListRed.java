/*1.Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/
package Java;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRed {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<>();

        // Adding elements
        array1.addAll(Arrays.asList("Red", "Orange", "green", "blue"));

        // Searching if "Red" is there or not
        boolean element = array1.contains("Red");

        // Printing result
        System.out.println("Is 'Red' there or not? " + element);
    }
}
