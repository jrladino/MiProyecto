import Animales.Cat;
import Animales.Dog;
import Operaciones.Division;
import Operaciones.Multiplicacion;
import Operaciones.Resta;
import Operaciones.Suma;
import Polimorfismo.Polimorfismo;

public class App {
    public static void main(String[] args) throws Exception {
        
        Dog dog = new Dog("Buddy", 5);
        System.out.println(dog.getInfo());  
        System.out.println("Sound: "+dog.makeSound());

        Cat cat = new Cat("Whiskers", 3);
        System.out.println(cat.getInfo());
        System.out.println("Sound: "+cat.makeSound());

        //Operaciones
        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplicacion multiplicacion = new Multiplicacion();
        Division division = new Division();
        System.out.println("Suma: " + suma.operar(5, 3)); // Output: 8
        System.out.println("Resta: " + resta.operar(5, 3)); // Output: 2
        System.out.println("Multiplicacion: " + multiplicacion.operar(5, 3)); // Output: 15
        System.out.println("Division: " + division.operar(5, 3)); // Output: 1
        try {
            System.out.println("Division: " + division.operar(5, 0)); // Throws exception
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // Output: No se puede dividir por cero
        }

        // Polimorfismo
        Polimorfismo polimorfismo = new Polimorfismo();
        polimorfismo.sumar(5, 3); // Output: Suma de enteros: 8
        polimorfismo.sumar(5.5, 3.2); // Output: Suma de decimales: 8.7
        polimorfismo.sumar(5, 3, 2); // Output: Suma de tres enteros: 10
    }
        
}
