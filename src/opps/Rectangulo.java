package opps;

public class Rectangulo extends Formas {

    private double base; // Atributo privado para la base del rectángulo
    private double altura; // Atributo privado para la altura del rectángulo

    // Constructor que inicializa la base y la altura
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método abstracto mostrarForma()
    @Override
    public void mostrarForma() {
        System.out.println("Soy un rectángulo con base: " + base + " y altura: " + altura);
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return base * altura; // Fórmula del área de un rectángulo: base * altura
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(4.0, 3.0); // Crear un objeto Rectangulo con base 4.0 y altura 3.0
        rectangulo.mostrarForma(); // Mostrar la forma del rectángulo
        System.out.println("Area del rectángulo: " + rectangulo.calcularArea()); // Calcular y mostrar el área del rectángulo
    }
}
