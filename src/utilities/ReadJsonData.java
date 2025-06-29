package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;  
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonData {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            // Read the JSON file
            Object obj = parser.parse(new FileReader("testData.json"));
            JSONObject jsonObject = (JSONObject) obj;

            //System.out.println("JSON Data:" + jsonObject.toJSONString() + "\n");

            JSONArray testData = (JSONArray) jsonObject.get("testdata");

            // iterate through the test data array
            for ( int i= 0; i < testData.size(); i++) {
                // Get each test case from the JSON array
                JSONObject testCase = (JSONObject) testData.get(i);
                // Print the test case name
                System.out.println("Test Case is ->" + testCase.get("testName") + ":");
                
                // Print the test case description
                JSONArray steps = (JSONArray) testCase.get("data");
                
                // Iterate through the steps in the test case
                for (int j = 0; j < steps.size(); j++) {
                    // get each step from the JSON array
                    JSONObject step = (JSONObject) steps.get(j);
                    
                    // get the step key
                    @SuppressWarnings("unchecked")
                    Set<String> keys = step.keySet();
                    // create an iterator for the keys
                    Iterator<String> iterator = keys.iterator();

                    // Print each key-value pair in the step
                    while (iterator.hasNext()) {
                        String key = iterator.next();
                        Object value = step.get(key);
                        // Print the key-value pair
                        System.out.println("  " + key + ": " + value);
                    }

                }
            }


        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
