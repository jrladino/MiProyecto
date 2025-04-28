package Herencias;

public class Suzuki extends CarroHJ{
    public Suzuki(String nombre, String modelo, String color, int anio, String motor) {
        super(nombre, modelo, color, anio, motor);
    }

    //haz un metodo que sea unico de la clase Suzuki
    public void modoSport() {
        System.out.println("El " + getNombre() + " " + getModelo() + " está en modo Sport.");
    }

}
