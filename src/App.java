import Animales.*;
import Condicionales.*;
import Herencias.*;
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

        //usa la herencia simple
        Mazda mazda = new Mazda("Mazda","3", "Rojo", 2020, "2.0L");
        mazda.moverse(mazda.getNombre(),mazda.getModelo(),mazda.getMotor()); // Output: El Mazda 3 se está moviendo... con motor 2.0L.
        mazda.detenerse(mazda.getNombre(),mazda.getModelo(),mazda.getMotor()); // Output: El Mazda 3 se ha detenido... con motor 2.0L.
        System.out.println("Nombre: " + mazda.getNombre()); // Output: Nombre: Mazda
        System.out.println("Modelo: " + mazda.getModelo()); // Output: Modelo: Mazda 3
        System.out.println("Color: " + mazda.getColor()); // Output: Color: Rojo
        System.out.println("Año: " + mazda.getAnio()); // Output: Año: 2020
        System.out.println("Motor: " + mazda.getMotor()); // Output: Motor: 2.0L
        System.out.println("Herencia Simple: " + mazda.run()); // Output: moviendo...
        System.out.println("Herencia Simple: " + mazda.stop()); // Output: detenido...

        //utliza la herencia de la clase Kia
        Kia kia = new Kia("Kia","Rio", "Azul", 2021, "1.6L");
        kia.moverse(kia.getNombre(), kia.getModelo(), kia.getMotor()); // Output: El Kia Rio se está moviendo... con motor 1.6L.
        kia.detenerse(kia.getNombre(), kia.getModelo(), kia.getMotor()); // Output: El Kia Rio se ha detenido... con motor 1.6L.
        System.out.println("Nombre: " + kia.getNombre()); // Output: Nombre: Kia
        System.out.println("Modelo: " + kia.getModelo()); // Output: Modelo: Kia Rio
        System.out.println("Color: " + kia.getColor()); // Output: Color: Azul
        System.out.println("Año: " + kia.getAnio()); // Output: Año: 2021
        System.out.println("Motor: " + kia.getMotor()); // Output: Motor: 1.6L
        //herencia simple
        System.out.println("Herencia Simple: " + kia.run()); // Output: moviendo...
        System.out.println("Herencia Simple: " + kia.stop()); // Output: detenido...

        Suzuki  suzuki = new Suzuki("Suzuki","Swift", "Verde", 2022, "1.2L");

        suzuki.moverse(); // Output: El Suzuki Swift se está moviendo... con motor 1.2L.
        suzuki.detenerse(); // Output: El Suzuki Swift se ha detenido... con motor 1.2L.

        System.out.println("Nombre: " + suzuki.getNombre()); // Output: Nombre: Suzuki
        System.out.println("Modelo: " + suzuki.getModelo()); // Output: Modelo: Suzuki Swift    
        System.out.println("Color: " + suzuki.getColor()); // Output: Color: Verde
        System.out.println("Año: " + suzuki.getAnio()); // Output: Año: 2022
        System.out.println("Motor: " + suzuki.getMotor()); // Output: Motor: 1.2L

        //herencia simple
        System.out.println("Herencia Simple: " + suzuki.run()); // Output: moviendo...
        System.out.println("Herencia Simple: " + suzuki.stop()); // Output: detenido...

        //llama al metodo unico de la clase Suzuki
        suzuki.modoSport(); // Output: El Suzuki Swift está en modo Sport.

        //herencia de la clase Renault
        Renault renault = new Renault("Renault","Cl", "Amarillo", 2023, "1.0L");
        renault.moverse(); // Output: El Renault Cl se está moviendo... con motor 1.0L.
        renault.detenerse(); // Output: El Renault Cl se ha detenido... con motor 1.0L.
        System.out.println("Nombre: " + renault.getNombre()); // Output: Nombre: Renault

        System.out.println("Modelo: " + renault.getModelo()); // Output: Modelo: Renault Cl
        System.out.println("Color: " + renault.getColor()); // Output: Color: Amarillo
        System.out.println("Año: " + renault.getAnio()); // Output: Año: 2023
        System.out.println("Motor: " + renault.getMotor()); // Output: Motor: 1.0L

        //herencia simple
        System.out.println("Herencia Simple: " + renault.run()); // Output: moviendo...
        System.out.println("Herencia Simple: " + renault.stop()); // Output: detenido...

        //llama al metodo unico de la clase Renault
        renault.modoEco(); // Output: El Renault Cl está en modo Eco.


    }

  

}
