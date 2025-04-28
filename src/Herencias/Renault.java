package Herencias;

public class Renault extends CarroHJ{
    public Renault(String nombre, String modelo, String color, int anio, String motor) {
        super(nombre, modelo, color, anio, motor);
    }

    //haz un metodo que sea unico de la clase Renault
    public void modoEco() {
        System.out.println("El " + getNombre() + " " + getModelo() + " está en modo Eco.");
    }
}
