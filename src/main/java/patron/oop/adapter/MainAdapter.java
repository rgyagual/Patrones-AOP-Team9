package patron.oop.adapter;

public class MainAdapter {
    public static void main(String[] args) {
        ServicioSMS servicioSMS = new ServicioSMS();
        INotificador notificador = new NotificadorAdapter(servicioSMS);

        System.out.println("=== Adapter OOP: sistema de monitoreo y alertas ===");
        notificador.enviarNotificacion("0991234567", "Alerta: temperatura alta.");
    }
}
