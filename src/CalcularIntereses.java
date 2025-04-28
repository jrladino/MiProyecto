import Polimorfismo.Banco;
import Polimorfismo.Bancolombia;
import Polimorfismo.Davivienda;

public class CalcularIntereses {

    public static void main(String[] args) {
        Banco banco = new Banco();
        // Crear instancias de los bancos
        Davivienda davivienda = new Davivienda();
        Bancolombia bancolombia = new Bancolombia();

        int monto = 1000; // Monto a calcular el interés

        System.out.println("Interés en Banco: " + banco.getInteres(monto)); // Output: 50
        System.out.println("Interés en Davivienda: " + davivienda.getInteres(monto)); // Output: 70
        System.out.println("Interés en Bancolombia: " + bancolombia.getInteres(monto)); // Output: 60
    }

}
