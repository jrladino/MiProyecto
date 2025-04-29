package Herencias;

public class Mazda extends Carro {

    String nombre = "Mazda";

    public void getNombre() {
        System.out.println("El nombre del carro es: " + nombre);
        System.out.println(super.nombre);
    }

    public void run() {
        System.out.println("El Mazda está transitando.");
        super.run(); // Llama al método run() de la clase Carro
    }

    Mazda() {
        //super(); // Llama al constructor de la clase padre (Carro)
        System.out.println("Llamando el constructor de la clase Mazda.");
    }

    public static void main(String[] args) {
        //primer uso
        Mazda mazda = new Mazda();
        mazda.getNombre();

        //segundo uso
        mazda.run(); // Llama al método run() de la clase Mazda

    }

}
