package Herencias;

public class Ford extends HerenciaSimple {
    private String nombre;
    private String modelo;
    private String color;
    private int anio;
    private String motor;

    public Ford(String nombre, String modelo, String color, int anio, String motor) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.motor = motor;
    }

    public void moverse(String nombre, String modelo, String motor) {
        nombre = this.nombre;
        modelo = this.modelo;
        motor = this.motor;
        System.out.println("El "+ nombre + " "+ modelo + " se está " + run() + " con motor " + motor + ".");
    }

    public void detenerse(String nombre, String modelo, String motor) {
        nombre = this.nombre;
        modelo = this.modelo;
        motor = this.motor;
        System.out.println("El "+ nombre + " "+ modelo + " se ha " + stop() + " con motor " + motor + ".");
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public String getModelo() {
        return this.modelo;
    }

    public String getColor() {
        return this.color;
    }

    public int getAnio() {
        return this.anio;
    }

    public String getMotor() {
        return this.motor;
    }

}
