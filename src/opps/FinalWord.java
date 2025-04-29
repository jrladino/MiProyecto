package opps;

public class FinalWord {

    // La palabra reservada final se utiliza para declarar una variable que no puede ser modificada.
    // En este caso, la variable "nombre" es final y no puede ser cambiada una vez asignada.
    // Esto significa que no se puede volver a asignar un nuevo valor a "nombre" después de su inicialización.
    // La palabra reservada final también se puede utilizar para declarar métodos y clases que no pueden ser sobreescritos o heredados.
    // En este caso, la clase "FinalWord" es final y no puede ser extendida por otras clases.
    // Esto significa que no se puede crear una subclase de "FinalWord".

    final int maxAge = 100; // Variable final que no puede ser modificada

    public void setAge(){
        //maxAge = 100; // Esto generará un error de compilación porque maxAge es final y no puede ser modificado
    }

    public static void main(String[] args) {
        
    }

}
