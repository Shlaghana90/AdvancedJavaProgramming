/*3c. String Exercise progams
Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/

package Java;

import java.util.Scanner;

public class Numeric {
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to check if it's numeric: ");
        String input = scanner.nextLine();
        
        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string is not purely numeric.");
        }
        
        scanner.close();
    }
}
