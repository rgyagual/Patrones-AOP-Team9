package patron.aop.adapter;

public aspect AOPNotificadorAdapter {
    declare parents: AOPServicioSMS implements IAOPNotificador;

    public void AOPServicioSMS.enviarNotificacion(String destinatario, String mensaje) {
        this.enviarSMS(destinatario, mensaje);
    }
}
