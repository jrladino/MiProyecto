package StaticClass;

public class ClaseEstatica {

    // Atributo estático
    private static int contador = 0;

    // Constructor
    public ClaseEstatica() {
        System.out.println("Constructor 1 sin parámetros");
        contador++;
    }

    // Método estático
    public static int getContador() {
        return contador;
    }

    // Método de instancia
    public void resetContador() {
        contador = 0;
    }

    //crea 2 variales estaticas y 2 no estaticas
    private static int variableEstatica1;
    private static String variableEstatica2; 
    private int variableNoEstatica1;
    private String variableNoEstatica2;

    //haz una sobrecarga de constructores
    public ClaseEstatica(int numero) {
        System.out.println("Constructor 2 con un parámetro: " + numero);
    }
    public ClaseEstatica(int numero1, int numero2) {
        //Asigna los valores a las variables no estaticas
        this.variableNoEstatica1 = numero1;
        this.variableNoEstatica2 = String.valueOf(numero2); // Convierte el número a String
        System.out.println("Constructor 3 con dos parámetros: " + variableNoEstatica1 + ", " + variableNoEstatica2);
    }

    public ClaseEstatica(String nombre) {
        System.out.println("Constructor 4 con un parámetro String: " + nombre);
    }
        

    //haz dos metodos no estaticos
    public int metodoNoEstatico1() {
        System.out.println("Método no estático 1");
        int numero = 5; // Ejemplo de número
        int numero2 = 10; // Ejemplo de número
        System.out.println("Fin del método no estático 1 ");
        return numero + numero2; // Retorna la suma de los números

    }
    public String metodoNoEstatico2(String nombre) {
        System.out.println("Método no estático 2");
        String saludo = "Hola, " + nombre; // Crea un saludo
        System.out.println("Fin del método no estático 2 ");
        return saludo; // Retorna el saludo
    }

    //haz diferentes metodos estaticos que usen los constructores
    public static void metodoEstatico1() {
        System.out.println("Método estático 1");
        ClaseEstatica objeto = new ClaseEstatica();

        //usa el objeto creado para llamar a otro metodo estatico y asignar el resultado a una variable estatica
        variableEstatica1 = objeto.metodoNoEstatico1(); // Llama al método no estático
        System.out.println("Resultado del método no estático: " + variableEstatica1); // Imprime el resultado
        System.out.println("Fin del método estático 1 ");
        variableEstatica1 = 0; // Asigna 0 a la variable estática

    }
    public static void metodoEstatico2(String nombre) {
        System.out.println("Método estático 2");
        ClaseEstatica objeto = new ClaseEstatica(nombre); // Crea un objeto con el constructor que recibe un String
        variableEstatica2 = objeto.metodoNoEstatico2(nombre); // Llama al método no estático
        System.out.println("Resultado del método no estático: " + variableEstatica2); // Imprime el resultado
        System.out.println("Fin del método estático2  ");
        variableEstatica2 = null; // Asigna null a la variable estática
    }
    public static void metodoEstatico3(int numero1, int numero2) {
        System.out.println("Método estático 3");
        ClaseEstatica objeto = new ClaseEstatica(numero1, numero2); //Variable no estatica 1 = 15, variable no estatica 2 = 20
        //usa el objeto creado para llamar a otro metodo estatico y asignar el resultado a una variable estatica
        variableEstatica1 += objeto.metodoNoEstatico1(); // Llama al método no estático
        variableEstatica2 =objeto.metodoNoEstatico2(String.valueOf(variableEstatica1)); // Llama al método no estático
        System.out.println("Resultado del método no estático: " + variableEstatica1); // Imprime el resultado
        System.out.println("Resultado del método no estático: " + variableEstatica2); // Imprime el resultado
        System.out.println("Fin del método estático 3 ");
    }

}
