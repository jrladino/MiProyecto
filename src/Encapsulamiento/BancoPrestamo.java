package Encapsulamiento;

public class BancoPrestamo {
    private String nombre;
    private int edad;
    private int cantidad;

    public BancoPrestamo(String nombre, int edad, int cantidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
