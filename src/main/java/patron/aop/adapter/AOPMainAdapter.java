package patron.aop.adapter;

public class AOPMainAdapter {
    public static void main(String[] args) {
        AOPServicioSMS servicioSMS = new AOPServicioSMS();
        // La conversión depende de la interfaz incorporada por AspectJ.
        IAOPNotificador notificador = (IAOPNotificador) servicioSMS;

        System.out.println("=== Adapter AOP: sistema de monitoreo y alertas ===");
        System.out.println("Misma instancia: " + (servicioSMS == notificador));
        notificador.enviarNotificacion("0991234567", "Alerta: temperatura alta.");
    }
}
