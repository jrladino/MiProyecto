package Condicionales;

public class CondicionalSi {

    public String condicionalSi(int numero) {
        if (numero > 0) {
            return "El "+numero+ " es positivo";
        } else if (numero < 0) {
            return "El "+numero+ " es negativo";
        } else {
            return "El "+numero+ " es cero";
        }
    }

}
