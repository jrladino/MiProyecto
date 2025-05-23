package StringBufferExample;

public class StringBuilderClass {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");
        
        // Append a string to the StringBuilder
        sb.append(" World");
        
        // Insert a string at a specific index
        sb.insert(5, ",");
        
        // Print the length of the StringBuilder
        System.out.println("Length: " + sb.length());
        
        // Print contents of the StringBuilder
        System.out.println("Contents: " + sb);
        
        // Delete a substring from the StringBuilder
        sb.delete(5, 6);
        
        // Reverse the contents of the StringBuilder
        sb.reverse();
        
        // Convert the StringBuilder to a string
        String result = sb.toString();
        
        // Print the result
        System.out.println("Reverse: " + result);
    }
}
