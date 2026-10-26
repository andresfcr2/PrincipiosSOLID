public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;

    public EmpleadoPorHoras(String cedula, String nombre, double tarifaHora, int horas) {
        super(cedula, nombre);
        this.tarifaHora = tarifaHora;
        this.horas = horas;
    }

    @Override
    public double calcularPago() {
        return horas * tarifaHora;
    }
}
