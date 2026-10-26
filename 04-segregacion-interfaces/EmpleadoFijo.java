public class EmpleadoFijo extends Empleado implements Bonificable {
    protected double salarioBase;

    public EmpleadoFijo(String cedula, String nombre, double salarioBase) {
        super(cedula, nombre);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularPago() {
        return salarioBase;
    }

    @Override
    public double calcularBonificacion() {
        return salarioBase * 0.10;
    }
}
