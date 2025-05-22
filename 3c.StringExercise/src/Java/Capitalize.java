/*3c. String Exercise progams
Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/

package Java;

import java.util.Scanner;

public class Capitalize{
	  public static String capitalizeWords(String str) {
	        if (str == null || str.isEmpty()) {
	            return str;
	        }
	        
	        String[] words = str.split("\\s+");
	        StringBuilder capitalizedString = new StringBuilder();
	        
	        for (String word : words) {
	            if (!word.isEmpty()) {
	                capitalizedString.append(Character.toUpperCase(word.charAt(0)))
	                                 .append(word.substring(1).toLowerCase())
	                                 .append(" ");
	            }
	        }
	        
	        return capitalizedString.toString().trim();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        String result = capitalizeWords(input);
	        
	        System.out.println("Capitalized String: " + result);
	        
	        scanner.close();
	    }
}
