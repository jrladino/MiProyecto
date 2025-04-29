package opps;

public abstract class Formas {

    public abstract void mostrarForma(); // Método abstracto que debe ser implementado por las subclases

    public void desplegarNombre() { // Método concreto que puede ser utilizado por las subclases
        System.out.println("De la clase forma.");
    }

}
