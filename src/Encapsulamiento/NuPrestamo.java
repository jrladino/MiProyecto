package Encapsulamiento;

public class NuPrestamo extends BancoPrestamo {

public NuPrestamo(String nombre, int edad, int cantidad) {
        super(nombre, edad, cantidad);
    }


public static void main(String[] args) {
    NuPrestamo prestamo = new NuPrestamo("Juan", 30, 5000);
    System.out.println("Nombre: " + prestamo.getNombre());
    System.out.println("Edad: " + prestamo.getEdad());
    System.out.println("Cantidad: " + prestamo.getCantidad());

    // Modificar los valores
    prestamo.setNombre("Pedro");
    prestamo.setEdad(35);
    prestamo.setCantidad(7000);

    System.out.println("Nombre modificado: " + prestamo.getNombre());
    System.out.println("Edad modificada: " + prestamo.getEdad());
    System.out.println("Cantidad modificada: " + prestamo.getCantidad());
}



}
