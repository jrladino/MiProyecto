package Polimorfismo;

public class Bancolombia extends Banco {
    @Override
    public int getInteres(int monto) {
        return (int) (monto * 0.065); // Interés del 6.5%
    }
    public String getNombreBanco() {
        return "Bancolombia";
    }

}
