// Simula una conexión a MySQL: imprime la sentencia en lugar de ejecutarla.
public class RepositorioMySQL implements RepositorioNomina {

    public RepositorioMySQL() {
        System.out.println("[MySQL] Conectando a jdbc:mysql://servidor/nomina ...");
    }

    @Override
    public void insertar(String cedula, double pago) {
        System.out.println("[MySQL] INSERT INTO pagos VALUES ('" + cedula + "', " + pago + ")");
    }
}
