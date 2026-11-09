package patron.aop.adapter;

public class AOPServicioSMS {
    public void enviarSMS(String numero, String texto) {
        System.out.println("[SMS AOP] Destinatario: " + numero);
        System.out.println("[SMS AOP] Mensaje: " + texto);
    }
}
