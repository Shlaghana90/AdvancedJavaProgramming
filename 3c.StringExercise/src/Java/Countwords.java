/*3c. String Exercise progams
Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/


package Java;

import java.util.Scanner;

public class Countwords{
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to count words: ");
        String input = scanner.nextLine();
        
        int wordCount = countWords(input);
        
        System.out.println("Word count: " + wordCount);
        
        scanner.close();
    }
    
}
