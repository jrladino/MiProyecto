package utilities;

public class WritePropierties {

    public static void main(String[] args) {
        // Example usage
        String filePath = "config.properties";
        String key = "exampleKey";
        String value = "exampleValue";

        writeProperty(filePath, key, value);
    }

    public static void writeProperty(String filePath, String key, String value) {
        java.util.Properties properties = new java.util.Properties();
        try (java.io.FileOutputStream outputStream = new java.io.FileOutputStream(filePath)) {
            properties.setProperty(key, value);
            properties.store(outputStream, null);
            System.out.println("Property written successfully.");
        } catch (java.io.IOException e) {
            System.err.println("Error writing property: " + e.getMessage());
        }
    }


}
