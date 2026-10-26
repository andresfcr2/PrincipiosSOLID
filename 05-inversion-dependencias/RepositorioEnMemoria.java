import java.util.HashMap;
import java.util.Map;

// Paso D: implementación para probar sin base de datos. Guarda los pagos en un Map.
public class RepositorioEnMemoria implements RepositorioNomina {
    private Map<String, Double> pagos = new HashMap<>();

    @Override
    public void insertar(String cedula, double pago) {
        pagos.put(cedula, pago);
    }

    public double obtener(String cedula) {
        return pagos.get(cedula);
    }

    public int cantidad() {
        return pagos.size();
    }
}
