// Paso I: Contratista implementa solo lo que le aplica.
// Ya no escribe métodos vacíos para prestaciones ni vacaciones.
public class Contratista implements ConHoras {
    private String nit;
    private String nombre;
    private double valorHora;
    private int horas;

    public Contratista(String nit, String nombre, double valorHora) {
        this.nit = nit;
        this.nombre = nombre;
        this.valorHora = valorHora;
    }

    public String getNombre() { return nombre; }

    @Override
    public void registrarHoras(int horas) { this.horas += horas; }

    public double valorFactura() { return horas * valorHora; }
}
