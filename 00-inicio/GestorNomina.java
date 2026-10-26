import java.util.List;

public class GestorNomina {
    private RepositorioMySQL repositorio = new RepositorioMySQL();

    public double calcularPago(Empleado e) {
        switch (e.getTipo()) {
            case "FIJO":  return e.getSalarioBase();
            case "HORAS": return e.getHoras() * e.getTarifaHora();
            default: throw new IllegalArgumentException("Tipo desconocido: " + e.getTipo());
        }
    }

    public void guardar(Empleado e, double pago) {
        repositorio.insertar(e.getCedula(), pago);
    }

    public String exportarCSV(List<Empleado> nomina) {
        StringBuilder sb = new StringBuilder("cedula;nombre;pago\n");
        for (Empleado e : nomina) {
            sb.append(e.getCedula()).append(";")
              .append(e.getNombre()).append(";")
              .append(calcularPago(e)).append("\n");
        }
        return sb.toString();
    }

    public void enviarDesprendible(Empleado e, double pago) {
        System.out.println("Para: " + e.getNombre()
            + " | Su pago de este mes es $" + String.format("%,.0f", pago));
    }
}
