package ArreglosAndStringOptions;

public class Arreglo {

    private int[] arreglo;
    private int size;

    public Arreglo(int size) {
        this.size = size;
        this.arreglo = new int[size];
    }

    public void setElemento(int index, int value) {
        if (index >= 0 && index < size) {
            arreglo[index] = value;
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public int getElemento(int index) {
        if (index >= 0 && index < size) {
            return arreglo[index];
        } else {
            System.out.println("Índice fuera de rango.");
            return -1; // Valor por defecto
        }
    }

    public int getSize() {
        return size;
    }

    //implementa un metodo que reciba por parametro un arreglo y luego llama el metodo en el main
    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento en índice " + i + ": " + arreglo[i]);
        }
    }

    //implementa un metodo que reciba un arreglo de enteros y retorne el menor elemento
    public int encontrarMenorElemento(int[] arreglo) {
        if (arreglo.length == 0) {
            System.out.println("El arreglo está vacío.");
            return -1; // Valor por defecto
        }
        int menor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < menor) {
                menor = arreglo[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        Arreglo arreglo = new Arreglo(5);
        
        // Llenar el arreglo mediante un for que genere numeros aleatorios
        for (int i = 0; i < arreglo.getSize(); i++) {
            arreglo.setElemento(i, (int) (Math.random() * 100)); // Genera números aleatorios entre 0 y 99
        }
        // Imprimir los elementos del arreglo
        for (int i = 0; i < arreglo.getSize(); i++) {
            System.out.println("Elemento en índice " + i + ": " + arreglo.getElemento(i));
        }

        // Llamada al método imprimirArreglo
        int[] arregloImprimir = {10, 20, 30, 40, 50};
        arreglo.imprimirArreglo(arregloImprimir);

        // Llamada al método encontrarMenorElemento
        System.out.print("El número menor es: "+ arreglo.encontrarMenorElemento(arregloImprimir));
    }
}
