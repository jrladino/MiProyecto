package Arreglos;

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

    public static void main(String[] args) {
        Arreglo arreglo = new Arreglo(5);
        arreglo.setElemento(0, 10);
        arreglo.setElemento(1, 20);
        arreglo.setElemento(2, 30);
        arreglo.setElemento(3, 40);
        arreglo.setElemento(4, 50);

        for (int i = 0; i < arreglo.getSize(); i++) {
            System.out.println("Elemento en índice " + i + ": " + arreglo.getElemento(i));
        }

        // Llamada al método imprimirArreglo
        int[] arregloImprimir = {10, 20, 30, 40, 50};
        arreglo.imprimirArreglo(arregloImprimir);
    }
}
