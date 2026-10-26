import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> nomina = new ArrayList<>();
        nomina.add(new Empleado("101", "Ana Torres", "FIJO", 3200000, 0, 0));
        nomina.add(new Empleado("102", "Luis Pardo", "HORAS", 0, 25000, 160));
        nomina.add(new Practicante("103", "Sara Gil", 1300000));

        GestorNomina gestor = new GestorNomina();
        for (Empleado e : nomina) {
            double pago = gestor.calcularPago(e);
            gestor.guardar(e, pago);
            gestor.enviarDesprendible(e, pago);
        }
        System.out.println(gestor.exportarCSV(nomina));
    }
}
