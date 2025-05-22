package lab3;
import java.util.Scanner;

public class ex1 {
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
