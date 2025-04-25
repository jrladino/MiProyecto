package Polimorfismo;

public class Polimorfismo {
    public void sumar(int a, int b) {
        System.out.println("Suma de enteros: " + (a + b));
    }

    public void sumar(double a, double b) {
        System.out.println("Suma de decimales: " + (a + b));
    }

    public void sumar(int a, int b, int c) {
        System.out.println("Suma de tres enteros: " + (a + b + c));
    }
}