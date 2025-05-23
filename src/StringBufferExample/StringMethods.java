package StringBufferExample;

public class StringMethods {
    public static void main(String[] args) {
        // Create a String object
        String str = "Hello World";
        
        // Convert to uppercase
        String upperStr = str.toUpperCase();
        
        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        
        // Get the length of the string
        int length = str.length();
        
        // Get a substring
        String subStr = str.substring(0, 5);
        
        // Replace a character
        String replacedStr = str.replace('o', 'a');

        //get the index of a character
        int index = str.indexOf('o');
        
        // Print results
        System.out.println("Original: " + str);
        System.out.println("Uppercase: " + upperStr);
        System.out.println("Lowercase: " + lowerStr);
        System.out.println("Length: " + length);
        System.out.println("Substring: " + subStr);
        System.out.println("Replaced: " + replacedStr);
        System.out.println("Index of 'o': " + index);
    }
}
