import java.util.List;

// Paso O: desaparece el switch. GestorNomina no pregunta el tipo de empleado.
public class GestorNomina {
    private RepositorioMySQL repositorio = new RepositorioMySQL();
    private ExportadorCSV exportador = new ExportadorCSV();
    private NotificadorCorreo notificador = new NotificadorCorreo();

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
