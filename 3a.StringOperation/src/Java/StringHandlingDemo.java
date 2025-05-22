package Java;
public class StringHandlingDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String s1 = "Hello";
        String s2 = "World";
        String s3 = new String("Java Programming");

        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
        System.out.println("String 3: " + s3);

        // 2. Length and Character Access
        System.out.println("\nLength of s3: " + s3.length());
        System.out.println("Character at index 5 of s3: " + s3.charAt(5));

        // 3. String Comparison
        String s4 = "hello";
        System.out.println("\nIs s1 equal to s4? " + s1.equals(s4));
        System.out.println("Is s1 equal to s4 (ignore case)? " + s1.equalsIgnoreCase(s4));

        // 4. String Searching
        System.out.println("\nDoes s3 contain 'Java'? " + s3.contains("Java"));
        System.out.println("Index of 'Programming' in s3: " + s3.indexOf("Programming"));

        // 5. Substring Operations
        String subStr = s3.substring(5, 16);
        System.out.println("\nSubstring from index 5 to 16: " + subStr);

        // 6. String Modification
        String modifiedStr = s3.replace("Java", "Python");
        System.out.println("After replace: " + modifiedStr);

        // 7. Whitespace Handling
        String withSpaces = "   Welcome to AIET   ";
        System.out.println("\nOriginal: '" + withSpaces + "'");
        System.out.println("Trimmed: '" + withSpaces.trim() + "'");

        // 8. String Concatenation
        String fullStr = s1 + " " + s2;
        System.out.println("\nConcatenated string: " + fullStr);

        // 9. String Splitting
        String colorList = "Red,Green,Blue,Yellow";
        String[] colors = colorList.split(",");
        System.out.println("\nColors from split:");
        for (String color : colors) {
            System.out.println(color);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to AIET");
        sb.insert(0, "Hello! ");
        System.out.println("\nStringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "John";
        int age = 21;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("\nFormatted string: " + formatted);

        // 12. Email Validation
        String email = "student@aiet.edu";
        System.out.println("\nValidating email: " + email);
        if (email.contains("@") && email.startsWith("student") && email.endsWith(".edu")) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is invalid.");
        }
    }
}

