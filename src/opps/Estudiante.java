package opps;

public interface Estudiante extends PadreDeEstudiante {
    // Atributo constante de la interfaz
    public static final String universidad = "Universidad de Manizales";

    public void mostrarNombre();
    public void obtenerNumeroDeEstudiantes();
    public void obtenerGrado();
}
