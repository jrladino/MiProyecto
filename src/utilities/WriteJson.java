package utilities;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJson {

    public static void main(String[] args) {
        // Create a JSON object
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "John Doe");
        jsonObject.put("age", 30);
        jsonObject.put("city", "New York");

        // Create a JSON array
        JSONArray jsonArray = new JSONArray();
        jsonArray.add("Java");
        jsonArray.add("Python");
        jsonArray.add("JavaScript");

        // Add the array to the JSON object
        jsonObject.put("languages", jsonArray);

        // Write JSON to file
        try (FileWriter file = new FileWriter("output.json")) {
            file.write(jsonObject.toJSONString());
            System.out.println("Successfully written JSON to file.");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}
