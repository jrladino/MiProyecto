package opps;

public class Triangulo extends Formas{

    private double base; // Atributo privado para la base del triángulo
    private double altura; // Atributo privado para la altura del triángulo

    // Constructor que inicializa la base y la altura
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método abstracto mostrarForma()
    @Override
    public void mostrarForma() {
        System.out.println("Soy un triángulo con base: " + base + " y altura: " + altura);
    }

    // Método para calcular el área del triángulo
    public double calcularArea() {
        return (base * altura) / 2; // Fórmula del área de un triángulo: (base * altura) / 2
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(4.0, 3.0); // Crear un objeto Triangulo con base 4.0 y altura 3.0
        triangulo.mostrarForma(); // Mostrar la forma del triángulo
        System.out.println("Area del triángulo: " + triangulo.calcularArea()); // Calcular y mostrar el área del triángulo
    }

}
