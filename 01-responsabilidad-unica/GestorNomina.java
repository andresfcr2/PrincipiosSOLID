import java.util.List;

// Paso S: GestorNomina conserva el cálculo y coordina el cierre del mes.
// Exportar y notificar se movieron a sus propias clases.
public class GestorNomina {
    private RepositorioMySQL repositorio = new RepositorioMySQL();
    private ExportadorCSV exportador = new ExportadorCSV();
    private NotificadorCorreo notificador = new NotificadorCorreo();

    public double calcularPago(Empleado e) {
        switch (e.getTipo()) {
            case "FIJO":  return e.getSalarioBase();
            case "HORAS": return e.getHoras() * e.getTarifaHora();
            default: throw new IllegalArgumentException("Tipo desconocido: " + e.getTipo());
        }
    }

    public void cerrarMes(List<Empleado> nomina) {
        for (Empleado e : nomina) {
            double pago = calcularPago(e);
            repositorio.insertar(e.getCedula(), pago);
            notificador.enviar(e, pago);
            exportador.agregar(e, pago);
        }
        System.out.println(exportador.generar());
    }
}
