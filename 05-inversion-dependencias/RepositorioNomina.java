// Paso D: GestorNomina depende de esta interfaz, no de una base de datos concreta.
public interface RepositorioNomina {
    void insertar(String cedula, double pago);
}
