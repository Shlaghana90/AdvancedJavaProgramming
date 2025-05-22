package String;

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
