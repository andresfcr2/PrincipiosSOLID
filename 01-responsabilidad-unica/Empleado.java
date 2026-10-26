public class Empleado implements Trabajador {
    protected String cedula;
    protected String nombre;
    protected String tipo;          // "FIJO" o "HORAS"
    protected double salarioBase;
    protected double tarifaHora;
    protected int horas;
    protected int diasVacaciones;

    public Empleado(String cedula, String nombre, String tipo,
                    double salarioBase, double tarifaHora, int horas) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.tipo = tipo;
        this.salarioBase = salarioBase;
        this.tarifaHora = tarifaHora;
        this.horas = horas;
    }

    public String getCedula()      { return cedula; }
    public String getNombre()      { return nombre; }
    public String getTipo()        { return tipo; }
    public double getSalarioBase() { return salarioBase; }
    public double getTarifaHora()  { return tarifaHora; }
    public int getHoras()          { return horas; }

    public double calcularBonificacion() {
        return salarioBase * 0.10;
    }

    public void registrarHoras(int horas)   { this.horas += horas; }
    public double liquidarPrestaciones()    { return salarioBase * 0.0833; }
    public void asignarVacaciones(int dias) { this.diasVacaciones += dias; }
}
