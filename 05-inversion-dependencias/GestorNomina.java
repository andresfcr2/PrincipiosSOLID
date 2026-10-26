import java.util.List;

// Paso D: GestorNomina recibe el repositorio por el constructor.
// No sabe si detrás hay MySQL, un archivo o un Map en memoria.
public class GestorNomina {
    private RepositorioNomina repositorio;
    private ExportadorCSV exportador = new ExportadorCSV();
    private NotificadorCorreo notificador = new NotificadorCorreo();

    public GestorNomina(RepositorioNomina repositorio) {
        this.repositorio = repositorio;
    }

    public void cerrarMes(List<Empleado> nomina) {
        for (Empleado e : nomina) {
            double pago = e.calcularPago();
            repositorio.insertar(e.getCedula(), pago);
            notificador.enviar(e, pago);
            exportador.agregar(e, pago);
        }
        System.out.println(exportador.generar());
    }
}
