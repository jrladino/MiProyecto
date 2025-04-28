package Herencias;

public class CarroHJ extends HerenciaSimple {
    // Atributos de la clase CarroHJ
    private String nombre;
    private String modelo;
    private String color;
    private int anio;
    private String motor;

    public CarroHJ(String nombre, String modelo, String color, int anio, String motor) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.motor = motor;
    }

    // Métodos de la clase CarroHJ
    public void moverse() {
        System.out.println("El " + this.nombre + " " + this.modelo + " se está " + run() + " con motor " + this.motor + ".");
    }

    public void detenerse() {
        System.out.println("El " + this.nombre + " " + this.modelo + " se ha " + stop() + " con motor " + this.motor + ".");
    }

    // Getters para acceder a los atributos
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
