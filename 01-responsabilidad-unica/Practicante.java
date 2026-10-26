public class Practicante extends Empleado {

    public Practicante(String cedula, String nombre, double apoyoSostenimiento) {
        super(cedula, nombre, "FIJO", apoyoSostenimiento, 0, 0);
    }

    @Override
    public double calcularBonificacion() {
        throw new UnsupportedOperationException(
            "Los practicantes no reciben bonificación");
    }
}
