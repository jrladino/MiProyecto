package ArreglosAndStringOptions;

public class StringOptions {
    // genera varias variables string que contengan textos diferentes para realizar pruebas de comparacion y concatenacion

    private String texto1 = "Hola";
    private String texto2 = "Mundo";
    private String texto3 = "Hola Mundo";
    private String texto4 = "hola mundo";
    private String texto5 = "Hola_Mundo";

    private String pais = new String("Colombia");
    private String pais2 = new String("Colombia");  

    //METODO DE COMPARACION DE CADENAS pero recibiendo las cadenas por parametro
    public void compareStrings(String cadena1, String cadena2) {
        System.out.println(cadena1.equals(cadena2)); 
    }
    //metodo de comparacion de cadenas ignorando mayusculas y minusculas
    public void compareStringsIgnoreCase(String cadena1, String cadena2) {
        System.out.println(cadena1.equalsIgnoreCase(cadena2)); // true
    }

    //crear metodo que reciba dos cadenas y retorne varias formas de concatenar las cadenas incluyendo casos
    // no permitidos 
    // como concatenar cadenas con el operador + y el metodo concat
    // o cadenas en null
    public String concatenateStrings(String cadena1, String cadena2) {
        if(cadena2 == "null") {
            cadena2 = null;
        }

        //utiliza el metodo isEmptyOrNull para verificar individualmente si las cadenas son nulas o vacias
        boolean isEmptyOrNull1 = isEmptyOrNull(cadena1);
        boolean isEmptyOrNull2 = isEmptyOrNull(cadena2);

        // Concatenar cadenas con el operador +
        String concatenado1 = null;
        // Concatenar cadenas con el método concat
        String concatenado2 = null;
        // Concatenar cadenas en null
        String concatenado3 = null;

        //imprime el resultado de la verificacion de cadenas nulas o vacias
        System.out.println("La cadena 1 es null o vacia: " + isEmptyOrNull1);
        System.out.println("La cadena 2 es null o vacia: " + isEmptyOrNull2);

        //utiliza la verificacion de cadenas nulas o vacias para concatenar
        if(!isEmptyOrNull1 && !isEmptyOrNull2) {
            concatenado1 = cadena1 + " " + cadena2;
            concatenado2 = cadena1.concat(" ").concat(cadena2);
            concatenado3 = cadena1 + " " + cadena2;
        }  else if (isEmptyOrNull1) {
            concatenado1 = "La cadena 1 es null o vacia";
            concatenado2 = "La cadena 1 es null o vacia";
            concatenado3 = "La cadena 1 es null o vacia";
        } else if (isEmptyOrNull2) {
            concatenado1 = "La cadena 2 es null o vacia";
            concatenado2 = "La cadena 2 es null o vacia";
            concatenado3 = "La cadena 2 es null o vacia";
        } else
            concatenado1 = "Ambas cadenas son null o vacias";
            concatenado2 = "Ambas cadenas son null o vacias";
            concatenado3 = "Ambas cadenas son null o vacias";
            
        return concatenado1 + "\n" + concatenado2 + "\n" + concatenado3;
    }

    //implementa un metodo que me identifique si una cadena es vacia o nula y me retorne un booleano
    public boolean isEmptyOrNull(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        StringOptions options = new StringOptions();
        options.compareStrings(options.texto1, options.texto3); // false
        options.compareStringsIgnoreCase(options.texto3, options.texto4); //true

        // Comparar cadenas con el operador == (no recomendado)
        // porque el operador == compara la referencia de los objetos, no su contenido
        System.out.println(options.pais==options.pais2); 

        //utiliza el metodo concatenateStrings para concatenar las cadenas
        String resultadoConcatenacion = options.concatenateStrings(options.texto1, options.texto2);
        System.out.println("Resultado de la concatenación1:\n" + resultadoConcatenacion);
        resultadoConcatenacion = options.concatenateStrings(options.texto3, options.texto4);
        System.out.println("Resultado de la concatenación2:\n" + resultadoConcatenacion);
        resultadoConcatenacion = options.concatenateStrings(options.texto5, "null");
        System.out.println("Resultado de la concatenación3:\n" + resultadoConcatenacion);

        
    }
}
