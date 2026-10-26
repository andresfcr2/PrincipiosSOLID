// Paso L: Practicante ya no extiende EmpleadoFijo.
// Sigue siendo un Empleado y se paga igual, pero no promete una bonificación que no tiene.
public class Practicante extends Empleado {
    private double apoyoSostenimiento;

    public Practicante(String cedula, String nombre, double apoyoSostenimiento) {
        super(cedula, nombre);
        this.apoyoSostenimiento = apoyoSostenimiento;
    }

    @Override
    public double calcularPago() {
        return apoyoSostenimiento;
    }
}
