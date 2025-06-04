package manejoExcepciones;

public class Multicatch {
    public static void main(String[] args) {
        try {
            // Intentar dividir por cero
            int resultado = 10;
            resultado = resultado / 0; // Esta línea lanzará una ArithmeticException

            // Intentar convertir una cadena no numérica a entero
            String numeroStr = "abc";
            int numero = Integer.parseInt(numeroStr); // Esta línea lanzará una NumberFormatException
            System.out.println(numero);
        } catch (ArithmeticException | NumberFormatException e) {
            // Capturar múltiples excepciones en un solo bloque catch
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Bloque finally que siempre se ejecuta
            System.out.println("Este bloque se ejecuta siempre, independientemente de si ocurre una excepción o no.");
        }
    }
}
