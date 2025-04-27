import Animales.Cat;
import Animales.Dog;
import Condicionales.*;
import Operaciones.*;
import Polimorfismo.Polimorfismo;
import StaticClass.ClaseEstatica;

public class App {
    public static void main(String[] args) throws Exception {
        
        Dog dog = new Dog("Buddy","Pitbull", 5, 30);
        System.out.println("Dog Info: ");
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

        System.out.println("Usando la función de suma:");
        System.out.println("Resultado: " + suma.operar(10, 20)); // Output: 30


        String text = "Hola";
        String text2 = "Mundo";
        int number = 100;
        int number2 = 200;    
     
        System.out.println(number + number2 + text + text2); // Output: 300HolaMundo
        System.out.println(text + text2 + number + number2); // Output: HolaMundo100200

        CondicionalSi condicionalSi = new CondicionalSi();
        System.out.println(condicionalSi.condicionalSi(5)); // Output: El número es positivo

        CicloFor condicionalFor = new CicloFor();
        condicionalFor.printNumbers(5); // Output: 1, 2, 3, 4, 5

        //ejemplo de ciclo while
        CiclosWhile ciclosWhile = new CiclosWhile();
        ciclosWhile.printNumbers(5); // Output: 1, 2, 3, 4, 5
        //ejemplo de ciclo do while
        ciclosWhile.printNumbers(10, 5); // Output: 5, 6, 7, 8, 9, 10
        
        //ejemplo de ciclo for each
        CicloForEach cicloForEach = new CicloForEach();
        String[] names = {"Alice", "Bob", "Charlie"};
        cicloForEach.printNames(names); // Output: Alice, Bob, Charlie
        //ejemplo de ciclo for each con numeros 
        int[] numbersArray = {1, 2, 3, 4, 5};
        cicloForEach.printNumbers(numbersArray); // Output: 1, 2, 3, 4, 5


        //ahora vamos a usar la clase estaticas
        //crea un objeto de la clase estaticas
        ClaseEstatica objeto = new ClaseEstatica(5, 10); // Llama al constructor con dos parámetros
        //llama a los metodos estaticos
        ClaseEstatica.metodoEstatico1(); // Llama al método estático 1
        ClaseEstatica.metodoEstatico2("Juan"); // Llama al método estático 2
        ClaseEstatica.metodoEstatico3(15, 20); // Llama al método estático 3
        //llama a los metodos no estaticos
        System.out.println("Resultado del método no estático 1x: " + objeto.metodoNoEstatico1()); // Llama al método no estático 1
        System.out.println("Resultado del método no estático 2x: " + objeto.metodoNoEstatico2("Juan")); // Llama al método no estático 2

    }

  

}
