public class EmpleadoFijo extends Empleado {
    protected double salarioBase;

    public EmpleadoFijo(String cedula, String nombre, double salarioBase) {
        super(cedula, nombre);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularPago() {
        return salarioBase;
    }

    public double calcularBonificacion() {
        return salarioBase * 0.10;
    }
}
