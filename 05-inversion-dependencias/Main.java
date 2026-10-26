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

        // Paso D: Main es el único que decide qué repositorio se usa.
        // En producción: new GestorNomina(new RepositorioMySQL());
        RepositorioEnMemoria memoria = new RepositorioEnMemoria();
        GestorNomina gestor = new GestorNomina(memoria);

        gestor.cerrarMes(nomina);

        List<Bonificable> conBono = new ArrayList<>();
        conBono.add(ana);
        // conBono.add(sara);   // no compila: Practicante no es Bonificable

        double bonos = 0;
        for (Bonificable b : conBono) {
            bonos += b.calcularBonificacion();
        }
        System.out.println("Total bonificaciones: " + bonos);

        // Paso I: Contratista y EmpleadoPorHoras no tienen parentesco,
        // pero los dos se pueden tratar como ConHoras.
        Contratista juan = new Contratista("900123", "Juan Rojas", 40000);
        List<ConHoras> registranHoras = new ArrayList<>();
        registranHoras.add(juan);
        registranHoras.add(luis);
        for (ConHoras c : registranHoras) {
            c.registrarHoras(20);
        }
        System.out.println("Factura de " + juan.getNombre() + ": $" + juan.valorFactura());

        // Paso D: se puede comprobar lo guardado sin tener una base de datos.
        System.out.println("Pagos guardados: " + memoria.cantidad());
        System.out.println("Pago guardado de Ana: " + memoria.obtener("101"));
    }
}
