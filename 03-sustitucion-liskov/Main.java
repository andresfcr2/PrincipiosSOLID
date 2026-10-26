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

        List<Bonificable> conBono = new ArrayList<>();
        conBono.add(ana);
        // conBono.add(sara);   // no compila: Practicante no es Bonificable

        double bonos = 0;
        for (Bonificable b : conBono) {
            bonos += b.calcularBonificacion();
        }
        System.out.println("Total bonificaciones: " + bonos);
    }
}
