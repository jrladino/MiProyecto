package Polimorfismo;

public class Davivienda extends Banco {
    @Override
    public int getInteres(int monto) {
        return (int) (monto * 0.07); // Interés del 7%
    }
    public String getNombreBanco() {
        return "Davivienda";
    }

}
