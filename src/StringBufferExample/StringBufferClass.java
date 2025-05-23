package StringBufferExample;

public class StringBufferClass {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");
        
        // Append a string to the StringBuffer
        sb.append(" World");
        
        // Insert a string at a specific index
        sb.insert(5, ",");

        // Print the length of the StringBuffer
        System.out.println("Length: " + sb.length());

        //Print contents of the StringBuffer
        System.out.println("Contents: " + sb);
        
        // Delete a substring from the StringBuffer
        sb.delete(5, 6);
        
        // Reverse the contents of the StringBuffer
        sb.reverse();
        
        // Convert the StringBuffer to a string
        String result = sb.toString();
        
        // Print the result
        System.out.println("Reverse: " +result);
    }
}
