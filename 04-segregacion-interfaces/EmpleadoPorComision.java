// Paso O: tipo nuevo agregado sin modificar ninguna clase existente.
public class EmpleadoPorComision extends Empleado {
    private double basico;
    private double ventas;

    public EmpleadoPorComision(String cedula, String nombre, double basico, double ventas) {
        super(cedula, nombre);
        this.basico = basico;
        this.ventas = ventas;
    }

    @Override
    public double calcularPago() {
        return basico + ventas * 0.05;
    }
}
