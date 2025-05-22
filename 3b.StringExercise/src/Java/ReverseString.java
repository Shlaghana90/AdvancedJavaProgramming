/*3b. String Exercise progams
Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/

package Java;

import java.util.Scanner;

public class ReverseString {
 
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversedString = reverseString(input);
        
        System.out.println("Reversed string: " + reversedString);
        
        scanner.close();
    }
}
