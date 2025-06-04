package manejoExcepciones;

import java.util.Scanner;

public class Excepciones2 {

    public static int pedirNumeroEntero() {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean numeroValido = false;
        while (!numeroValido) {
            System.out.print("Introduce un número entero: ");
            try {
                numero = Integer.parseInt(scanner.nextLine());
                numeroValido = true; // Si la conversión es exitosa, salimos del bucle
            } catch (NumberFormatException e) {
                // Capturar la excepción si el usuario no introduce un número entero válido
                System.out.println("Error: Debes introducir un número entero válido. Inténtalo de nuevo.");
            }
        }
        scanner.close(); // Cerrar el scanner para evitar fugas de recursos
        // Nota: En un programa real, no deberías cerrar el scanner si lo vas a usar más adelante.
        return numero; // Retornar el número entero válido
    }

    public static void main(String[] args) {
        // Llamar al método para pedir un número entero
        int numero = pedirNumeroEntero();
        System.out.println("Número introducido: " + numero);
    }
}
