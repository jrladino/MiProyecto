package manejoExcepciones;

public class Excepciones {
    public static void main(String[] args) {
        try {
            // Intentar dividir por cero
            int resultado = 10;
            resultado = resultado / 0; // Esta línea no se ejecutará debido a la excepción
        } catch (ArithmeticException e) {
            // Capturar la excepción de división por cero
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            // Bloque finally que siempre se ejecuta
            System.out.println("Este bloque se ejecuta siempre, independientemente de si ocurre una excepción o no.");
        }
    }
}
