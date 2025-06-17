package utilities;

public class ReadPropierties {
    public static void main(String[] args) {
        // Example usage
        String filePath = "config.properties";
        String key = "exampleKey";

        String value = readProperty(filePath, key);
        System.out.println("Value for " + key + ": " + value);
    }

    public static String readProperty(String filePath, String key) {
        java.util.Properties properties = new java.util.Properties();
        try (java.io.FileInputStream inputStream = new java.io.FileInputStream(filePath)) {
            properties.load(inputStream);
            return properties.getProperty(key);
        } catch (java.io.IOException e) {
            System.err.println("Error reading property: " + e.getMessage());
            return null;
        }
    }
}
