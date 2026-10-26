// Ahora extiende EmpleadoFijo. Este es el síntoma que se corrige en el paso L.
public class Practicante extends EmpleadoFijo {

    public Practicante(String cedula, String nombre, double apoyoSostenimiento) {
        super(cedula, nombre, apoyoSostenimiento);
    }

    @Override
    public double calcularBonificacion() {
        throw new UnsupportedOperationException(
            "Los practicantes no reciben bonificación");
    }
}
