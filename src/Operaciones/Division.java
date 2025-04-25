package Operaciones;

public class Division extends Operacion {
    @Override
    public int operar(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}
