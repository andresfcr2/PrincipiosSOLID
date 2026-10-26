// Paso O: Empleado es abstracta. Cada subclase sabe calcular su propio pago.
public abstract class Empleado implements Trabajador {
    protected String cedula;
    protected String nombre;
    protected int horas;
    protected int diasVacaciones;

    public Empleado(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getCedula() { return cedula; }
    public String getNombre() { return nombre; }

    public abstract double calcularPago();

    public void registrarHoras(int horas)   { this.horas += horas; }
    public double liquidarPrestaciones()    { return calcularPago() * 0.0833; }
    public void asignarVacaciones(int dias) { this.diasVacaciones += dias; }
}
