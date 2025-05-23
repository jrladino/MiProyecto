package opps;

public class ClaseDeIngenieria implements Estudiante {
    private String nombre;
    private int numeroDeEstudiantes;
    private String grado;

    public ClaseDeIngenieria(String nombre, int numeroDeEstudiantes, String grado) {
        this.nombre = nombre;
        this.numeroDeEstudiantes = numeroDeEstudiantes;
        this.grado = grado;
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }

    @Override
    public void obtenerNumeroDeEstudiantes() {
        System.out.println("Número de estudiantes: " + numeroDeEstudiantes);
    }

    @Override
    public void obtenerGrado() {
        System.out.println("Grado: " + grado);
    }

    public void obtenerUniversidad() {
        System.out.println("Universidad: " + universidad);
    }

    public static void main(String[] args) {
        ClaseDeIngenieria estudiante = new ClaseDeIngenieria("Juan", 30, "Ingeniería de Sistemas");
        estudiante.mostrarNombre();
        estudiante.obtenerNumeroDeEstudiantes();
        estudiante.obtenerGrado();
        estudiante.obtenerUniversidad();
 
    }

    @Override
    public void obtenerNombreInterface() {
       
        throw new UnsupportedOperationException("Unimplemented method 'obtenerNombreInterface'");
    }


}
