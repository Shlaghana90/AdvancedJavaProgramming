/*3c. String Exercise progams
Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/


package Java;

import java.util.Scanner;

public class Truncate{
	   public static String truncate(String str, int length) {
	        if (str == null || str.length() <= length) {
	            return str;
	        }
	        return str.substring(0, length) + "...";
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string to truncate: ");
	        String inputStr = scanner.nextLine();
	        
	        System.out.print("Enter max length: ");
	        int maxLength = scanner.nextInt();
	        
	        System.out.println("Truncated String: " + truncate(inputStr, maxLength));
	        
	        scanner.close();
	    }
}
