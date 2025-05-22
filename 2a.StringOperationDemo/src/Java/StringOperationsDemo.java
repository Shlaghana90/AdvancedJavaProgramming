/*2 a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()*/

package Java;

public class StringOperationsDemo {
    public static void main(String[] args) {

        // Test with StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startBuffer = System.nanoTime();  // Start time
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append("AIET");
        }
        long endBuffer = System.nanoTime();  // End time
        long durationBuffer = endBuffer - startBuffer;

        // Test with StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startBuilder = System.nanoTime();  // Start time
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("AIET");
        }
        long endBuilder = System.nanoTime();  // End time
        long durationBuilder = endBuilder - startBuilder;

        // Display results
        System.out.println("Time taken using StringBuffer  : " + durationBuffer + " ns");
        System.out.println("Time taken using StringBuilder : " + durationBuilder + " ns");

        // Justification
        if (durationBuilder < durationBuffer) {
            System.out.println("\nConclusion: StringBuilder is faster than StringBuffer for single-threaded environments.");
        } else {
            System.out.println("\nConclusion: StringBuffer is slower due to synchronized methods. Use it only when thread-safety is needed.");
        }
    }
}
