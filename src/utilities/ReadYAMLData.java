package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;


public class ReadYAMLData {

    public static void main(String[] args) throws FileNotFoundException, YamlException {
        // Ruta del archivo YAML
        String filePath = System.getProperty("user.dir") + "//testData.yaml";

        // Abrir el archivo YAML
        FileReader file = new FileReader(filePath);

        //Crear un lector de YAML a partir del archivo
        YamlReader reader = new YamlReader(file);

        // leer el contenido del archivo YAML como Map con claves de tipo String y valores de tipo Object
        @SuppressWarnings("unchecked")
        Map<String, Object> testdata = (Map<String, Object>) reader.read();

        // Extrae la lista de casos de prueba bajo la clave testdata
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> testCases = (List<Map<String, Object>>) testdata.get("testdata");
        System.out.println("Todos los casos de prueba:");
        System.out.println(testCases);

        // Toma el primer caso de prueba de la lista
        Map<String, Object> firstTestCase = testCases.get(0);
        System.out.println("Primer caso de prueba:");
        System.out.println(firstTestCase.get("testName"));

        // Extrae la lsta de datos del primer caso de prueba
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> dataList = (List<Map<String, Object>>) firstTestCase.get("data");

        System.out.println("Datos del primer caso de prueba:");
        System.out.println(dataList);
        
    }

}
