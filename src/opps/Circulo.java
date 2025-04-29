package opps;

public class Circulo extends Formas {

    Formas x = new Formas() { // Instancia de la clase abstracta Formas
        @Override
        public void mostrarForma() {
            System.out.println("Soy una forma abstracta.");
        }
    };
    private double radio; // Atributo privado para el radio del círculo

    // Constructor que inicializa el radio
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método abstracto mostrarForma()
    @Override
    public void mostrarForma() {
        System.out.println("Soy un círculo con radio: " + radio);
    }

    // Método para calcular el área del círculo
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2); // Fórmula del área de un círculo: π * r^2
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0); // Crear un objeto Circulo con radio 5.0
        circulo.mostrarForma(); // Mostrar la forma del círculo
        System.out.println("Area del círculo: " + circulo.calcularArea()); // Calcular y mostrar el área del círculo
    }

}
