public class Contratista implements Trabajador {
    private String nit;
    private String nombre;
    private double valorHora;
    private int horas;

    public Contratista(String nit, String nombre, double valorHora) {
        this.nit = nit;
        this.nombre = nombre;
        this.valorHora = valorHora;
    }

    public void registrarHoras(int horas) { this.horas += horas; }

    public double liquidarPrestaciones() {
        return 0;   // un contratista no tiene prestaciones
    }

    public void asignarVacaciones(int dias) {
        // un contratista no tiene vacaciones
    }

    public double valorFactura() { return horas * valorHora; }
}
