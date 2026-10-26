// Paso S: el texto del correo es responsabilidad de Comunicaciones.
public class NotificadorCorreo {

    public void enviar(Empleado e, double pago) {
        System.out.println("Para: " + e.getNombre()
            + " | Su pago de este mes es $" + String.format("%,.0f", pago));
    }
}
