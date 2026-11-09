package patron.oop.adapter;

public class NotificadorAdapter implements INotificador {
    private final ServicioSMS servicioSMS;

    public NotificadorAdapter(ServicioSMS servicioSMS) {
        this.servicioSMS = servicioSMS;
    }

    @Override
    public void enviarNotificacion(String destinatario, String mensaje) {
        servicioSMS.enviarSMS(destinatario, mensaje);
    }
}
