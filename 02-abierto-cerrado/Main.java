import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadoFijo ana   = new EmpleadoFijo("101", "Ana Torres", 3200000);
        EmpleadoPorHoras luis = new EmpleadoPorHoras("102", "Luis Pardo", 25000, 160);
        Practicante sara   = new Practicante("103", "Sara Gil", 1300000);
        EmpleadoPorComision marta = new EmpleadoPorComision("104", "Marta Ríos", 1500000, 20000000);

        List<Empleado> nomina = new ArrayList<>();
        nomina.add(ana);
        nomina.add(luis);
        nomina.add(sara);
        nomina.add(marta);

        GestorNomina gestor = new GestorNomina();
        gestor.cerrarMes(nomina);

        // ---- Paso L: descomente este bloque y ejecute ----
        // List<EmpleadoFijo> fijos = new ArrayList<>();
        // fijos.add(ana);
        // fijos.add(sara);
        // double bonos = 0;
        // for (EmpleadoFijo f : fijos) {
        //     bonos += f.calcularBonificacion();
        // }
        // System.out.println("Total bonificaciones: " + bonos);
    }
}
