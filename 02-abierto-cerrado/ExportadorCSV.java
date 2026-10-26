// Paso S: la exportación es responsabilidad de Contabilidad, por eso vive aparte.
public class ExportadorCSV {
    private StringBuilder contenido = new StringBuilder("cedula;nombre;pago\n");

    public void agregar(Empleado e, double pago) {
        contenido.append(e.getCedula()).append(";")
                 .append(e.getNombre()).append(";")
                 .append(pago).append("\n");
    }

    public String generar() {
        return contenido.toString();
    }
}
